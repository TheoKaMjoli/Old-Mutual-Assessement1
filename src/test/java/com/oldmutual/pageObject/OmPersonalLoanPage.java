package com.oldmutual.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OmPersonalLoanPage {
	
	WebDriver loanDriver;
	
	//Constructor with one parameter, takes in  driver 
		public OmPersonalLoanPage (WebDriver localDriver ){
			
			loanDriver = localDriver; //instantiating homeDriver
			//PageFactory.initElements(localDriver, this); //initialize web elements which are defined in Page Objects.
	
		}
		
		//click calclate button
		private String btnCalculate(){
			return "(//span[@class=\"om-button-icon\"])[1]";
		}
		
		//How much do you need
		 private String ddLoanAmount(){
			 return "#loanAmount > div > div > div > om-form-dropdown-field > div > div.dark-grey-border > span.selected-value-container";
		 }
		 
		 //Selecting the amount in this case R50 000 
		 private String ddLoanAmountSelection(){
			 return "//ul[@class=\"dropdown-options-list\"]/li[3]";
		 }
		 
		 //Next button clicked
		 private String btnNext(){
			 return "undefined";
		 }
		
		 //drop down loan term
		 private String ddTerm(){
			 return "(//input[@class=\"selected-value\"])[1]";
		 }
		 
		 //loan term selection
		 private String ddTermSelection(){
			 return "//ul[@class=\"dropdown-options-list\"]/li[2]";
		 }
		 
		 //monthly repayment label
		 private String lblLoanRepayment(){
			 return "(//h5[@class=\"no-bottom-margin no-top-margin\"]/strong)[2]";
		 }
		 
		 public void clickBtnCaculate(){
		        this.loanDriver.findElement(By.xpath(btnCalculate())).click();
		    }
		    public void clickDdLownAmount(){
		        this.loanDriver.switchTo().frame("__JSBridgeIframe_1.0__");
		        this.loanDriver.findElement(By.cssSelector(ddLoanAmount())).click();

		    }
		    public void clickDdLownAmountSelection(){

		        this.loanDriver.findElement(By.xpath(ddLoanAmountSelection())).click();

		    }
		    public void clickBtnNext(){
		        this.loanDriver.findElement(By.id(btnNext())).click();

		    }
		    public void clickDdTerm(){
		        this.loanDriver.findElement(By.xpath(ddTerm())).click();

		    }
		    public void clickDdTermSelection(){
		        this.loanDriver.findElement(By.xpath(ddTermSelection())).click();

		    }
		    
		    //return the repayments amount 
		    public String getLoanRepaymentText(){
		       return  this.loanDriver.findElement(By.xpath(lblLoanRepayment())).getText();
		    }
		 
		 
		 
}