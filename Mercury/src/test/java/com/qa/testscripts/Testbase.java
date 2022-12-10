package com.qa.testscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.qa.pages.CleartripPages;
import com.qa.pages.MercuryPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	//FileInputStream fileloc;
	//Properties prop;
	
	CleartripPages mercpages;
	WebDriver Driver;
	@Parameters({"Browser","Url"})
	 @BeforeClass
	 public void Setup(String Browser,String Url)throws IOException, InterruptedException
	 {
	 
		 if(Browser.equalsIgnoreCase("Chrome"))
	 {
	 WebDriverManager.chromedriver().setup();
	 Driver=new ChromeDriver();
	 }
	  if(Browser.equalsIgnoreCase("Edge"))
	 {
	System.setProperty("webdriver.edge.driver","C:\\Users\\GOD\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	 Driver=new EdgeDriver();
	 }
	 if (Browser.equalsIgnoreCase("firefox")) {
		 WebDriverManager.firefoxdriver().setup();
		 Driver=new FirefoxDriver();
		 
	 }
	 mercpages =new CleartripPages(Driver);
	 Driver.manage().window().maximize();
	 Driver.get(Url);
	 
	 Thread.sleep(3000);
		CleartripPages.cancel.click();
	 

	 }

	 @AfterClass public void TearDown() throws InterruptedException {
	 Thread.sleep(5000); Driver.close(); }
	}
