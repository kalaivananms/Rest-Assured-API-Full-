package Com.lao.Json_path_with_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class KnowwhatIsReturned {


	public static void main(String[] args) throws IOException {

		//Definite path 
		//Indefinite path 
		//..deep scan  
		//?(expression)
		//[0,1] or [0:2] [*]
		File jsonFile = new File("src/test/resources/Bookstore.json");

		String author = JsonPath.read(jsonFile, "$.store.book[1].author");

		System.out.println(author );

		List<Object> authorlist = JsonPath.read(jsonFile, "$.store.book[1,2].author");

		for (Object author1 : authorlist) {
			System.out.println(author1);
		}

	}

}
