package APITESTS;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TestonLocalAPI {
//@Test
 public void get() {
	baseURI="http://localhost:3000";
	given().
	   get("/users").
	 then().
	    statusCode(200).
	    log().all();
	    
	   
	
	   
	
}
 //@Test
 public void post() {
	 JSONObject request =new JSONObject();
	    request.put("FirstName","Sakib");
		request.put("LastName","Ahmad");
		request.put("SubjectId",1);
		
	baseURI="http://localhost:3000";
	given().
	   contentType(ContentType.JSON).
	   accept(ContentType.JSON).
	   body(request.toJSONString()).
	 when().
	   post("/users").
	 then().
	    statusCode(201).  
	  
	    log().all();
	    
	   
	
	   
	
}
// @Test
 public void put() {
	 JSONObject request =new JSONObject();
	    request.put("FirstName","Nakib");
		request.put("LastName","Ahmad");
		request.put("SubjectId",4);
		
	baseURI="http://localhost:3000";
	given().
	   contentType(ContentType.JSON).
	   accept(ContentType.JSON).
	   body(request.toJSONString()).
	 when().
	   put("/users/3").
	 then().
	    statusCode(200).  
	  
	    log().all();
	    

}
 //@Test
 public void patch() {
	 JSONObject request =new JSONObject();
	
		request.put("LastName","Abrar");
		
		
	baseURI="http://localhost:3000";
	given().
	   contentType(ContentType.JSON).
	   accept(ContentType.JSON).
	   body(request.toJSONString()).
	 when().
	   patch("/users/3").
	 then().
	    statusCode(200).  
	  
	    log().all();
	    

}
 @Test
 public void Delete() {
	 baseURI="http://localhost:3000";
	 when().delete("/users/2").then().statusCode(200);
 }
}
