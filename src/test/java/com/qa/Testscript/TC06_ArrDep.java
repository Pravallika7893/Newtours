package com.qa.Testscript;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;


public class TC06_ArrDep extends Baseclass{
	
	@Test(priority=1,groups={"regression","Master"})
    public void Departurelink() {
		
		logger.info("***** Starting Departure **** ");
		try {
  	  Np.getflightpage().click();
		Np.getDeparture().selectByVisibleText("London");
		  List<WebElement> opt = Np.getDeparture().getOptions();
	      // Print each option text
	      System.out.println("Dropdown Options:");
	      for (WebElement option : opt) {
	          System.out.println(option.getText());
	      }
	      ts.getScreenshotAs(OutputType.FILE);
			Np.getmonth().selectByVisibleText("February");
			  List<WebElement> opti = Np.getmonth().getOptions();
		      // Print each option text
		      System.out.println("Dropdown Options:");
		      for (WebElement options : opti) {
		          System.out.println(options.getText());
		      }
		      Np.getday().selectByValue("2");
		}
		catch(Exception e) {
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.fail();
			
		}
		logger.info("***** Finished Departure *****");
		}

	@Test(priority=2,groups={"regression","Master"})
	   public void Arriving() {
		logger.info("***** starting Arriving **** ");

	  	  Np.getflightpage().click();
	 	  Np.getArriving().selectByVisibleText("Paris");
	 	  Np.getmonths().selectByVisibleText("February");
	 	  Np.getdays().selectByValue("12");
	  	  
	    boolean cmp = (Np.getDeparture( )== Np.getArriving());
			
			if(!cmp) {
				System.out.println("Default value in the depending from and returning select box are same.");
				
			}
			else {
				System.out.println("Default value in the depending from and returning select box are not same.");
			}
			logger.info("***** finished Arriving **** ");
	}
	
}
