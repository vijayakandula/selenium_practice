package com.selenium.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_Locators {
	public static WebDriver driver;

	public static void setup(String drivertype) {

		if(drivertype.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		}
		
		else if(drivertype.equals("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
	
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/text-box");
	  
	  By un= By.xpath("//input[@placeholder='Full Name']");
	  WebElement username= driver.findElement(un);
	  username.clear();
	  username.sendKeys("Kandula Vijaya");
	  

	  By em= By.xpath("//input[@placeholder='name@example.com']");
	  WebElement email = driver.findElement(em);
	  email.clear();
	  email.sendKeys("kandulavijaya1900@gmail.com");
	  

	  By ca= By.xpath("//textarea[@id='currentAddress']");
	  WebElement currentaddress= driver.findElement(ca);
	  currentaddress.clear();
	  currentaddress.sendKeys("Midhani Colony-Hayath Nagar-Hyd-501505");
	  
	  By pa= By.xpath("//textarea[@id='permanentAddress']");
	  WebElement permanentaddress= driver.findElement(pa);
	 permanentaddress.clear();
	  permanentaddress.sendKeys("Midhani Colony-Hayath Nagar-Hyd-501505");
	
	  By sub= By.xpath("//button[@id='submit']");
	  WebElement submit= driver.findElement(sub);
	  submit.click();
	  
	  
	}

	  public static void main(String[] args) {
			setup("chrome");
		}
		
	

}
