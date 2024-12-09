package com.test.pkg;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.qameta.allure.Step;

public class TestsExample1 {

	@Step ("Test cases 001")
	@Test
	public void listUsersAPI1() {
		
	given().
		header("Accept", "application/json").
		header("Content-Type", "application/json").
	
	when().
		get("https://reqres.in/api/users/2").
	
	then().
		statusCode(200).
		log().all();
	}
	
	@Step ("Test cases 002")
	@Test
	public void listUsersAPI2() {
		
	given().
		header("Accept", "application/json").
		header("Content-Type", "application/json").
	
	when().
		get("https://reqres.in/api/users/3").
	
	then().
		statusCode(200).
		log().all();
	}
}