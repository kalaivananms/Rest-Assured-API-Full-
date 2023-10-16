package Com.ems.Deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetterdeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String json ="{\r\n" + 
				"    \"firstName\" : \"kalaivanan\",\r\n" + 
				"    \"lastName\" : \"MS\",\r\n" + 
				"    \"email\" : \"Kalaivananms@king.com\",\r\n" + 
				"    \"skills\" : [ \"java\", \"Selenium\" ]\r\n" + 
				"  }";
		
		
		ObjectMapper mapper = new ObjectMapper();
		JsonAnySetterPojo pojo = mapper.readValue(json, JsonAnySetterPojo.class);
		
		
		System.out.println(pojo.getEmployee());
		
	}
}
