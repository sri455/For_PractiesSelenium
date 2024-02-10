package com.ForPractiesSelenium.QA.TextCaseClasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ForPractiesSelenium.QA.BaseClass.BaseClassPraties;

public class MultipalWindowHandal extends BaseClassPraties 
{
	
  @Test(priority=0)
  public void LumchApp() throws Exception
  {
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("HYR Tutorials");
	driver.findElement(By.name("q")).submit();
	Thread.sleep(3000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.quit();
  }
  
}
