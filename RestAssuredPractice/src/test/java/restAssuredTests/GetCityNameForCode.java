package restAssuredTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class GetCityNameForCode {
	
	@Test
	public void validateGetCityNameForCode() {
		
		given().
		when().get("http://zippopotam.us/in/508206").
		then().
		assertThat().
		body("places[0].'place name'", equalTo("X Road Kodad"));
	}

}
