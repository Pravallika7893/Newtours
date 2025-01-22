package com.qa.Testscript;

import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.Pages.NTPages;
import com.qa.Pages.NewtourRegistrationPage;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Baseclass {
	
	public static WebDriver driver;
	public Logger logger;
	public Properties p;
	TakesScreenshot ts;
	NewtourRegistrationPage Np;
	NTPages Nt;
	
	@BeforeClass(groups= {"Sanity","Regression","Master","Datadriven"})
@Parameters({"os","browser"})
public void setup(String os,String br) throws IOException  {
	
	//lodding config.properties file
	FileReader file = new FileReader("./src//test//resources//config.properties");
	p=new Properties();
	p.load(file);

logger = LogManager.getLogger(this.getClass());

	switch(br.toLowerCase()) {
	case "edge" :driver = new EdgeDriver(); break;
	case "chrome" :driver = new ChromeDriver();break;
	case "firefox" :driver = new FirefoxDriver();break;
	default : System.out.println("Invalid browser name...");return;
	
	}

	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
//driver.get("https://demo.guru99.com/test/newtours/");
    driver.get(p.getProperty("appurl"));  //reading url from properties file
	driver.manage().window().maximize();
	Np = new NewtourRegistrationPage(driver);
	Nt = new NTPages(driver);
	ts = (TakesScreenshot)driver;

}

@AfterClass(groups= {"Sanity","Regression","Master","Datadriven"})
   public void tearDown() {
		driver.close();
	}

    public String randomString() {
		
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
    public String randomNumber() {
		
		String generatednumber = RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
    
   public String randomAlphaNumeric() {
		
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		String generatednumber = RandomStringUtils.randomNumeric(3);

		return (generatedstring+generatednumber);
	}
   
   public String captureScreen(String tname) throws IOException{
	   
	   String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
   
   TakesScreenshot ts = (TakesScreenshot)driver;
	File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	
	String targetfilePath =System.getProperty("user.dir")+"\\Screenshots\\" +tname +"_"+ timestamp+".png";
		File targetFile = new File(targetfilePath);
		
		sourcefile.renameTo(targetFile);
		
		return targetfilePath;
	   
   }
}
