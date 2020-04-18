package restAssuredTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import io.restassured.http.ContentType;


public class GetStatusCode {
	
	@Test
	public void validateStatusCode() {
		
		given().
		when().get("http://zippopotam.us/in/508206").
		then().
		assertThat().statusCode(200);
	}
	
	@Test
	public void validateContentType() {
		
		given().
		when().get("http://zippopotam.us/in/508206").
		then().
		assertThat().contentType(ContentType.JSON);
		
	}
	
	@Test
	public void logAllTheInformation() {
		
		given().
		log().all().
		when().get("http://zippopotam.us/in/508206").
		then().log().body();
	}

}
