package apiRequest.com;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PostRequest {
	
	@Test
	public void testpost() {
		
		JSONObject jsnobj = new JSONObject();
		jsnobj.put("Shivaji","AutomationQAEngineer");
		jsnobj.put("Name","JOB");
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().header("Content-Type","application/json").contentType(ContentType.JSON)
		.body(jsnobj.toJSONString()).when().post().then().statusCode(201).log().all();
		
	}

}
