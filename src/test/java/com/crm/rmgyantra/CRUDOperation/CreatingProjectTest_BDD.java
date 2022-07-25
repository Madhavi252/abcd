package com.crm.rmgyantra.CRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreatingProjectTest_BDD {
	
	@Test
	public void creatingProject() {
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy","ABDE");
		jobj.put("projectName","SDET_jg1gh2f");
		jobj.put("status","ongoing");
		jobj.put("teamSize","10");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8084/addProject")
		//.put("http://localhost:8084/projects/TY_PROJ_206")
		.then()
		.assertThat()
		.statusCode(201)
		.log()
		.all();
		
		
	}

}











