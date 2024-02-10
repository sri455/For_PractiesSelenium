package com.ForPractiesSelenium.QA.TextCaseClasses;

import org.testng.annotations.Test;

import com.ForPractiesSelenium.QA.BaseClass.BaseClassPraties;

public class SimpleClass extends BaseClassPraties
{
  @Test
  public void LunchApp() 
  {
	  driver.get("https://www.facebook.com/");
	 
  }
}
