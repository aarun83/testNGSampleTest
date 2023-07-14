package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest{
	private WebDriver driver;
	
	@BeforeTest
	public void BeforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arun Kumar\\eclipse-workspace\\Sample_Cucumber_Demo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
  @Test
  public void Test() {
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in");
	  
	  String title = driver.getTitle();
	  AssertJUnit.assertTrue(title.equals("Google"));
	  driver.quit();
	    }
}

