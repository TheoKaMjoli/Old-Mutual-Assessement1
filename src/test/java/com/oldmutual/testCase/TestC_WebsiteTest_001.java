package com.oldmutual.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oldmutual.pageObject.OmFinanceWebsite;
import com.oldmutual.testBase.BaseClass;

//We extended the baseClass to 
public class TestC_WebsiteTest_001 extends BaseClass {
	
	
	//Setup method will execute first before @Test
	@Test 
	public void browseToFinancePageTest() {
		
		getHomeUrl(); //Browse to Old Mutual Finance web site
		
		OmFinanceWebsite omFinanceWebsite = new OmFinanceWebsite(driver);
		
		String titleValidation = omFinanceWebsite.getTitle();
		
		
		//title verification 
		if(titleValidation.equals("Bank and Borrow Solutions | Old Mutual")) {
			
			Assert.assertTrue(true);
			
		}
		else {
			
			Assert.assertTrue(false);
			
		}
		
		
		omFinanceWebsite.scrollDown();
		omFinanceWebsite.clickButton();
		
	}
	

	

	
	

}
