package Com.ems.SerializationAnnotations;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRootNameSerializer {

	public static void main(String[] args) throws JsonProcessingException {

		JsonRootNamePojo pojo = new JsonRootNamePojo();

		pojo.setEmail("Kalaivananms@king.com");
		pojo.setFirstName("kalaivanan");
		pojo.setLastName("MS");
		pojo.setSkills(Arrays.asList("java","Selenium"));

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE); 	

		String json = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(pojo);

		System.out.println(json);
	}
}
