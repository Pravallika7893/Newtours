package com.qa.Testscript;

import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TC01_Registration extends Baseclass {
	
	@Test(groups= {"Regression","Master"})
	public void verify_account_registration() throws Exception {
		
		logger.info("******* Starting TC01_RegistrationTest *******");
		
	try {
	
	Np.getRegister().click();
	
	logger.info("******* enter the details ...........");
	
    Np.getfname().sendKeys(randomString().toUpperCase());
    Np.getLname().sendKeys(randomString().toUpperCase());
	Np.getphone().sendKeys(randomNumber());
    Np.getemail().sendKeys(randomString()+"@gmail.com");
	Np.getaddress().sendKeys(randomAlphaNumeric());
	Np.getcity().sendKeys(randomString());
	Np.getstate().sendKeys(randomString());
	Np.getPostalcode().sendKeys(randomNumber());
    Np.getcountry().selectByVisibleText("FINLAND");
    String same = randomAlphaNumeric();  
    Np.getUsername().sendKeys(same);
    Np.getpasword().sendKeys(same);
	Np.getconfirmpswd().sendKeys(same);
	Np.getsubmit().click();
    Np.getsignin().click();
    
    logger.info("******* login the details ...........");
    
	Np.getUName().sendKeys(same);
	Np.getpswd().sendKeys(same);
	Np.getsubmitbtn().click();
	
	
	ts.getScreenshotAs(OutputType.FILE);
	}
	catch(Exception e) {
		logger.error("Test failed");
		logger.debug("Debug logs...");
		Assert.fail();
	}
	logger.info("*****  finished the TC01_RegistrationTest");
					
	}

}
