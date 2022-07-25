package com.crm.rmgyantra.Validation;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;


public class HamcrestMatchersTest {
	
	@Test
	public void hamcret() {
		
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().time(Matchers.lessThan(5000l), TimeUnit.MILLISECONDS)
		.assertThat().body("[3].projectName", Matchers.equalTo("SDET_9"))
		.log()
		.all();
		
	}
	

}
