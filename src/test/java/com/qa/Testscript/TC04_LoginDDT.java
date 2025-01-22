package com.qa.Testscript;

import org.testng.annotations.Test;

import com.qa.Pages.NTPages;
import org.testng.Assert;

public class TC04_LoginDDT extends Baseclass{
	
	@Test(groups={"Sanity","Master"})
	public void logintest() {
		
       logger.info("******* Starting TC03_LoginDDT *******");
		
		try {
		//Nt.getsignin().click();
		Nt.gettxtUName().sendKeys(p.getProperty("username"));
		Thread.sleep(1000);
		Nt.gettxtpswd().sendKeys(p.getProperty("password"));
		Thread.sleep(1000);
		Nt.getsubmitbtn().click();
		
		
		
		NTPages obj = new NTPages(driver);
		boolean targetpage = obj.isNTPagesExists();
		
		
		if(targetpage) {
			System.out.println("Login is successfull");
		}
		else {
			System.out.println("Login isn't successfull");

		}
		
		Assert.assertTrue(targetpage);
		
		}
		catch(Exception e) {
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.fail();
		}
		logger.info("***** submit the login the TC03_LoginDDT ******");
		
		Nt.getsignoff().click();
		
		logger.info("***** Finished TC03_LoginDDT ******");
	}


}
