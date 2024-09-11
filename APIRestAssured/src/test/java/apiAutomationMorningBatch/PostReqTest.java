package apiAutomationMorningBatch;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PostReqTest {

	@Test
	public void postTest() {
		
		JSONObject jobject = new JSONObject();
		jobject.put("Name", "Rajesh");
		jobject.put("Role", "Lead");
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RestAssured.given().header("Content-Type","Application/JSON").
		contentType(ContentType.JSON).body(jobject.toJSONString())
		.when()
		.post()
		.then()
		.statusCode(201)
		.log().all();
		
		
		
		
		
	}
	
	}

