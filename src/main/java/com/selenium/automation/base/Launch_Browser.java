package com.selenium.automation.base;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); // to open the chrome browser
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");  // to open google
	}

}
