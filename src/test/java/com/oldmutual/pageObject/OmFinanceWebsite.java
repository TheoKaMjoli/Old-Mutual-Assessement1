package com.oldmutual.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OmFinanceWebsite {
	
	
	//Creating the driver reference
	WebDriver homePageDriver;
	
	
	//Constructor with one parameter, takes in the driver object
	public OmFinanceWebsite (WebDriver localDriver ){
		
		homePageDriver = localDriver; //instatiating homeDriver
		PageFactory.initElements(localDriver, this); //initialize web elements which are defined in Page Objects.
		
	}
	
	//getting the title of the page
	public String getTitle() {
		
		return homePageDriver.getTitle();
		
	}

}
