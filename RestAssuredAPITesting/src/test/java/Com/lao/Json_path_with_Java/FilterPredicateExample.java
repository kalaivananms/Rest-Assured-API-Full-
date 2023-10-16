package Com.lao.Json_path_with_Java;

import static com.jayway.jsonpath.Criteria.where;
import static com.jayway.jsonpath.Filter.filter;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterPredicateExample {

	public void filterApipredicateExample() throws IOException {

		File jsonfile = new File("src/test/resources/Bookstore.json");

		Filter pricelessthenten = Filter
				.filter(

						Criteria
						.where("price")
						.lt(10));

		List<Object> result =	JsonPath
				.parse(jsonfile)
				.read("$.store.book[?]",pricelessthenten);
		System.out.println(result);
	}

	public void Secondffilter () throws IOException {

		File jsonfile = new File("src/test/resources/Bookstore.json");

		Filter secondCriteria =Filter.filter(

				Criteria
				.where("price")
				.lt(10)
				.and("category")
				.is("fiction")
				);
		//List<Map<String,Object>>result= JsonPath.parse(jsonfile).read("$.store.book[?]", secondCategory);
		List<Object>result= JsonPath.parse(jsonfile).read("$.store.book[?]", secondCriteria);
		System.out.println(result.get(0));
	}

	public void Thridfilter() throws IOException {

		File jsonfile = new File("src/test/resources/Bookstore.json");

		Filter thridfilter =filter(
				where("price")
				.gt(10)
				.and("category")
				.is("fiction")
				);

		List<Map<String, Object>> result = JsonPath.parse(jsonfile).read("$.store.book[?]",thridfilter);
		System.out.println(result
				);

	}


	public static void main(String[] args) throws IOException {

		FilterPredicateExample example = new FilterPredicateExample();
		example.Thridfilter();


	}


}
