package com.qa.Testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTJavacode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
 //Register contact information
		driver.findElement(By.xpath("(//td[@class=\"mouseOut\"])[2]")).click();
		
		WebElement Fname = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
		Fname.sendKeys("prava");
		WebElement Lname = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
		Lname.sendKeys("llika");
		WebElement phone = driver.findElement(By.xpath("//input[@name=\"phone\"]"));
		phone.sendKeys("1234567891");
		WebElement email = driver.findElement(By.xpath("//input[@name=\"userName\"]"));
		email.sendKeys("abc@gmail.com");
		
 //mailing informations
		
		WebElement address = driver.findElement(By.xpath("//input[@name=\"address1\"]"));
		address.sendKeys("ppm street,ppm");
		WebElement city = driver.findElement(By.xpath("//input[@name=\"city\"]"));
		city.sendKeys("ppm");
		WebElement state = driver.findElement(By.xpath("//input[@name=\"state\"]"));
		state.sendKeys("andhrapradesh");
		WebElement postalcode = driver.findElement(By.xpath("//input[@name=\"postalCode\"]"));
		postalcode.sendKeys("12345");
		WebElement country = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select sel = new Select(country);
		sel.selectByVisibleText("FINLAND");
		
		
 // user informations
			
		WebElement username = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		username.sendKeys("mercury");
		
		WebElement pswd = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pswd.sendKeys("mercury");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", pswd);
		WebElement cpswd = driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]"));
		cpswd.sendKeys("mercury");
		WebElement submit = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
		submit.click();
		
		// login the page
		driver.findElement(By.xpath("//a[normalize-space()='sign-in']")).click();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		
		if(driver.findElement(By.tagName("h3")).getText().contains("Login Successfully")) {
			System.out.println("Login Successfully");
		}
		else {
			System.out.println("Login is not successfully");
		}
	
		//flight page land
		
		driver.findElement(By.linkText("Flights")).click();
		if(driver.getCurrentUrl().contains("reservation")) {
		   System.out.println("The user has landed on the flight reservation page");
		}
		else {
			System.out.println("The user has not landed on the flight reservation page");
		}
		// radiobtn
		
	    WebElement rbutton = driver.findElement(By.cssSelector("input[value='roundtrip']"));
		boolean selectState = rbutton.isSelected();
		if(selectState) {
			System.out.println("Round trip radio button is selected by default");
		}
		else {
			System.out.println("Round trip radio button is not selected by default");
		}
				

