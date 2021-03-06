package com.RestAssured.FirstTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.RestAssured.studentPOJO.StudentPOJO;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;


public class TestDeletestudent {
	
	@BeforeClass
	public static void setup(){
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8085;
		RestAssured.basePath="/student";
		
	}
	
	@Test
	public void TestHTTPfetch(){
		
		List<String> course=new ArrayList<String>();//arraylist class is ilpementing List Interface
		course.add("computer");
		course.add("maths");
		
		StudentPOJO ss= new StudentPOJO();
		ss.setFirstName("arti");
		ss.setLastName("sharma");
		ss.setEmail("patchyyaa@gmail.com");
		ss.setProgramme("MBA");
		ss.setCourses(course);
		
	 given()
    .contentType(ContentType.JSON)
		
	.when()
	.body(ss)//POST create with POJO, put(edit), fetch( parial edit ) will always have body
		.delete("/100")
		
		.then()
		.statusCode(200);
		
	}
}