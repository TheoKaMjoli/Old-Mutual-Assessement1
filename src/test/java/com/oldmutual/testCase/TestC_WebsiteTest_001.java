package com.oldmutual.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oldmutual.pageObject.Home;
import com.oldmutual.pageObject.OmPersonalLoanPage;
import com.oldmutual.testBase.BaseClass;

//We extended the baseClass to 
public class TestC_WebsiteTest_001 extends BaseClass {
	
	
	@Test 
	public void browseToFinancePageTest() {
		
		getHomeUrl(); //Browse to Old Mutual Finance web site
		
		Home home = new Home();
	
		OmPersonalLoanPage OmPersonalLoanPage = new OmPersonalLoanPage(driver);
		String titleValidation = home.getTitle(); //actual title 
		
		
		//title verification 
		if(titleValidation.equals("Bank and Borrow Solutions | Old Mutual")) {
			
			Assert.assertTrue(true);
			
		}
		else {
			
			Assert.assertTrue(false);
			
		}
		
		
	//	omFinanceWebsite.scrollDown();
	//	omFinanceWebsite.clickButton(); //unable to click the link button
		
		navigateToUrl("personal-loans/"); //concatenated the personal loan urls
		
		//Actions
		OmPersonalLoanPage.clickBtnCaculate();
		OmPersonalLoanPage.clickDdLownAmount();
		OmPersonalLoanPage.clickDdLownAmountSelection();
		OmPersonalLoanPage.clickBtnNext();
		OmPersonalLoanPage.clickDdTerm();
		OmPersonalLoanPage.clickDdTermSelection();
		OmPersonalLoanPage.clickBtnCaculate();
		
		//verifying loan amount 
		Assert.assertEquals(OmPersonalLoanPage.getLoanRepaymentText(), "R1 656.43 - R1 810.05");
		
		
		
	}
	

	

	
	

}
