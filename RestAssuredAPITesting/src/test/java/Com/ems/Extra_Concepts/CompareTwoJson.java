package Com.ems.Extra_Concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareTwoJson {

	static String json1  = "{\r\n" + 
			"  \"firstName\" : \"kalaivanan\",\r\n" + 
			"  \"email\" : \"Kalaivanams@gmail.com\",\r\n" + 
			"  \"skills\" : [ \"Java\", \"Selenium\" ],\r\n" + 
			"  \"lastName\" : \"MS\"\r\n" + 
			"}";
	static String json2 ="{\r\n" + 
			"  \"firstName\" : \"kalaivanan\",\r\n" + 
			"  \"email\" : \"Kalaivanams@gmail.com\",\r\n" + 
			"  \"skills\" : [ \"Java\", \"Selenium\" ],\r\n" + 
			"  \"lastName\" : \"MSk\"\r\n" + 
			"}";

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		ObjectMapper mapper= new ObjectMapper();
		JsonNode node = mapper.readTree(json1);
		JsonNode node2 = mapper.readTree(json2); 

		System.out.println(node.equals(node2));

	}

}
