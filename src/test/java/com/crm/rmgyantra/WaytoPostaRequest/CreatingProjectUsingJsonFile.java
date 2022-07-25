package com.crm.rmgyantra.WaytoPostaRequest;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreatingProjectUsingJsonFile {
	
	@Test
	public void createProject() {
		
		File f= new File("./Project.json");
		
		given()
		.contentType(ContentType.JSON)
		.body(f)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log()
		.all();

	}

}
