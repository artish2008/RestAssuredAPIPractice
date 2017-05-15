package com.RestAssured.FirstTest;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static junit.framework.Assert.*;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

public class TestGETRestAssured {
	
	//http://localhost:8085/student/list
	
	@BeforeClass
	public static void setup(){
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8085;
		RestAssured.basePath="/student";
		
		
		
	}
	
	@Test
	public void HTTPGETStudentDetails(){
		//given when then is methods of Request Specification library
		
		Response rr=given()
				.when()
				.get("/list");
				System.out.println(rr.body().prettyPrint());
				
	//validate status code 
		given()
		
		.when()
		.get("/list")
		
		.then()
		.statusCode(200);
		}
	
	//validate the get parameters 
	
	/*@Test
	public void TestGETPARAM(){
		Response response3=(Response) given()
				
				.param("programme", "Mechanical Engineering")
				.param("limit",2)
				
				.when()
				.get("/list")
				
				.then();
				System.out.println(response3.prettyPeek());
	}
	*/
}