//				WebElement rabutton = driver.findElement(By.xpath("//input[@value='oneway']"));
//				boolean selectState1 = rabutton.isSelected();
//				if(selectState1) {
//					System.out.println("Round trip radio button is selected by default");
//				}
//				else {
//					System.out.println("Round trip radio button is not selected by default");
//				}
			
		List<WebElement> radiobtn =driver.findElements(By.xpath("//input[@name=\"tripType\"]"));
		for (WebElement btns : radiobtn) {
			btns.click();
			 if (btns.isSelected()) {
                 System.out.println("Radio button with value: " + btns.getAttribute("value") + " is selected.");
             } else {
                 System.out.println("Radio button selection failed.");
             }
			
		}
				 
				//dropdown

		WebElement dropdown = driver.findElement(By.name("passCount"));
		Select s = new Select(dropdown);
		s.selectByValue("3");
		if(Integer.parseInt(s.getFirstSelectedOption().getText())==3) {
			System.out.println("Passengers count is 1 by de fault");
		}
		else {
			System.out.println("Passengers count is not 1 by default");
		}
		
		
		
		List<WebElement>Departure = driver.findElements(By.name("fromPort"));
		System.out.println("List of countriesnpresent in departing:");
		
		for(WebElement item:Departure) {
			System.out.println(item.getText());
			Select s1 = new Select(item);
			s1.selectByVisibleText("Paris");
		}
		List<WebElement>month = driver.findElements(By.name("fromMonth"));
		System.out.println("List of month present in departing:");
		
		for(WebElement items:month) {
			System.out.println(items.getText());
			Select s2 = new Select(items);
			s2.selectByVisibleText("February");

		}
		
		List<WebElement>day = driver.findElements(By.name("fromDay"));
		System.out.println("List of days present in departing:");
		
		for(WebElement day1:day) {
			System.out.println(day1.getText());
			Select s3 = new Select(day1);
			s3.selectByValue("2");

		}
		
		List<WebElement>Arriving = driver.findElements(By.name("toPort"));
		System.out.println("List of countries present in departing:");
		
		for(WebElement item:Arriving) {
			System.out.println(item.getText());
			Select s3 = new Select(item);
			s3.selectByVisibleText("London");
		}
		List<WebElement>months = driver.findElements(By.name("toMonth"));
		System.out.println("List of month present in departing:");
		
		for(WebElement ites:months) {
			System.out.println(ites.getText());
			Select s4 = new Select(ites);
			s4.selectByVisibleText("August");

		}
		
		List<WebElement>days = driver.findElements(By.name("toDay"));
		System.out.println("List of days present in departing:");
		
		for(WebElement da:days) {
			System.out.println(da.getText());
			Select s3 = new Select(da);
			s3.selectByValue("22");

		}
		
		WebElement Departing_from = driver.findElement(By.name("fromPort"));
		Select Depart = new Select(Departing_from);
		
		WebElement Returning = driver.findElement(By.name("toPort"));
		Select Return = new Select(Departing_from);
		
		if(Depart.getFirstSelectedOption().getText().equals(Return.getFirstSelectedOption().getText())) {
			System.out.println("Default value in the depending from and returning select box are same.");
		}
		else {
			System.out.println("Default value in the depending from and returning select box are not same.");
		}
		
		
		//preferences
		
		List<WebElement> prefebtn=driver.findElements(By.name("servClass"));
		for (WebElement ele : prefebtn) {
//					
			ele.click();
			 if (ele.isSelected()) {
                System.out.println("Radio button with value: " + ele.getAttribute("value") + " is selected.");
            } else {
                System.out.println("Radio button selection failed.");
            }
			
		}
				
				//airline
			
		WebElement airline	=driver.findElement(By.xpath("//select[@name=\"airline\"]"));
		Select select = new Select(airline);
		select.selectByVisibleText("Blue Skies Airlines");
		  List<WebElement> options = select.getOptions();

	      // Print each option text
	      System.out.println("Dropdown Options:");
	      for (WebElement option : options) {
	          System.out.println(option.getText());
			
		}
			
			 WebElement contin=driver.findElement(By.xpath("//input[@name=\"findFlights\"]"));
			 contin.click();
			 
			WebElement btn = driver.findElement(By.xpath("//img[@src=\"images/home.gif\"]"));
			btn.click();
			
				
				
//				List<WebElement> departing_palces = driver.findElements(By.xpath("//select[@name='fromPort']//option"));
//				String country = "London";
//				boolean country_select = false;
//				
//				for(WebElement a:departing_palces) {
//					if(a.getText().equalsIgnoreCase(country)) {
//						a.click();
//						country_select = true;
//						break;
//					}
//				}
//				
//				if(!country_select) {
//					System.out.println("There is no country");
//				}
//				
//				
//				
//				List<WebElement> Arriving_palces = driver.findElements(By.xpath("//select[@name='toPort']//option"));
//				String country1 = "Paris";
//				boolean country1_select = false;
//				
//				for(WebElement a:departing_palces) {
//					if(a.getText().equalsIgnoreCase(country)) {
//						a.click();
//						country1_select = true;
//						break;
//					}
//				}
//				
//				if(!country_select) {
//					System.out.println("There is no country");
//				}
				
//				WebElement departure	=driver.findElement(By.name("fromPort"));
//				Select select = new Select(departure);
//				select.selectByVisibleText("London");
//				  List<WebElement> opt = select.getOptions();
		//
//			      // Print each option text
//			      System.out.println("Dropdown Options:");
//			      for (WebElement option : opt) {
//			          System.out.println(option.getText());
		//	
				
		
				
				driver.close();

	
	}

}
