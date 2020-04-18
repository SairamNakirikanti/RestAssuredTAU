package pojoClasses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"postCode", "country", "countryAbbreviation", "places"})
public class Location {
	
	private String postCode;
    private String country;
    private String countryAbbreviation;
    private List<Place> places;
    
    public Location() {
        this.postCode = "1050";
        this.country = "Latvia";
        this.countryAbbreviation = "LV";

        Place place = new Place();
        List<Place> places = new ArrayList<Place>();
        places.add(place);

        this.places = places;
    }

	
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryAbbreviation() {
		return countryAbbreviation;
	}
	public void setCountryAbbreviation(String countryAbbreviation) {
		this.countryAbbreviation = countryAbbreviation;
	}
	public List<Place> getPlaces() {
		return places;
	}
	public void setPlaces(List<Place> places) {
		this.places = places;
	}
	

}
