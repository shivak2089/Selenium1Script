package apiRequest.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateResponseBody {
	@Test
	public void userlistResponsebody() {
		RequestSpecification reqspec =RestAssured.with();
		reqspec.baseUri("https://reqres.in/");
		reqspec.basePath("/api/users?page=2");
		Response response=reqspec.get();
		ResponseBody responsebody=response.getBody();
		String responseString =responsebody.asString();
		System.out.print("ResponseBody"+responseString);
		
	//	Assert.assertEquals(responseString.contains("George"),true,"Check for presense of George");
		
		JsonPath Jsonpathview=responsebody.jsonPath();
		//x.data[4].first_name
		String FirstName=Jsonpathview.get("data[2].last_name");
		Assert.assertEquals(FirstName, "Wong","Check for Email for Id 5");
		
	}

}
