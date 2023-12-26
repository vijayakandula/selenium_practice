package com.selenium.automation.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); 
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(10000);
		
		List<WebElement>list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("size is " +list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String listitems=list.get(i).getText();
			System.out.println(listitems);
			
			if(listitems.contains("java download"))
			{
				list.get(i).click();
				break;
			}
		}
		

	}

}
