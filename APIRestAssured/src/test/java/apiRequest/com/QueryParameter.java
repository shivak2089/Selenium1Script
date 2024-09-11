package apiRequest.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParameter {
	@Test
	public void queryparam() {
		RequestSpecification reqspec=RestAssured.given();
		reqspec.baseUri("https://reqres.in");
		reqspec.basePath("/api/users");
		reqspec.queryParam("page", 2).queryParam("id", 10);
		//Perform Get request
		Response response=reqspec.get();
		String responseString=response.getBody().asString();
		System.out.println("Response Body:"+responseString);
		JsonPath jsonPathView =response.jsonPath();
		String jsonpathStrin=jsonPathView.get("data.first_name");
		Assert.assertEquals(jsonpathStrin, "Byron","Verify First_Name");
		
		
		
	}

}
