package apiRequest.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetAPI001 {
	@Test
	public void get001() {
		Response res=get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		System.out.println(res.getBody().asString());
		System.out.println(res.getTime());
		System.out.println(res.getHeader("Content-Type"));
		int expected= 200;
		int actual=res.getStatusCode();
	  Assert.assertEquals(expected, actual);
		
		
	}
	@Test
	public void getapi002() {
		baseURI="https://reqres.in/api/users";
		given().queryParam("page","2").when().get().then().statusCode(200);
	
		}

}
