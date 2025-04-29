package APITESTS;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.baseURI;

public class SoapXMLRequest {
	@Test
	public void validateSoapXML() {
		baseURI="http://www.dneonline.com";
		given().
		 contentType("text/xml").accept (ContentType.XML).
		 body()
}
}
