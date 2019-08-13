package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class Basic
{
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void launch()throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://primusbank.qedgetech.com");
		
	}
	@BeforeClass
	public void login()throws Exception
	{
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void logOut()throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[3]//a[1]//img[1]")).click();
	}
	
	
	@AfterSuite
	public void closeSite()
	{
		driver.close();
	}
	
	

}
