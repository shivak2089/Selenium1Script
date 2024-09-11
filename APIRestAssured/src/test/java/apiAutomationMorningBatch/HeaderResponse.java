package apiAutomationMorningBatch;

import org.apache.http.Header;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HeaderResponse {

	@Test
	public void t1() {
		RequestSpecification resqspec =RestAssured.given();
		resqspec.baseUri("https://reqres.in");
		resqspec.basePath("/api/users/2");
		Response response = resqspec.get();
		//Validate Header response
		String header=response.getHeader("Connection");
		System.out.println(header);
		//Get all headers and print all headers
		Headers headerlist=response.getHeaders();
		for (io.restassured.http.Header header1:headerlist) {
			System.out.println("Key: "+header1.getName()+ "    "+"Value: "+header1.getValue());
			
		}
		
		
	}
}
