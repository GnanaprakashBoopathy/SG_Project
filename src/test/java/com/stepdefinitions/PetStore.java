package com.stepdefinitions;

import java.io.IOException;
import java.util.ArrayList;

import com.endpoint.EndPoints;
import com.resourcelocation.JsonFileLocation;
import com.utilities.Utilities;
import com.utilities.UtilitiesPetStore;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.Header;
import io.restassured.http.Headers;

public class PetStore extends UtilitiesPetStore{

@Given("Insert the Header and Body for Creating the Pet details")
public void insert_the_Header_and_Body_for_Creating_the_Pet_details() throws IOException {
	ArrayList<Header> headersList = new ArrayList<Header>();
	headersList.add(new Header("accept", "application/json"));
	headersList.add(new Header("Content-Type", "application/json"));
	Headers headers = new Headers(headersList);
	
	provideHeader(headers);
	requestBody(JsonFileLocation.create);
}

@Given("Use the Post HTTP method and Pass the Endpoint")
public void use_the_Post_HTTP_method_and_Pass_the_Endpoint() {
	requestMethods("POST", EndPoints.create);
}

@Then("Validate the status code and name")
public void validate_the_status_code_and_name() {
	assertValue(statusCode(), 200);
	new Utilities().logText(getPrettyResponseBody());
	assertValue(parseValue(getPrettyResponseBody(), "name"), "\"doggie\"");
}




@Given("Insert the Header for Retriving the Pet details")
public void insert_the_Header_for_Retriving_the_Pet_details() {
	provideHeader(new Header("accept", "application/json"));
}

@Given("Use the Get HTTP method and Pass the Endpoint")
public void use_the_Get_HTTP_method_and_Pass_the_Endpoint() {
	requestMethods("GET", EndPoints.retrive);
}

@Then("Validate the status code")
public void validate_the_status_code() {
	assertValue(statusCode(), 200);
	new Utilities().logText(getPrettyResponseBody());	
}




@Given("Insert the Header and Body for Updating the Pet details")
public void insert_the_Header_and_Body_for_Updating_the_Pet_details() throws IOException {
	ArrayList<Header> headersList = new ArrayList<Header>();
	headersList.add(new Header("accept", "application/json"));
	headersList.add(new Header("Content-Type", "application/json"));
	Headers headers = new Headers(headersList);
	
	provideHeader(headers);
	requestBody(JsonFileLocation.update);
}

@Given("Use the Put HTTP method and Pass the Endpoint")
public void use_the_Put_HTTP_method_and_Pass_the_Endpoint() {
	requestMethods("PUT", EndPoints.update);
}

@Then("Validate the status code and updated name")
public void validate_the_status_code_and_updated_name() {
	assertValue(statusCode(), 200);
	new Utilities().logText(getPrettyResponseBody());
	assertValue(parseValue(getPrettyResponseBody(), "name"), "\"cat\"");
}




@Given("Insert the Header for Deleting the Pet details")
public void insert_the_Header_for_Deleting_the_Pet_details() {
	provideHeader(new Header("accept", "application/json"));
}

@Given("Use the Delete HTTP method and Pass the Endpoint")
public void use_the_Delete_HTTP_method_and_Pass_the_Endpoint() {
	requestMethods("DELETE", EndPoints.delete);
}

@Then("Validate the status code for deletion of details")
public void validate_the_status_code_for_deletion_of_details() {
	assertValue(statusCode(), 200);
	new Utilities().logText(getPrettyResponseBody());
}

}
