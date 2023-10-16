package Com.lao.auth;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BearerTokenAuth {

	//https://api.github.com/user/repos

	@Test
	public void bearertoken() {
		//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
		String token ="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";
		given()
		.header("Authorization","Bearer"+token)
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather?q=exton&appid=8f1a3350bdcbfe44cb19ee74c1e26c3e")
		.prettyPrint();
	}

}
