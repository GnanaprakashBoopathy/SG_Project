package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =  {"./src/test/resources/FeatureFiles/"},
		glue = {"com.stepdefinitions","com.hooksclass"},
		monochrome = true,
		dryRun = false,
		plugin = { "pretty","html:./Reports"},
		tags = "@amazon,@petstore"
		)
public class Runner {

}
