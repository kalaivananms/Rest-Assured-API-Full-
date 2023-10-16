package Com.ems.Json_schema_validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;
import com.networknt.schema.SpecVersion.VersionFlag;


public class NetworkNtJsonSchemaValidate {

	@Test
	public void vaildateJsonSchema() throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		JsonSchemaFactory factory = JsonSchemaFactory.getInstance(VersionFlag.V4);

		File inputjson = new File("src/test/resources/input.json");
		InputStream inputschema= new FileInputStream("src/test/resources/Schema.json"); 

		JsonNode jsonNode = mapper.readTree(inputjson);
		JsonSchema schema = factory.getSchema(inputschema);

		Set<ValidationMessage> result = schema.validate(jsonNode);

		if (result.isEmpty()) {
			System.out.println("No validation error");
		}
		else {
			for (ValidationMessage message : result) {
				System.out.println(message); 
			}

		}




	}
}
