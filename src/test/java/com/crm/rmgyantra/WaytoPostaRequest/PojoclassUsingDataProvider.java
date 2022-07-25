package com.crm.rmgyantra.WaytoPostaRequest;

import org.junit.experimental.theories.DataPoint;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.rmgyantra.POJOLibrary.POJO;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PojoclassUsingDataProvider {

	@Test(dataProvider = "getData")
	public void createProjects(String createdBy, String projectName, String status, int teamSize) {

		POJO p = new POJO(createdBy, projectName, status, teamSize);

		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log()
		.all();
	}

@DataProvider
public void getData() {
	
	Object[][] objArr = new Object[2][4];
	
	objArr[0][0] = "Madhavi";
	objArr[0][1] = "Trolfar";
	objArr[0][2] = "created";
	objArr[0][3] = 7;
	
	objArr[0][0] = "Madhavi1";
	objArr[0][1] = "Trolfar1";
	objArr[0][2] = "created";
	objArr[0][3] = 7;

}

}











