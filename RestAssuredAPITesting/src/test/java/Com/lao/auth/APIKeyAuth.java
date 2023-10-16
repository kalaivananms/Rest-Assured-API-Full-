package Com.lao.auth;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class APIKeyAuth {

	//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}

	@Test(enabled =false)
	public void apikeyauth() {

		given()
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather?q=exton&appid=8f1a3350bdcbfe44cb19ee74c1e26c3e")
		.prettyPrint();
	}

	@Test(enabled =false)
	public void apikeysUsingParams() {

		given()
		.queryParam("q", "chennai")
		.queryParam("appid", "8f1a3350bdcbfe44cb19ee74c1e26c3e")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log()  
		.body();
	}

	@Test
	public void apikeysUsingHeaders() {

		given()
		.queryParam("q", "chennai")
		.headers("appid", "8f1a3350bdcbfe44cb19ee74c1e26c3e")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log()  
		.body();
	}
}


