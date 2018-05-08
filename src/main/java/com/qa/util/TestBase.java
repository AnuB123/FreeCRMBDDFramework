package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
	
	try
	{
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\anuba\\eclipse-workspace\\FreeCRMBDDFramework\\src\\main\\java\\com\\qa\\config\\FreeCRMconfig.properties");
		prop.load(ip);		
		
	}catch (IOException e)
	{ 
		e.getMessage();
	}

	}
	
	public static void initialisation()
	{
		String browser = prop.getProperty("browser");
		if (browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/anuba/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\anuba\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	
		
	}
	
		
	
	
	
}