package restAssuredTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

//@RunWith(DataProviderRunner.class)
public class ParameterizeTheTestData {

	@DataProvider
	public static Object[][] zipCodesAndPlaces() {

		return new Object[][] {

				{ "us", "90210", "Beverly Hills" }, { "us", "12345", "Schenectady" }, { "ca", "B2R", "Waverley" } };

	}

    @Test
    @UseDataProvider("zipCodesAndPlaces")
	public void getMultiplecountryData(String countryCode,String zipCode ,String expectedPlaceName) {
		
		given().
		pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
		when().
		get("http://zippopotam.us/{countryCode}/{zipCode}").
		then().
		assertThat().
		body("places[0].'place name'", equalTo(expectedPlaceName));

	}

}
