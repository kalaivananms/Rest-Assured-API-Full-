package Com.ems.BDDStyle;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllemployeesbddStyle {

	@Test
	public void getAllemploees() {


		given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/employees")
		.prettyPrint();
	}
	@Test (enabled =false)
	public void createanemployeeBDD() {

		given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\r\n" + 
				"    \"first_name\": \"sastika\",\r\n" + 
				"    \"last_name\": \"Rajendhren\",\r\n" + 
				"    \"email\":\"sastika@reqres.in\"\r\n" + 
				"}")
		.when()
		.post("/employees")
		.prettyPrint();

	}

	@Test(enabled =false)
	public void updateanemployeeBDD() {

		given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\r\n" + 
				"    \"first_name\": \"sastika\",\r\n" + 
				"    \"last_name\": \"Rajendhren\",\r\n" + 
				"    \"email\":\"sastika@reqres.in\"\r\n" + 
				"}")
		.when()
		.put("/employees/8")
		.prettyPrint();
	}

	@Test(enabled =false)
	public void deleteanemployee() {

		given()
		.baseUri("http://localhost:3000")
		.when()
		.delete("/employees/34")
		.prettyPrint();
	}

	@Test(enabled=false)
	public void createEmployeeFromJsonFile() {

		File jsonfile = new File("postData.json");
		given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(jsonfile)
		.when()
		.post("/employees")
		.prettyPrint();

	}

}
