package com.ebanking.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewRoleDetailsPage 
{
	@FindBy(name="txtRname")
	public WebElement roleName;
	
	@FindBy(name="txtRDesc")
	public WebElement roleDiscription;
	
	@FindBy(name="lstRtypeN")
	public WebElement roleType;
	
	
	@FindBy(name="btninsert")
	public WebElement submitbutton;
	
	@FindBy(xpath="//table[@id='Table_01']//td[1]//a[1]//img[1]")
	public WebElement homebutton;
	
	//methods
	
	public void newRoleCreation()throws Exception
	{
		roleName.sendKeys("Clerk");
		roleDiscription.sendKeys("cashier");
		Select s1=new Select(roleType);
		s1.selectByVisibleText("E");
		Thread.sleep(3000);
		submitbutton.click();
		
		
	}

}
