package Com.ems.SerializationAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonprpertyOrderSerializer {


	public static void main(String[] args) throws JsonProcessingException {

		JsonpropertyOrderPojo pojo = new  JsonpropertyOrderPojo();

		pojo.setId(5);
		pojo.setName("kalaivanan");
		pojo.setEmail("Mr.k@king.com");

		ObjectMapper mapper = new ObjectMapper();

		String json = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(pojo);

		System.out.println(json);
	}

}
