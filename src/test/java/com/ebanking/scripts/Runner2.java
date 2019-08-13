package com.ebanking.scripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Runner2 extends Basic
{
	
	@Test
	public void m2()throws Exception 
	{
		
		
		AdmnHomePage  ahp=PageFactory.initElements(driver,AdmnHomePage.class);
		ahp.rolesClick();
		Thread.sleep(3000);
		 NewRolesCreationPage nrcp=PageFactory.initElements(driver, NewRolesCreationPage.class);
		 nrcp.roleDetailsPage();
		 Thread.sleep(3000);
		 NewRoleDetailsPage nrdp=PageFactory.initElements(driver,NewRoleDetailsPage.class);
		 nrdp.newRoleCreation();
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		
		
		
		
	}

}
