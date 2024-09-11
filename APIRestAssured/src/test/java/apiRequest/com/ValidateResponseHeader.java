package apiRequest.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateResponseHeader {
	@Test
	public void singleuserrespon() {
		RequestSpecification reqspec = RestAssured.given();
		reqspec.baseUri("https://reqres.in");
		reqspec.basePath("/api/users/2");
		Response respon =reqspec.get();	
		String ContentType=respon.header("Content-Type");
		System.out.println(ContentType);
		Headers headersList=respon.getHeaders();
		for(Header header:headersList) {
			System.out.println("Header Key"+ header.getName()+"Header Value"+ header.getValue());
		}
		Assert.assertEquals(ContentType, "application/json; charset=utf-8","Header-ContentType Missmatch");
		
	}

}
