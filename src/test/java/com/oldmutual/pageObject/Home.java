package com.oldmutual.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	// getting the title of Old Mutual Finance Web site
	
	WebDriver driver;
	
	private String btnPersonalLoans() { return "//a[contains(@href, 'personal-loans')]/span[text()='LEARN MORE']"; }

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return  driver.getTitle();
	}

	public void clickPersonalLoans() {
		try {
			WebElement element = driver.findElement(By.xpath(btnPersonalLoans()));
			scrollToElement();
			element.click();
		} catch (Exception ex) {
			System.err.println(ex.getStackTrace());
		}
	}

	

	private void scrollToElement() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(5000);
		} catch (Exception ex) {
			System.err.println(ex.getStackTrace());
		}
	}
}
