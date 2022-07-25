package com.crm.rmgyantra.CRUDOperation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GettingProjectTest {

	@Test
	public void getProjectTest() {

		Response rsps =RestAssured.get("http://localhost:8084/projects");

		//System.out.println(rsps.asString());

		//		rsps.prettyPrint();
		//		
		//		RestAssured.delete("http://localhost:8084/projects/TY_PROJ_002");

//		int status = rsps.getStatusCode();
//		System.out.println(status);
//		 Assert.assertEquals(status, 201);



				ValidatableResponse vres = rsps.then();
				System.out.println(vres.assertThat().statusCode(200));
				vres.assertThat().contentType("application/json");
				RestAssured.delete("http://localhost:8084/projects/TY_PROJ_202");
				vres.log().all();



	}

}










