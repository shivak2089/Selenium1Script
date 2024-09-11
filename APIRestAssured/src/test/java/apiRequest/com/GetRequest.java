package apiRequest.com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	@Test
	public void get() {
		Response res=RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());

	}

}
