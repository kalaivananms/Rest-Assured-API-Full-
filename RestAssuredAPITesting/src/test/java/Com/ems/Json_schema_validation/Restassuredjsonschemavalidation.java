package Com.ems.Json_schema_validation;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.internal.support.FileReader;
import io.restassured.module.jsv.JsonSchemaValidator;


public class Restassuredjsonschemavalidation {

	@Test(enabled =false)
	public void  validationusingjsonschemaInclassPath() {

		File inputjson = new File("src/test/resources/input.json");
		//File SchemaJson = new File("src/test/resources/Schema.json");

		RestAssured 
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputjson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema.json")); 
	}

	@Test
	public void vaildationusingMatchesJsonSchema() throws FileNotFoundException {

		File inputjson = new File("src/test/resources/input.json");
		File inputSchema = new File("src/test/resources/Schema.json");
		InputStream inputschema = new FileInputStream("src/test/resources/Schema.json");
		//FileReader inputSchemaa = new FileReader(); 

		RestAssured 
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputjson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(inputSchema));
	}

}
