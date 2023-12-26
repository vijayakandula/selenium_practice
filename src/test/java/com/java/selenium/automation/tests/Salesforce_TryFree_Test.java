package com.java.selenium.automation.tests;

import org.testng.annotations.Test;

import com.selenium.automation.base.Test_Base;
import com.selenium.automation.pages.Salesforec_TryForFree_Page;

public class Salesforce_TryFree_Test extends Test_Base{
	
	Salesforec_TryForFree_Page  salesforce_TryFree_Test = new Salesforec_TryForFree_Page();
	
	
	@Test
	public void salesforce_TryFree_Test() throws Exception {
		salesforce_TryFree_Test.validatefunctionality();
		
		
		
	}

	
	
}
