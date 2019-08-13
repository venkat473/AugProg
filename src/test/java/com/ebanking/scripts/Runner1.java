package com.ebanking.scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Runner1 extends Basic
{
	
	
	@Test
	public void method1() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		AdmnHomePage ahp=PageFactory.initElements(driver,AdmnHomePage.class);
		ahp.branchClick();
		
		BranchDetailsPage bdp=PageFactory.initElements(driver,BranchDetailsPage.class);
		bdp.newButtonClick();
		
		
		
		NewBranchCreationPage  nbc=PageFactory.initElements(driver, NewBranchCreationPage .class);
		nbc.branchCreation();
		driver.switchTo().alert().accept();
		
	}
	
	
	

}
