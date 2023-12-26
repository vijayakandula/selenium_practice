package com.java.selenium.annotations;

import org.testng.annotations.Test;

public class TestMethod_TestMethod {
	
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
	@Test                                                   
	public void third_test_method()
	{
		System.out.println("iam in third_test_method()");
	}
	
	@Test
	public void fourth_test_method()
	{
		System.out.println("iam in fourth_test_method()");
	}

	
}
