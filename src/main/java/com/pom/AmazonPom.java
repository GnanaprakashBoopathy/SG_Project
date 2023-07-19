package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Utilities;

public class AmazonPom extends Utilities {
	public AmazonPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#twotabsearchtextbox")
	private WebElement searchBox;

	@FindBy(xpath= "//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-3\"]//h2//span")
	private WebElement result1;
	
	@FindBy(css = "#nav-search-submit-button")
	private WebElement searchBtn;
	
	
	
	
	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getResult1() {
		return result1;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	
	
	
	

}
