package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginPageStepDefinitions extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^user is in the FreeCRM app$")
	public void user_is_in_the_FreeCRM_app() throws Throwable {
		loginPage = new LoginPage();
		TestBase.initialisation();
		String loginPageTitle = loginPage.verifyLoginPageTitle();
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", loginPageTitle);
		

	}

	@When("^user enters username and password and clicks Login button$")
	public void user_enters_username_and_password_and_clicks_Login_button() throws Throwable {
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Then("^FreeCRM HomePage is displayed$")
	public void freecrm_HomePage_is_displayed() throws Throwable {
	//	homePage = new HomePage();
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homePageTitle);
		
		

	}



}
