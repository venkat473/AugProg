package com.ebanking.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRolesCreationPage
{
	@FindBy(name="btnRoles")
	public WebElement newRole;
	
	@FindBy(xpath=" //body//div[@id='Panel2DG']//tr//tr[2]//td[4]")
	public WebElement roleEdit;
	
	
	//Methods
	public void roleDetailsPage()
	{
		newRole.click();
	}

}
