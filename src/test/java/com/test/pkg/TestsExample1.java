package com.test.pkg;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class TestsExample1 {

	@Test
	public void listUsersAPI() {
		
	given().
		header("Accept", "application/json").
		header("Content-Type", "application/json").
	
	when().
		get("https://reqres.in/api/users/2").
	
	then().
		statusCode(200).
		log().all();
	}
}