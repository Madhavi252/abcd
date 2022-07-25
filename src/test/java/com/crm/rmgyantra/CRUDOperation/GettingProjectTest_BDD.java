package com.crm.rmgyantra.CRUDOperation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GettingProjectTest_BDD {
	
	@Test
	public void gettingProject() {
		
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat()
		.statusCode(200)
		.log()
		.all();
	}
	
	
	

}
