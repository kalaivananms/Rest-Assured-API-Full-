package Com.ems.Deserialization;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreSerializer {

	public static void main(String[] args) throws JsonProcessingException {

		String json;

		JsonIgnorePojo pojo = new JsonIgnorePojo();
		pojo.setName("Kalaivanan");
		pojo.setId(3);
		pojo.setEmail("Kalaivanan@gmail.com");

		Date date = new Date();
		pojo.setDateofBrith(date);



		ObjectMapper mapper = new ObjectMapper();
		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);

		System.out.println(json);

	}

}
