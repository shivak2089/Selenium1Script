package apiRequest.com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicAutorization {
	@Test
	public void basicauth() {
		RequestSpecification reqspec =RestAssured.given();
		reqspec.baseUri("http://postman-echo.com");
		reqspec.basePath("/basic-auth");
		Response response=reqspec.auth().basic("postman", "password").get();
		System.out.println("Response Status:"+response.statusLine());
		
		
	}

}
