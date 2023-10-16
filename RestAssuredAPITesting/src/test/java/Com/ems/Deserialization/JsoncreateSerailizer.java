package Com.ems.Deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsoncreateSerailizer {
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String json ="{\r\n" + 
				"  \"employeeID\" : 3,\r\n" + 
				"  \"name\" : \"Kalaivanan\",\r\n" + 
				"  \"email\" : \"KalaivananMS@gmail.com\"\r\n" + 
				"}";
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonCreatePojo pojo = mapper.readValue(json, JsonCreatePojo.class);
		
		System.out.println(pojo.getId());
		System.out.println(pojo.getName());
		System.out.println(pojo.getEmail());
	}

}
