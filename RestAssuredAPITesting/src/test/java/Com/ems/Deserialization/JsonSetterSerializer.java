package Com.ems.Deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterSerializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		String json ="{\r\n" + 
				"  \"name\" : \"Kalaivanan\",\r\n" + 
				"  \"email\" : \"KalaivananMS@gmail.com\",\r\n" + 
				"  \"employeeID\" : 3\r\n" + 
				"}"; 

		ObjectMapper mapper = new ObjectMapper();

		JsonSetterPojo pojo = mapper.readValue(json, JsonSetterPojo.class);

		System.out.println(pojo.getId());





	}

}
