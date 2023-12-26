package com.java.selenium.automation.tests;

import org.testng.annotations.Test;

import com.selenium.automation.base.Test_Base;
import com.selenium.automation.pages.InstagramLogin_Page;

public class InstagramLogin_Test extends Test_Base {
	
	InstagramLogin_Page instagramlogin_page = new InstagramLogin_Page();
	
	@Test(priority=1)
	public void instagramlogin_test() throws InterruptedException
	{
	
		instagramlogin_page.loginfunctionality();
	}
	
}
