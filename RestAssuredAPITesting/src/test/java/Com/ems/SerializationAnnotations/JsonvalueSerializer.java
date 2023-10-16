package Com.ems.SerializationAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonvalueSerializer {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		JsonValuePojo pojo = new  JsonValuePojo();
		pojo.setId(7);
		pojo.setFirstname("Kalaivanan");
		pojo.setLastname("MS");
		pojo.setEmail("Kalaivananms@gmail.com");
		
		ObjectMapper mapper = new ObjectMapper();

		String json = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(pojo);

		System.out.println(json);
		
		
	}

}
