package com.oldmutual.testBase;
import com.oldmutual.utilities.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//We will be including our common requirements which will be used globally 
public class BaseClass {

	// initialize configuration properties
	protected ConfigReader conf = new ConfigReader();
	private String baseUrl = conf.getHomeURL(); // "https://www.oldmutual.co.za/personal/solutions/bank-and-borrow/";
												// //setting the modifier on private to avoid interference by other
												// classes.

	// Initialize webDriver
	public static WebDriver driver;

	// getting the homeUrl
	public void getHomeUrl() {

		driver.get(baseUrl);
		driver.manage().window().maximize(); // simply maximizing the window

	}

	// This is my setup method
	@BeforeClass // This will be executed before any @test annotated method.
	public void setup() {
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup(); 
	
		try {

			switch (conf.getBrowser()) {
				case "chrome":
					driver = new ChromeDriver();
					WebDriverManager.chromedriver().setup(); 
					break;
				case "firefox":
					driver = new FirefoxDriver();
					WebDriverManager.firefoxdriver().setup();
					break;
				default:
				 System.out.println(conf.getbrowserSetupLogerror());
			}

		} catch (Exception e) {
			System.out.println("Swicth statement: setting up drivers"); 
		}

	}

	// navigating to the personal loan page
	public void navigateToUrl(String url) {

		driver.get(baseUrl + url);
		driver.manage().window().maximize(); // simply maximizing the window
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);


	}

	// shutdown after the @test. This will run after all the tests have executed
	@AfterClass
	public void closeBrowser() {

		driver.quit();

	}

}
