package Com.lao.Json_path_with_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class InlinePredicateExample {

	File jsonfile = new File("src/test/resources/Bookstore.json");

	public void inlinepredicateExample() throws IOException{
		//[?(@.price<10)]
		//$.store.book

		List<Object> result =JsonPath
				.parse(jsonfile)
				.read("$.store.book[?(@.price>10 || @.category == 'reference')]");

		System.out.println(result) ; 

		//price < 10 and category =fiction
		//[?(@price<10 && @.category=="fiction")

		// AND operator  (Price <10 and  category =fiction
		//OR operator (price>10 || category= reference
		//[?(@.price>10 || @.category == 'reference')]
	}

	public static void main(String[] args) throws IOException {

		InlinePredicateExample example = new InlinePredicateExample();
		example.inlinepredicateExample();
	}
}
