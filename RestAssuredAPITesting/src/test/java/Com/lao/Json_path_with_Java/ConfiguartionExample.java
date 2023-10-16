package Com.lao.Json_path_with_Java;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class ConfiguartionExample {



	public static void main(String[] args) {

		String json = "[\r\n" + 
				" {\r\n" + 
				"    \"name\" :\"Nilesh kumar school la oru good boy\",\r\n" + 
				"    \"gender\":\"male\"\r\n" + 
				" },\r\n" + 
				"{\r\n" + 
				"\"name\": \"Pathiyam\"\r\n" + 
				"}\r\n" + 
				"]";

		Configuration configuration = Configuration.defaultConfiguration();
		configuration = configuration.addOptions(Option.ALWAYS_RETURN_LIST );
		//configuration= configuration.addOptions(Option.SUPPRESS_EXCEPTIONS);
		//configuration= configuration.addOptions(Option.REQUIRE_PROPERTIES);
		/*Configuration configuration = Configuration.builder()
						.options(Option.DEFAULT_PATH_LEAF_TO_NULL)
						.build();*/

		List<String> result =JsonPath
				.using(configuration)
				.parse(json)
				.read("$.[0].name");

		System.out.println(result);

	}

}
