package com.crm.rmgyantra.Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticValidationTest {
	
	@Test
	public void staticValidation() {
		
		String expectedData="SDET_9";
		
		Response res = when()
		.get("http://localhost:8084/projects");
		
		String actualData = res.jsonPath().get("projectName");
		
		Assert.assertEquals(expectedData, actualData);
		
		res.then().log().all()
		
	}
	

}
