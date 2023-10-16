package Com.ems.Pojo_Concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationAndDeserialization {

	ObjectMapper mapper = new ObjectMapper();
	String employeejson;

	public void serialize() throws JsonProcessingException {



		Employee employee1 = new Employee();
		employee1.setFirstName("Kalaivanan");
		employee1.setLastName("MSK");
		employee1.setEmail("Kalaivananms@king.com");
		employee1.setSkills(Arrays.asList("java","Selenium"));

		employeejson =mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(employee1);

		System.out.println(employeejson);	

	}

	public void deserialize() throws JsonMappingException, JsonProcessingException {

		String employeejson ="{\r\n" + 
				"  \"firstName\" : \"Kalaivanan\",\r\n" + 
				"  \"lastName\" : \"MSK\",\r\n" + 
				"  \"email\" : \"Kalaivananms@king.com\",\r\n" + 
				"  \"skills\" : [ \"java\", \"Selenium\" ]\r\n" + 
				"}";


		Employee object = mapper.readValue(employeejson, Employee.class);

		System.out.println(object.getFirstName());
		System.out.println(object.getLastName());
		System.out.println(object.getEmail());
		System.out.println(object.getSkills());
	}
	public static void main(String[] args) throws JsonProcessingException {

		SerializationAndDeserialization serializationAndDeserialization =
				new SerializationAndDeserialization();

		serializationAndDeserialization.serialize();


	}
}
