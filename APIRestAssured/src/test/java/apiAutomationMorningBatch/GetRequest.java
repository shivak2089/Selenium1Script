package apiAutomationMorningBatch;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	@Test
	public void gettest01() {
		
		Response response =RestAssured.get("https://reqres.in/api/users?page=2");
		
	    System.out.println("Response body "+ response.getBody());
		System.out.println("Response Body In String "+response.asString());
		System.out.println("StatusCode "+response.getStatusCode());
		System.out.println("Response Time "+response.getTime());
		
		RestAssured.baseURI ="https://reqres.in/api/users?page=2";
		RequestSpecification requestspec =RestAssured.given();
		
		
		
		
		
		
		
		
		
		
		
	}

}
