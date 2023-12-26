package com.java.selenium.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_AfterMethod {
	
	
	@AfterMethod                                          // @AfterMethod annotation method will execute after each @Test annotation method
	public void after_method()
	{
		System.out.println("iam in after_method");
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
	
	@BeforeMethod                                         // @BeforeMethod annotation method will execute before each @Test annotation method
	public void before_method()
	{
		System.out.println("iam in before_method");
	}

}
