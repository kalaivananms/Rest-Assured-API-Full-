package Com.ems.Extra_Concepts;

import io.restassured.RestAssured;

public class DefaultHostAndPort {
	
	public static void main(String[] args) {
		
		RestAssured
		.given()
		.log()
		.all()
		.when()
		.get();
	}

}
