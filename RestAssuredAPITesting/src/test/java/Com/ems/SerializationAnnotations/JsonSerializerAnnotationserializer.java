package Com.ems.SerializationAnnotations;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonSerializerAnnotationserializer {

	public static void main(String[] args) throws JsonProcessingException {

		JsonSerializerPojo pojo = new JsonSerializerPojo();
		pojo.setFirstname("Kalaivanan");
		pojo.setLastname("MS");
		pojo.setEmail("KalaivananMS@gmsil.com");
		pojo.setSkills(Arrays.asList("Java","Selenium"));

		Devices devices = new Devices();
		devices.setLaptop("MacBook pro");
		devices.setMobiles("One plus nord ce2");


		ObjectMapper mapper = new ObjectMapper();

		/*SimpleModule module= new SimpleModule();
		module.addSerializer(JsonSerializerPojo.class, new CustomSerializer());

		mapper.registerModule(module);*/

		String json = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(pojo);

		System.out.println(json);
	}

}
