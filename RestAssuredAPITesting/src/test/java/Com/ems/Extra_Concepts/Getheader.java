package Com.ems.Extra_Concepts;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class Getheader {
	
	public static void main(String[] args) {
		RestAssured .baseURI="http://localhost:3000";
		RestAssured.basePath="/employees";
		RequestSpecification requestSpecification = 
				RestAssured
				.given()
				.header("Content-Type","application/json")
				.body("{\r\n"  
						+"    \"first_name\": \"Kalai\",\r\n" 
						+"    \"last_name\": \"MSK\",\r\n"  
						+"    \"email\": \"msk@gmail.com\"\r\n" 
						+"\r\n"
						+"}");
		Response response = requestSpecification.request(Method.POST);
		
		QueryableRequestSpecification query = SpecificationQuerier .query(requestSpecification);

		System.out.println(query.getHeaders());
		System.out.println(query.getBaseUri());
		System.out.println(query.getBasePath());
		

		
	}

}
