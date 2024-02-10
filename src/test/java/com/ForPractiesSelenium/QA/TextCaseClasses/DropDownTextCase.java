package com.ForPractiesSelenium.QA.TextCaseClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import com.ForPractiesSelenium.QA.BaseClass.BaseClassPraties;
import com.ForPractiesSelenium.QA.PageObjects.hyrTutorialsObjects;

public class DropDownTextCase extends BaseClassPraties
{

	public hyrTutorialsObjects hto;
	
	@Test
	public void CreateObject()
	{
		hto=new hyrTutorialsObjects();
	}
	@Test(priority=0)
	public void LunchLogin()
	{
		try
		{ 	
			driver.get(prop.getProperty("TestURL2"));
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
	public void SeleniumPracticeClickMethod()
	{
		hto.SeleniumPractice();		
	}
	@Test(priority=2)
    public void DrpnameMethod()
    {
    	hto.DrowpDownMethod();
    }

}
