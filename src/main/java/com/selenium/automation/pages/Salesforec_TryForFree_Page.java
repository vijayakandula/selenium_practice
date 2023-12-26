package com.selenium.automation.pages;

import org.openqa.selenium.By;

import com.selenium.automation.actions.ActionEngine_Salesforce;

public class Salesforec_TryForFree_Page extends ActionEngine_Salesforce {
	
	private By tryforfree =By.xpath("//a[@class='button secondary']");
	private By firstname = By.xpath("//input[@name='UserFirstName']");
	private By lastname = By.xpath("//input[@name='UserLastName']");
	private By email = By.xpath(" //input[@name='UserEmail']");
	private By jobtitle = By.xpath("//select[@name='UserTitle']");
	private By company = By.xpath("//input[@name='CompanyName']");
	private By employees = By.xpath("//select[@name='CompanyEmployees']");
	private By phone = By.xpath("//input[@name='UserPhone']");
	//private By country = By.xpath("//select[@id='CompanyCountry-vYS4']");
	private By checkbox = By.xpath("(//div[@class='field']//div[@class='checkbox-ui'])[position()=2]");
	private By startmyfreetrail = By.xpath("//button[@name='start my free trial']");
	

	public void validatefunctionality() throws Exception {
		click(tryforfree);
		type(firstname,"First Name","Kandula");
		type(lastname,"Last Name","Vijaya");
		type(email,"Email","kandulavijaya1997@gmail.com");
		click(jobtitle);
		selectjobtitlebyVisibleText(jobtitle, "Job Title", "Student / Job Seeker / Personal Interest");
		type(company,"Company","Capgemini");
		click(employees);
		selectjobtitlebyVisibleText(employees, "Employees", "2001+ employees");
		type(phone,"Phone","9000059136");
		//selectjobtitlebyVisibleText(country,"Country/Region","India");
		click(checkbox);
		click(startmyfreetrail);
		//Thread.sleep(10000);
		
	}
	
}
