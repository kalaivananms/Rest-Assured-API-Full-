package Com.ems.SerializationAnnotations;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employeeserialization {

	public static void main(String[] args) throws JsonProcessingException {

		String employeejson;

		Employee seremployee = new Employee();
		seremployee.setFirstName("kalaivanan");
		seremployee.setLastName("MS");
		seremployee.setEmail("Kalaivanams@gmail.com");

		List<String> skillset = new ArrayList<String>();
		skillset.add("Java");
		skillset.add("Selenium");

		seremployee.setSkills(skillset);

		ObjectMapper mapper = new ObjectMapper();

		employeejson = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(seremployee);

		System.out.println(employeejson);
	}



}
