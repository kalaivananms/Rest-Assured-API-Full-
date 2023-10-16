package Com.ems.SerializationAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetterSerializer {

	public static void main(String[] args) throws JsonProcessingException {

		JsonAnyGetterPOJO pojo = new JsonAnyGetterPOJO();

		Map<String, Object> mapvalue = new HashMap<String, Object>();
		mapvalue.put("firstName", "Kalaivanan");
		mapvalue.put("LastName", "Mr.k");
		mapvalue.put("email", "Kalaivanan@kings.com");
		mapvalue.put("skills", Arrays.asList("java","Selenium"));

		pojo.setEmployeeproperties(mapvalue);

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(pojo);

		System.out.println(json);

	}
}
