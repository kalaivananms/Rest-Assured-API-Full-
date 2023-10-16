package Com.ems.Extra_Concepts;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class Serialization {

	//Data is Obtained

	@Test
	public void serialization () {
		Map<String, Object> jsonbody = new HashMap<String, Object>();

		List<String> skill = new ArrayList<String>();
		skill.add("Java");
		skill.add("Selenium");

		jsonbody.put("first_name", "Kalaivanan");
		jsonbody.put("last_name", "MS");
		jsonbody.put("email", "kalaivananMS@gmail.com");

		jsonbody.put("skill", skill);

		System.out.println(jsonbody);

		given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(jsonbody)
		.log()
		.all()
		.when()
		.post("/employees")
		.then()
		.log()
		.all();

	}


}
