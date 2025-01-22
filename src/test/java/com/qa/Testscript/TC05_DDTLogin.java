package com.qa.Testscript;

import org.testng.annotations.Test;

import com.qa.Pages.NTPages;
import com.qa.Utility.DataProviders;

import org.testng.Assert;

public class TC05_DDTLogin extends Baseclass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriven")
	public void verify_DDTLogin(String username,String password,String exp) {
		
        logger.info("******* Starting TC03_LoginDDT *******");
		
		try {
			
		//Nt.getsignin().click();
		//Thread.sleep(1000);
		Nt.gettxtUName().sendKeys(username);
		Thread.sleep(1000);
		Nt.gettxtpswd().sendKeys(password);
		Thread.sleep(1000);
		Nt.getsubmitbtn().click();
		
		
		
		NTPages obj = new NTPages(driver);
		boolean targetpage = obj.isNTPagesExists();
		Assert.assertTrue(targetpage);
		
		if(targetpage) {
			System.out.println("Login is successfull");
		}
		else {
			System.out.println("Login isn't successfull");

		}
		
		if(exp.equalsIgnoreCase("valid")) {
			
			if(targetpage==true) {
				obj.getsignoff().click();
				Assert.assertTrue(true);
				
				
			}
			else {
				Assert.assertTrue(false);
			}
		}
		if(exp.equalsIgnoreCase("invalid")) {
			if(targetpage==true) {
				obj.getsignoff().click();
				Assert.assertTrue(false);
				
				
			}
			else {
				Assert.assertTrue(true);
			}
			
		}

		
	}
		catch(Exception e) {
			logger.error("Test failed");
			//logger.debug("Debug logs...");
			Assert.fail();
		}
//		logger.info("***** submit the login the TC03_LoginDDT ******");
		
		//Nt.getsignoff().click();
		
		logger.info("***** Finished TC03_LoginDDT ******");
	}
		
	}
	

