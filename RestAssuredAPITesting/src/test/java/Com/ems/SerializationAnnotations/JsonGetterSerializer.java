package Com.ems.SerializationAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetterSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonGetterPojo pojo = new JsonGetterPojo();
		
		pojo.setId(3);
		pojo.setName("Kalaivanan");
		pojo.setEmail("KalaivananMS@gmail.com");
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(pojo);
		
		System.out.println(json);
		
	}
}
