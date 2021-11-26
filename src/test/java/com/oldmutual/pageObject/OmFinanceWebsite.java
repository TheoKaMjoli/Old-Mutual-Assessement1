package com.oldmutual.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OmFinanceWebsite {
	
	//Creating the driver reference
	WebDriver homePageDriver;
	
	
	//Constructor with one parameter, takes in the driver object
	public OmFinanceWebsite (WebDriver localDriver ){
		
		homePageDriver = localDriver; //instantiating homeDriver
		PageFactory.initElements(localDriver, this); //initialize web elements which are defined in Page Objects.
		
	}
	
	//page elements (Personal loan = learn more button)
	@FindBy(className="om-button-text")
	WebElement loanBtn;
	
	//getting the title of the page
	public String getTitle() {
		
		return homePageDriver.getTitle();
		
	}
	
	public void clickButton() {
		
		 loanBtn.click();
		
	}
	
	public void scrollDown() {
		
		//To reach the loan button, scroll down
		JavascriptExecutor js = (JavascriptExecutor) homePageDriver;
		js.executeScript("window.scrollBy(0,850)", "");
	}
	
}
