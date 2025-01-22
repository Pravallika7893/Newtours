package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NTPages {
	
WebDriver driver;
	
	@FindBy(xpath="//td[@class=\"mouseOver\"]")
	WebElement signin;
	public  WebElement getsignin(){
		return signin;
	}	
	
	@FindBy(name="userName")
	WebElement txtUName ;
	public  WebElement gettxtUName(){
		return txtUName;
	}	
	
	@FindBy(name="password")
	WebElement txtpswd ;
	public  WebElement gettxtpswd(){
		return txtpswd;
	}	
	
	@FindBy(name="submit")
	WebElement submitbtn ;
	public  WebElement getsubmitbtn(){
		return submitbtn;
	}
	
	@FindBy(xpath="//a[normalize-space()=\"SIGN-OFF\"]")
	WebElement signoff ;
	public  WebElement getsignoff(){
		return signoff;
	}
	
	@FindBy(xpath="//h3[normalize-space()=\"Login Successfully\"]")
	WebElement loginsuccess;
	public  boolean isNTPagesExists(){
		
		try {
			return(loginsuccess.isDisplayed());
		}
		catch(Exception e) {
			
		}
		return false;
	
	}
	//a[normalize-space()="SIGN-OFF"]
	
	public  NTPages(WebDriver rdriver)
	{
		 this.driver= rdriver;
		 PageFactory.initElements(rdriver,this); 
	}



}
