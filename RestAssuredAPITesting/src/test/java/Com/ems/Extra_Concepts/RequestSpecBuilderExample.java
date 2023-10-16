package Com.ems.Extra_Concepts;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecBuilderExample {


	public static void main(String[] args) {

		RequestSpecBuilder builder = new RequestSpecBuilder();
		/*builder.setBaseUri("http://localhost:3000");
		builder.setBasePath("/employees");

		RequestSpecification spec = builder.build();*/

		RequestSpecification spec = builder.setBaseUri("http://localhost:3000").setBasePath("/employees/43").build();

		RestAssured
		.given(spec) 
		.get("/43")
		.prettyPrint();




	}

}
