package com.qa.pages;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	

}
