package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "C:\\Users\\anuba\\eclipse-workspace\\FreeCRMBDDFramework\\src\\main\\java\\com\\qa\\features\\Login.feature",
		glue = {"com.qa.stepDefinitions"},
		format = {"pretty", "html:test-output"},
		monochrome = true,
		strict = true,
		dryRun = false
)	
	
	
	
public class testRunner {	
	

}
