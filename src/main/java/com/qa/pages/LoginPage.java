	package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(name="username")
	public WebElement loginName;
	
	@FindBy(name = "password")
	WebElement loginPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement crmLogo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public HomePage login(String un,String pwd)
	{
	
		loginName.sendKeys(un);
		loginPassword.sendKeys(pwd);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
		return new HomePage();
	}
	
	
	public boolean verifyLogo()
	{
		return crmLogo.isDisplayed();
	}
}
