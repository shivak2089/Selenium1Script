package apiRequest.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class HTTPResponsestatusValidation {
	@Test
public void getSingleUser() {
	RestAssured.baseURI="https://reqres.in/api/users/2";
	RequestSpecification reqspec = RestAssured.given();
	Response respon=reqspec.get();
//	int statuscode=respon.getStatusCode();
//	int expectedstatuscode=200;
//	//Assert.assertEquals(statuscode, expectedstatuscode);
//	String StatusLine=respon.getStatusLine();
//	Assert.assertEquals(StatusLine, "HTTP/1.1 200 OK");
//	
	ValidatableResponse validRespo=respon.then();
	validRespo.statusCode(200);
	validRespo.statusLine("HTTP/1.1 200 OK");
}
}
