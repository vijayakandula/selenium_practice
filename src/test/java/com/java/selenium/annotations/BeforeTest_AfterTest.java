package com.java.selenium.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTest_AfterTest {
	
	@AfterTest                                               // @AfterTest annotation method will execute after all @Test annotation methods
	public void after_test_method()
	{
		System.out.println("iam in after_test_method()");
	}
	
	@Test                                                   //@Test annotation methods will execute according to alphabetical order
	public void first_test_method()
	{
		System.out.println("iam in first_test_method()");
	}
	
	@BeforeTest                                            // @BeforeTest annotation method will execute before all @Test annotation methods
	public void before_test_method()
	{
		System.out.println("iam in before_test_method()");
	}
	
	@Test
	public void second_test_method()
	{
		System.out.println("iam in second_test_method()");
	}
	

}
