package com.pom;

public class PageObjectManager {
	
	AmazonPom homePage;

	
	
	
	
	public AmazonPom getHomePage() {
		return homePage == null ? homePage = new AmazonPom() : homePage;
	}
	
	
	
	

}
