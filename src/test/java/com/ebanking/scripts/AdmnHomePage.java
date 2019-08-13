package com.ebanking.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdmnHomePage 
{
	
	
	
	@FindBy(xpath="//tr//tr//tr//tr//tr[2]//td[1]//a[1]//img[1]")
	public WebElement branches;
	
	
	@FindBy(xpath="//tr//tr//tr[4]//td[1]//a[1]//img[1]")
	public WebElement roles;
	
	@FindBy(xpath="//tr[8]//td[1]//a[1]//img[1]")
	public WebElement employees;
	
	
	//methods
	public void branchClick()throws Exception
	{
		
		Thread.sleep(5000);
		branches.click();
	}
	
	public void rolesClick()
	{
		roles.click();
	}
	
	

}
