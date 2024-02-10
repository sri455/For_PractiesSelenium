package com.ForPractiesSelenium.QA.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ForPractiesSelenium.QA.BaseClass.BaseClassPraties;

public class hyrTutorialsObjects extends BaseClassPraties
{
	//public WebDriver driver;
	public hyrTutorialsObjects()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//li[@class='parent']/following::a[text()='Selenium Practice']")
	private WebElement SeleniumPractice;

	@Test
	public void SeleniumPractice()
	{
		try
		{
			acc=new Actions(driver);
			acc.moveToElement(SeleniumPractice).build().perform();
			SeleniumPractice.click();
		}
		catch(Throwable obj)
		{
			Assert.assertEquals( false,true, "login un successful please check it");
			SoftAssert.assertAll();
			obj.printStackTrace();	  
		}
	}
	@Test
	public void DrowpDownMethod()
	{
		try
		{
			WebElement Drowpdown=driver.findElement(By.id("course"));
			Select Drpname=new Select(Drowpdown);
			Drpname.selectByIndex(1);
			Thread.sleep(3000);
			Drpname.selectByVisibleText("Python");
			Thread.sleep(3000);
			Drpname.selectByValue("js");
		}
		catch(Throwable obj)
		{
			Assert.assertEquals(false, true, "drowp down unsuccessful check it ");
			SoftAssert.assertAll();
			obj.printStackTrace();
		}
	}
}
