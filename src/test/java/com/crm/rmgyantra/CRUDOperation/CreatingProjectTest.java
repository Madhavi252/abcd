package com.crm.rmgyantra.CRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreatingProjectTest {
	
	@Test
	public void creatingProject() {
		
		
		//pre condition
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy","ABC");
		jobj.put("projectName","SDET_q1wq");
		jobj.put("status","created");
		jobj.put("teamSize","6");
		
		
		RequestSpecification reqspec = RestAssured.given();
		reqspec.contentType(ContentType.JSON);
		reqspec.body(jobj);
		
		//test action
		Response res = reqspec.post("http://localhost:8084/addProject");
		
		//post condition (verification)
		ValidatableResponse vres = res.then();
		vres.assertThat().statusCode(201);
		vres.log().all();
		
		reqspec.delete("http://localhost:8084/projects/TY_PROJ_203");
		
		
		
		
	}

}








