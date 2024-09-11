package apiAutomationMorningBatch;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest {
	@Test
	public void get01() {
		Response response =RestAssured.get("https://petstore.swagger.io/v2/pet/1");
		
		System.out.println("Response details  "+response.getStatusCode());
		System.out.println("Response Body  "+response.getBody());
		System.out.println("Response Time  "+response.getTime());
		System.out.println("Response Header  "+response.getHeader("Content-Type"));
		int expectstatuscode = 200;
		int statuscode =response.getStatusCode();
		Assert.assertEquals(expectstatuscode, statuscode);
		
	}
	@Test
	public void get02() {
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().queryParam("Page", "2").when().get().then().statusCode(200);
	}

}
