package Com.ems.Deserialization;

import java.io.IOException;

import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JackSonInjectsdeserializer {

	public static void main(String[] args) throws IOException {

		String json = "{\r\n" + 
				"    \"email\":\"kalaivanan@kings.com\",\r\n" + 
				"    \"id\":3\r\n" + 
				"}";

		InjectableValues values= new InjectableValues.Std()
				.addValue(String.class, "Kalaivanan");

		ObjectMapper mapper = new ObjectMapper();
		ObjectReader reader = mapper.reader(values);
		JacksonInjectpojo pojo = reader.readValue(json,JacksonInjectpojo.class);
		System.out.println(pojo.getName());

	}

}
