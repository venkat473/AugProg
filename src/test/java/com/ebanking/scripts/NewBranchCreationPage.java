package com.ebanking.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewBranchCreationPage 
{
	
	
	@FindBy(name="txtbName")
	public WebElement bname;
	
	@FindBy(name="txtAdd1")
	public WebElement add1;
	
	@FindBy(name="txtZip")
	public WebElement zipcode;
	
	@FindBy(name="lst_counrtyU")
	public WebElement country;
	
	@FindBy(name="lst_stateI")
	public WebElement state;
	
	@FindBy(name="lst_cityI")
	public WebElement city;
	
	@FindBy(name="btn_insert")
	public WebElement submit;
	
	//methods
	public void branchCreation()
	{
		bname.sendKeys("srnagar");
		
		add1.sendKeys("bapunagar");
		
		zipcode.sendKeys("52122");
		
		Select s1=new Select(country);
		s1.selectByVisibleText("INDIA");
		
		Select s2=new Select(state);
		s2.selectByVisibleText("GOA");
		
		Select s3=new Select(city);
		s3.selectByVisibleText("GOA");
		
		submit.click();
		
				
	}
	
	
	

}
