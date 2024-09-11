package apiAutomationMorningBatch;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_Post {
	@Test
	public void testPost() {
		JSONObject jsondata = new JSONObject();
		jsondata.put("Name", "Rohan");
		jsondata.put("Role", "SDET_DEV");
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().header("Content-Type","Application/JSON").
		contentType(ContentType.JSON).
		body(jsondata.toJSONString()).
		when().
		post().
		then().
		statusCode(201).log().all();
		
		
		
	}

}
