package com.java.selenium.annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeSuite_AfterSuite {                      // @AfterSuite annotation method will execute after all methods
	
	@AfterSuite                                           
	public void after_suite_method()
	{
		System.out.println("iam in after_suite method");
	}
	
	@Test                                                   //@Test annotation methods will execute according to alphabetical order
	public void first_test_method()
	{
		System.out.println("iam in first_test_method()");
	}
	
	@Test
	public void second_test_method()
	{
		System.out.println("iam in second_test_method()");
	}
	
	@BeforeSuite                                         // @BeforeSuite annotation method will execute before all methods
	public void beforesuite_method()
	{
		System.out.println("iam in before_suite_method()");
	}
	

}
