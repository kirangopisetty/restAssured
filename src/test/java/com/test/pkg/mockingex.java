package com.test.pkg;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class mockingex {

	@Test
	public void wiremockeg1() {			
		given().
		
		when().
			get("http://localhost:8080/helloWorld").
		
		then().
			statusCode(200).
			log().all();
	}
	
}