package com.oldmutual.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	// getting the title of Old Mutual Finance Web site
	
	WebDriver driver = new ChromeDriver();
	public String getTitle() {
		return  driver.getTitle();
	}
}
