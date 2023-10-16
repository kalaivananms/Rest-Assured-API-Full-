package Com.ems.Json_schema_validation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestMatcherjsonschemavalidation {

	@Test
	public void validate() throws IOException {

		File inputjson = new File("src/test/resources/input.json");
		//String jsoncontent = FileUtils.readFileToString(inputjson,"UTF-8");
		File jsonschema = new File("src/test/resources/Schema.json");

		MatcherAssert.assertThat("{\r\n" + 
				"    \"first_name\": \"Kalaivanan\",\r\n" + 
				"    \"last_name\": \"MS\",\r\n" + 
				"    \"email\":\"KalaivananMs@king.com\",\r\n" + 
				"    \"Skills\":[\"creating time machine\",\"playing with giutar\"]\r\n" + 
				"}", JsonSchemaValidator.matchesJsonSchema(jsonschema) );

	}
}
