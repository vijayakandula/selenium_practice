package com.selenium.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Fbpage_Automation {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).click();
		driver.findElement(By.id("APjFqb")).sendKeys("https://www.facebook.com");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
       driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("kandulavijaya1900@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vijaya@123");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		
		
		
		
		
	}

}
