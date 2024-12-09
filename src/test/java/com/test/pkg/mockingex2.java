package com.test.pkg;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class mockingex2 {

	@Test
	public void wiremockeg1() {			
		given().
		
		when().
			get("http://localhost:8080/file1.xml").
		
		then().
			statusCode(200).
			log().all();
	}
	
}