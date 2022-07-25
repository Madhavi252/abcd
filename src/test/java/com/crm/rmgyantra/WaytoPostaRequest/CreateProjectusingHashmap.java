 package com.crm.rmgyantra.WaytoPostaRequest;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectusingHashmap {

	
	@Test
	public void createProject() {
		
		HashMap hp = new HashMap();
		hp.put("createdBy","ABC");
		hp.put("projectName","SDET_qyq");
		hp.put("status","created");
		hp.put("teamSize","6");
		
		given()
		.contentType(ContentType.JSON)
		.body(hp)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log()
		.all();
		
	}
}

















