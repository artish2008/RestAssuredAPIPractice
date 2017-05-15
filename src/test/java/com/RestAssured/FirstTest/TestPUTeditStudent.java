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


public class TestPUTeditStudent {
	
	@BeforeClass
	public static void setup(){
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8085;
		RestAssured.basePath="/student";
		
	}
	
	@Test
	public void CreatenewStudentPOST(){
		
		List<String> course=new ArrayList<String>();//arraylist class is ilpementing List Interface
		course.add("computer1");
		course.add("maths1");
		
		StudentPOJO ss= new StudentPOJO();
		ss.setFirstName("arti1");
		ss.setLastName("sharma1");
		ss.setEmail("aabb@gmail.com");
		ss.setProgramme("MBAAA");
		ss.setCourses(course);
		
	 given()
    .contentType(ContentType.JSON)
		
	.when()
	.body(ss)
		.put()
		
		.then()
		.statusCode(201);
		
	}
}
