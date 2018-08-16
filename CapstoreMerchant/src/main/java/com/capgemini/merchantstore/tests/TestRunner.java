package com.capgemini.merchantstore.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue= {"com.capgemini.merchantstore.stepdefinitions"},
		dryRun = true
		)
public class TestRunner {
	
}
