package com.qa.Testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TC07_Preferences extends Baseclass {
	
	@Test(groups= {"Regression","Master"})
    public void preferences() {
		logger.info("***** starting TC06_Preference **** ");
		try {
  	  Np.getflightpage().click();
  	  
  	  List<WebElement> prefebtn=Np.getprefebtn();
		for (WebElement ele : prefebtn) {  			
			ele.click();
			 if (ele.isSelected()) {
                System.out.println("Radio button with value: " + ele.getAttribute("value") + " is selected.");
            } else {
                System.out.println("Radio button selection failed.");
            }
			
		}

		Np.getairline().selectByVisibleText("Blue Skies Airlines");
		
		  List<WebElement> options = Np.getairline().getOptions();
	      // Print each option text
	      System.out.println("Dropdown Options:");
	      for (WebElement option : options) {
	          System.out.println(option.getText());
			
		}
		}
		catch(Exception e) {
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.fail();
		}
	    
		Np.getcontin().click();
		Np.getbtn().click();
		logger.info("***** finished TC06_Preference **** ");
		}
	
	
}



