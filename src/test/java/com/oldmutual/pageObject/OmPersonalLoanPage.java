package com.oldmutual.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OmPersonalLoanPage {
	
	WebDriver loanDriver;
	
	//Constructor with one parameter, takes in the driver object
		public OmPersonalLoanPage (WebDriver localDriver ){
			
			loanDriver = localDriver; //instantiating homeDriver
			PageFactory.initElements(localDriver, this); //initialize web elements which are defined in Page Objects.
			
		}
		
	

}
