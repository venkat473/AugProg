package com.ebanking.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchDetailsPage 
{
	
	@FindBy(name="BtnNewBR")
	public WebElement newButton;
	
	
	@FindBy(xpath="//tr//tr[2]//td[7]")
	public WebElement edit;
	
	//
	
	public void newButtonClick()
	{
		newButton.click();
	}

}
