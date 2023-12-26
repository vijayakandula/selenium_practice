package com.selenium.datadriventests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramLoginTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		// getting data form excelsheet
       FileInputStream file=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop//InstagramTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowcount=sheet.getLastRowNum();
		//for(int row=1;row<rowcount;row++)
		
			XSSFRow currentrow=sheet.getRow(1);
			
			String username = currentrow.getCell(1).getStringCellValue();
			String password = currentrow.getCell(2).getStringCellValue();
			//System.out.println(username);
			//System.out.println(password);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
				

                                  
}
}
