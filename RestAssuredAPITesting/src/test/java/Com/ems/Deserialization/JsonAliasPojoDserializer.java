package Com.ems.Deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAliasPojoDserializer {


	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		String json ="{\r\n" + 
				"\"empId\":3,\r\n" + 
				"\"name\":\"Kalaivanan\",\r\n" + 
				"\"email\":\"Kalaivanan@king.com\"\r\n" + 
				"}";


		ObjectMapper mapper = new ObjectMapper();
		JsonAliasPojo pojo = mapper.readValue(json, JsonAliasPojo.class);

		//JsonAliasPojo pojo=new ObjectMapper().readerFor(JsonAliasPojo.class).readValue(json);

		System.out.println(pojo.getId());
	}
}
