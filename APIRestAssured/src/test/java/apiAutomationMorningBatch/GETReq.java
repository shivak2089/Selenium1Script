package apiAutomationMorningBatch;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GETReq {

	public static void main(String[] args) {
  RequestSpecification req = RestAssured.given();
  req.baseUri("https://reqres.in/");
  req.basePath("api/users?page=2");
  
  Response res= req.get();
 int statuscode= res.getStatusCode();
 ResponseBody responsebody=res.getBody();
 String Result= responsebody.asString();
 System.out.println("GET Request Response"+Result);
	}

}
