package Com.ems.SerializationAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRawValueserializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonRawValuePojo pojo = new JsonRawValuePojo();
		pojo.setId(7);
		pojo.setFirstName("Kalaivanan");
		pojo.setLastName("MS");
		pojo.setEmail("Mr.k@King.com");
		
		ObjectMapper mapper = new ObjectMapper();

		String json = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(pojo);

		System.out.println(json);
	}
}
