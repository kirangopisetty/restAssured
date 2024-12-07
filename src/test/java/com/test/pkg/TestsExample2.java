package com.test.pkg;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class TestsExample2 {

	@Test
	public void listUsersAPI() {
		
	given().
		header("Accept", "application/json").
		header("Content-Type", "application/json").
	
	when().
		get("https://reqres.in/api/users").
	
	then().
		statusCode(200).
		log().all();
	}
}