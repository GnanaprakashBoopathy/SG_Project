package com.hooksclass;

import com.utilities.Utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class HooksClass {
	
	@Before
	public void takeScenario(Scenario scenario) {
		Utilities.scenario = scenario;
	}

}
