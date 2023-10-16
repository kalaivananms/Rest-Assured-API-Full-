package Com.ems.Extra_Concepts;

import static io.restassured.RestAssured.given;

import javax.annotation.meta.When;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationExample {

	RequestSpecification rs;


	@BeforeSuite
	public void SetrequestSpecification() {

		rs = given()
				.baseUri("http://localhost:3000")
				.basePath("/employees");
		RestAssured.requestSpecification=rs;
	}

	@Test
	public void getAllemploees() {

		given()

		.when()
		.get()
		.prettyPrint();
	}

	@Test
	public void getAnemploee() {
		given()

		.when()
		.get("/8")
		.prettyPrint();
	}

	@Test
	public void createAnemployeeBDD() {

		RequestSpecification specification = given()
				.contentType(ContentType.JSON)
				.baseUri("http://localhost:3000")
				.basePath("/employees");

		given()

		.body("{\r\n" + 
				"  \"firstName\" : \"Kalaivanan\",\r\n" + 
				"  \"lastName\" : \"MSK\",\r\n" + 
				"  \"email\" : \"Kalaivananms@king.com\"\r\n"+
				"\r\n"+
				"}")
		.when()
		.post()
		.prettyPrint();


	}



}
