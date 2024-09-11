package apiAutomationMorningBatch;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetAPIRequest {
	
	@Test
	
	public void getreq() {
		
		RequestSpecification getreq01 = RestAssured.given();
		getreq01.baseUri("https://reqres.in/");
		getreq01.basePath("api/users?page=2");
		Response resp = getreq01.get();
		int statuscode = resp.getStatusCode();
		System.out.println(statuscode);
	    ResponseBody responsebody = resp.getBody();
	    String responsebdy = responsebody.asString();
		System.out.println("MY RESPONSE BODY"+ responsebdy);
		
		
		
		
		
		
	}

}
