package Com.lao.Json_path_with_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;
import com.jayway.jsonpath.Predicate.PredicateContext;

public class CustomPredicatesExample {


	File jsonfile = new File("src/test/resources/Bookstore.json"); 

	public void mycustomPredicator() throws IOException{

		Predicate bookWithISBN = new Predicate() {

			@Override
			public boolean apply(PredicateContext ctx) {
				// TODO Auto-generated method stub
				boolean predicate =ctx.item(Map.class).containsKey("isbn");
				return predicate;
			}
		};

		//Predicate bookWithISBN = ctx ->ctx.item(Map.class).containsKey("isbn");
		List<Map<String,Object>> result =JsonPath
				.parse(jsonfile).read("$.store.book[?]",List.class,bookWithISBN);

		System.out.println(result);





	}

	public static void main(String[] args) throws IOException {

		CustomPredicatesExample example = new CustomPredicatesExample();
		example.mycustomPredicator();
	}

}
