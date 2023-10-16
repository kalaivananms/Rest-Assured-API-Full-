package Com.lao.auth;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class OAuth2O {

	@Test
	public void OAuth2O() {

		String token ="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";
		given()
		.auth()
		.oauth2(token)
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather?q=exton&appid=8f1a3350bdcbfe44cb19ee74c1e26c3e")
		.prettyPrint();

	}

}
