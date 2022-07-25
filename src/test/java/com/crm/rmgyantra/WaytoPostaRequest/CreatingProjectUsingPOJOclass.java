package com.crm.rmgyantra.WaytoPostaRequest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.crm.rmgyantra.POJOLibrary.POJO;

import io.restassured.http.ContentType;

public class CreatingProjectUsingPOJOclass {
	
	@Test
	public void creatProject() {
		
		POJO p= new POJO("madhavi", "sdetsdet", "created", 10);
		
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log()
		.all();
	}

}
