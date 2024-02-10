package com.ForPractiesSelenium.QA.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ForPractiesSelenium.QA.BaseClass.BaseClassPraties;

public class SignInPageObject extends BaseClassPraties
{ 
	public SignInPageObject()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='email']")
	private WebElement EmailAddOrPhoneNum;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement PassWord;
	@FindBy(xpath="//button[@name='login']")
	private WebElement LoginButton;
	
  @Test
  public void FaceBookLagin() 
  {
	  try 
	  {
	  acc=new Actions(driver);
	  acc.moveToElement(EmailAddOrPhoneNum).build().perform();
	  EmailAddOrPhoneNum.sendKeys(prop.getProperty("Email"));
	  acc.sendKeys(Keys.TAB);
	  PassWord.sendKeys(prop.getProperty("Password"));
	  acc.sendKeys(Keys.TAB);
	  LoginButton.click();
	  }
	  catch(Throwable obj)
	  {
		Assert.assertEquals(false, true, "FaceBool Login is Not Successful please check it ");
	    SoftAssert.assertAll();
	    obj.printStackTrace();
	  }
  }
  
}
