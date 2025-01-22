package com.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewtourRegistrationPage {
	
	WebDriver driver;
	@FindBy(xpath="(//td[@class=\"mouseOut\"])[2]")
	WebElement register;
	public WebElement getRegister() throws InterruptedException {
		Thread.sleep(2000);
	//register.click();
	return register;
		
	}
	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement txtfname;
	public  WebElement getfname() {
		//fname.sendKeys("pravallika");
		return txtfname;
	
	}
	@FindBy(xpath="//input[@name=\"lastName\"]")
	WebElement txtLname;
	public  WebElement getLname() {
		return txtLname;
	
	}
	
	@FindBy(xpath="//input[@name=\"phone\"]")
	WebElement txtphone;
	public  WebElement getphone() {
		return txtphone;
	
	}	
   @FindBy(xpath="//input[@name=\"userName\"]")
	WebElement txtemail;
	public  WebElement getemail() {
		return txtemail;
	
	}
	
	
	@FindBy(xpath="//input[@name=\"address1\"]")
	WebElement txtaddress  ;
	public  WebElement getaddress () {
		return txtaddress ;
	}
	
	@FindBy(xpath="//input[@name=\"city\"]")
	WebElement txtcity;
	public  WebElement getcity() {
		return txtcity;
	}
	
	@FindBy(xpath="//input[@name=\"state\"]")
	WebElement txtstate;
	public  WebElement getstate() {
		return txtstate;
	}	

	@FindBy(xpath="//input[@name=\"postalCode\"]")
	WebElement Postalcode;
	public  WebElement getPostalcode(){
		return Postalcode;
	}	
	
	@FindBy(xpath="//select[@name=\"country\"]")
	WebElement country;
	
	public  Select getcountry(){
		Select sel = new Select(country);
		return sel ;
	}
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement txtUsername;
	public  WebElement getUsername(){
		return txtUsername;
	}
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement txtPassword;
	public  WebElement getpasword(){
		return txtPassword;
	}	
	
	@FindBy(xpath="//input[@name=\"confirmPassword\"]")
	WebElement txtconfirmpswd;
	public  WebElement getconfirmpswd(){
		return txtconfirmpswd;
	}	
	
	@FindBy(xpath="//input[@name=\"submit\"]")
	WebElement submit ;
	public  WebElement getsubmit(){
		return submit;
	}	
	
	@FindBy(xpath="//a[normalize-space()='sign-in']")
	WebElement signin ;
	public  WebElement getsignin(){
		return signin;
	}
	@FindBy(name="userName")
	WebElement txtUName ;
	public  WebElement getUName(){
		return txtUName;
	}	
	
	@FindBy(name="password")
	WebElement txtpswd ;
	public  WebElement getpswd(){
		return txtpswd;
	}	
	
	@FindBy(name="submit")
	WebElement submitbtn ;
	public  WebElement getsubmitbtn(){
		return submitbtn;
	}
	
	@FindBy(linkText ="Flights")
	WebElement clkflightpage;
	public  WebElement getflightpage(){
		return clkflightpage;
	}
	
	@FindBy(xpath="//input[@name=\"tripType\"]")
	List<WebElement> radiobtn;
	public  List<WebElement> getradiobtn(){
		return radiobtn;
	}
	
	@FindBy(css="input[value='roundtrip']")
	WebElement  rbutton;
	public  WebElement getrbutton(){
		return rbutton ;
	}	
	
	@FindBy(xpath="//input[@value='oneway']")
	WebElement obutton;
	public  WebElement getobutton(){
		return obutton ;
	}
	@FindBy(name="passCount")
	WebElement Dropdown;
	public  Select getDropdown(){
		Select selec = new Select(Dropdown);
		return selec;
	}
	@FindBy(name="fromPort")
	WebElement Departure;
	public Select getDeparture(){
		Select s1 = new Select(Departure);
		return s1;
	}	
	
	@FindBy(name="fromMonth")
	WebElement month;
	public  Select getmonth(){
		Select s2 = new Select(month);
		return s2;
	}
	
	@FindBy(name="fromDay")
	WebElement day;
	public  Select getday(){
		Select s3 = new Select(day);
		return s3;
	}	
	
	@FindBy(name="toPort")
	 WebElement Arriving ;
	public  Select getArriving(){
		Select s4 = new Select(Arriving);
		return s4;
	}	
	
	@FindBy(name="toMonth")
	WebElement months;
	public  Select getmonths(){
		Select s5 = new Select(months);
		return s5;
	}
	

	@FindBy(name="toDay")
	WebElement days ;
	public  Select getdays(){
		Select s6 = new Select(days);
		return s6;
	}
	
	@FindBy(name="servClass")
	List<WebElement> prefebtn;
	
	public  List<WebElement> getprefebtn() {
		return prefebtn;
	}
	

	@FindBy(xpath="//select[@name=\"airline\"]")
	WebElement airline;
	public  Select getairline(){
		Select select = new Select(airline);
		
		return select ;
	}

	
	@FindBy(xpath="//input[@name=\"findFlights\"]")
	WebElement contin;
	public  WebElement getcontin(){
		return contin;
	}
	@FindBy(xpath="//img[@src=\"images/home.gif\"]")
	WebElement btn;
	public  WebElement getbtn(){
		return btn;
	}
	
	public  NewtourRegistrationPage(WebDriver rdriver)
	{
		 this.driver= rdriver;
		 PageFactory.initElements(rdriver,this); 
	}



}
