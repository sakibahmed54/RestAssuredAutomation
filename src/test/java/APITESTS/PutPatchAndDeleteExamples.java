package APITESTS;

import static io.restassured.RestAssured.*;


import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchAndDeleteExamples {
	@Test
	public void testPut() {
		
	
		JSONObject request =new JSONObject();
		request.put("name","Sakib");
		request.put("job","Engineer");
		System.out.println(request.toJSONString());
		baseURI="https://reqres.in/api";
		given().
		header("x-api-key", "reqres-free-v1").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		 body(request.toJSONString()).
		when().
		 put("/users/2").
		then().
		 statusCode(200).
		 log().all();
		
	}
	
	@Test
	public void testPatch() {
		
	
		JSONObject request =new JSONObject();
		request.put("name","Nisha");
		request.put("job","Engineer");
		System.out.println(request.toJSONString());
		baseURI="https://reqres.in";
		given().
		header("x-api-key", "reqres-free-v1").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		 body(request.toJSONString()).
		when().
		 patch("/api/users/2").
		then().
		 statusCode(200).
		 log().all();
		
	}
	@Test
	public void testDelete() {
		
	
		
		baseURI="https://reqres.in";
		given().
		header("x-api-key", "reqres-free-v1").
		
		when().
		 delete("/api/users/2").
		then().
		 statusCode(204).
		 log().all();
		
	}
	

}
