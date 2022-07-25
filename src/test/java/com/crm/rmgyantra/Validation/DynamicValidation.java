package com.crm.rmgyantra.Validation;

import javax.annotation.meta.When;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.List;

import io.restassured.response.Response;

public class DynamicValidation {

	@Test
	public void dynamicValidation() {

		String expectData = "SDET_8";

		Response res = when()
		.get("http://localhost:8084/projects/TY_PROJ_207");
		
		List<String> list = res.jsonPath().get("[2].projectName");

		for(String actualData : list) {

			if(expectData.equals(expectData)) {

				System.out.println(actualData+  "  :project is available");
				break;	
			}
		}

		res.then().log().all();

	}

}
