package com.oldmutual.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//We will be including our common requirements which will be used globally 
public class BaseClass {
	
	private String Url = "https://www.oldmutualfinance.co.za/"; //setting the modifier on private to avoid interference.
	
	
	// Intitialize webdriver 
	public static WebDriver driver;
	
	//getting the homeUrl
	public void getHomeUrl() {
		
		driver.get(Url);
		
	}
	

	//This is my setup method
	@BeforeClass //This will be executed before every @test annotated method.
	public void setup() {
		//Sets the system property indicated by the specified key
		System.setProperty("webdriver.chrome.driver" , ".\\Driver\\chromedriver.exe");	
		
		//instantiating/creating the driver object.
		driver = new ChromeDriver();
		
	}
	
	//shutdown after the @test. This will run after all the tests have executed
	@AfterClass 
	public void closeBrowser() {
		
		driver.quit();
		
	}
	
	
	

}
