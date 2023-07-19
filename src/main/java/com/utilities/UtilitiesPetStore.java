package com.utilities;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class UtilitiesPetStore {
	
	public static RequestSpecification spec;
	public static Response response;
	
	public Response requestMethods(String reqMethods, String URI) {
		switch (reqMethods) {
		case "GET":
			response = spec.log().all().get(URI);
			break;
		case "PUT":
			response = spec.log().all().put(URI);
			break;
		case "POST":
			response = spec.log().all().post(URI);
			break;
		case "DELETE":
			response = spec.log().all().delete(URI);
			break;
		default:
			break;
		}
		return response;
	}
	
	public void provideHeader(Header header) {
		spec = RestAssured.given().header(header);
	}
	public void provideHeader(Headers headers) {
		spec = RestAssured.given().headers(headers);
	}
	public void requestBody(String path) throws IOException {
		spec = spec.body(new String(Files.readAllBytes(Paths.get(path))));
	}
	public int statusCode() {
		return response.getStatusCode();
	}
	public String getPrettyResponseBody() {
		return response.getBody().asPrettyString();
	}
	public void assertValue(int value1, int value2) {
		Assert.assertEquals(value1, value2);
	}
	public void assertValue(String value1, String value2) {
		Assert.assertEquals(value1, value2);
	}
	public String parseValue(String json, String key) {
		return JsonParser.parseString(json).getAsJsonObject().get(key).toString();
	}
	
	

}
