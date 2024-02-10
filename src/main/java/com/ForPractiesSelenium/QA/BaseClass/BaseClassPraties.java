package com.ForPractiesSelenium.QA.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPraties
{
	public static WebDriver driver;
	public SoftAssert SoftAssert;
	public Properties prop;
	public String configPath="D:\\SeleniumWorkes\\ForPractiesSelenium\\src\\main\\java\\com\\ForPractiesSelenium\\QA\\Config\\Config.Properties";
	public Actions acc;
	
	public  BaseClassPraties()
	{

		try
		{
			File fl=new File(configPath);
			FileInputStream fis=new FileInputStream(fl);
			prop=new Properties();
			prop.load(fis);
			SoftAssert =new SoftAssert();
			acc=new Actions(driver);
		} 
		catch (FileNotFoundException e)
		{

			e.printStackTrace();
		}
		catch(IOException  e)
		{
			e.printStackTrace();
		}
		catch(Throwable e)
		{
			e.printStackTrace();	
		}
	}
	
	@Test
	public void InitiazeMethod()
	{
		if(prop.getProperty("browserName").compareToIgnoreCase("chrome")==0)
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		if(prop.getProperty("browserName").compareToIgnoreCase("firefox")==0)
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();			
		}
		else
		{
			System.out.println("Any one of  the browser is selected ");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitlyWait")),TimeUnit.SECONDS);
		System.out.println("I am from base class ");
	}

}

