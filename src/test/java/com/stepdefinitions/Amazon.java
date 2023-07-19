package com.stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.pom.PageObjectManager;
import com.resourcelocation.DataSheetLocation;
import com.utilities.Utilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon extends Utilities{
	
	String dsLocation = DataSheetLocation.dataSheet;
	String pageName = "TestData";
	
	@Given("Goto Amazon url")
	public void goto_Amazon_url() {
		launchBrowser("chrome");
		iWait(10);
		enterUrl("https://www.amazon.in/");	
	}

	@When("Search for iPhone")
	public void search_for_iPhone() throws FileNotFoundException, IOException {
		pom = new PageObjectManager();
		
		textInput(pom.getHomePage().getSearchBox(), excelRead(dsLocation, pageName, 1, "Data"));
		clickAction(pom.getHomePage().getSearchBtn());
	}

	@Then("Validate the first result contains iPhone")
	public void validate_the_first_result_contains_iPhone() {
		if (textFromElement(pom.getHomePage().getResult1()).contains("iPhone")) {
			logText("The Result contains iPhone");
		}
		else {
			logText("The Result does not contains iPhone");
		}
		
		driver.quit();
	}
}
