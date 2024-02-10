package com.ForPractiesSelenium.QA.TextCaseClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ForPractiesSelenium.QA.BaseClass.BaseClassPraties;
import com.ForPractiesSelenium.QA.PageObjects.SignInPageObject;


public class FaceBookLunchApp extends BaseClassPraties
{
	public SignInPageObject spo;
    
	@Test
	public void ObjectCreate() 
	{
		spo=new SignInPageObject();

	}
	@Test(priority=0)
	public void LoginLunchApp()
	{
		try
		{ 	
			driver.get(prop.getProperty("TestURL"));
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitlyWait")),TimeUnit.SECONDS);
		}  
		catch(NoSuchElementException obj)
		{
			System.out.println(obj.getMessage());
		}
		catch(Throwable obj)
		{
			System.out.println(obj.getMessage());
		}
	}
	    @Test(priority=1)
		public void login()
		{
		spo.FaceBookLagin();	
		}
	    @Test(priority=2)
	    public void SrnMethodClick()
	    {
	    	driver.findElement(By.xpath("//span[text()='Srinu Banoth']")).click();
	    	WebElement doubleClk=driver.findElement(By.xpath("//img[@data-imgperflogname='profileCoverPhoto']"));
	    	doubleClk.click();
	    }
	}
