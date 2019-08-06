package testngprogs;

import java.io.File;

import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ITestResultProg
{
	WebDriver d;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://facebook.com");
		d.findElement(By.xpath("//*[@name='email']")).sendKeys("krishnav373@gmail.com");
	}
	
	@BeforeMethod
	public void beforeMetod(Method m)
	{
		System.out.println("executing the test case:"+m.getName());
		
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception
	{
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			TakesScreenshot ts=(TakesScreenshot)d;
			File f1=ts.getScreenshotAs(OutputType.FILE);
			File f2=new File("E:\\mohan.jpeg");
			FileHandler.copy(f1,f2);
			
		}
		else if(ITestResult.SUCCESS==result.getStatus())
		{
			TakesScreenshot ts=(TakesScreenshot)d;
			File f1=ts.getScreenshotAs(OutputType.FILE);
			File f2=new File("E:\\mohan.jpeg");
			FileHandler.copy(f1,f2);
			
			
		}
		
		
	}

}
