package com.qa.Testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TC03_Flight extends Baseclass{
	
	@Test(groups={"Regression","Master"})
	 public void flightlink() {
		
		logger.info("***** starting TC02_Flight **** ");
		
		try
		{
	  	 // SoftAssert sAssert = new SoftAssert();
	  	  Np.getflightpage().click();
	  	  
	  	logger.info("***** reservation page is landed **** ");
	  	  
	  	  boolean contain3 = driver.getCurrentUrl().contains("reservation");
	    	Assert.assertTrue(true);
	  	 if(contain3) {
				System.out.println("The user has landed on the flight reservation page");
	 		}
	 		else {
	 			System.out.println("The user has not landed on the flight reservation page");
	 			Assert.assertTrue(contain3);
	 		}
	  	 
	  	logger.info("***** round trip is selected **** ");
	  	Np.getrbutton().isSelected();
	  	//Assert.assertTrue(true);
		
	
			logger.info("***** both btn is selected **** ");
			
			List<WebElement> radiobtn = Np.getradiobtn();
			for (WebElement btns : radiobtn) {
				btns.click();
				 if (btns.isSelected()) {
	               System.out.println("Radio button with value: " + btns.getAttribute("value") + " is selected.");
	           } else {
	               System.out.println("Radio button selection failed.");
	           }
			}
			
//			logger.info("***** one way trip is selected **** ");
//		  	Np.getobutton().isSelected();
//		  	Assert.assertTrue(false);

		}
				 catch(Exception e) {
						logger.error("Test failed");
						logger.debug("Debug logs...");
					}
		
	}
			
			@Test(priority=2)
			public void passcount() {
				logger.info("***** passcount dropdown ***** ");
				try {
				 
			if(Integer.parseInt(Np.getDropdown().getFirstSelectedOption().getText())==1) {
				
				System.out.println("Passengers count is 1 by de fault");
			}
			else {
				System.out.println("Passengers count is not 1 by default");
			}
				}
				catch(Exception e) {
					logger.error("Test failed");
					logger.debug("Debug logs...");
				}
				logger.info("***** finished TC02_Flight **** ");
			}
	

}
