
public class Address {

	private String StreetAdress;
	private String City;
	private String PostalCode;
	private String Country;
	public Address(String streetAdress, String city, String postalCode, String country) {

		this.StreetAdress = streetAdress;
		this.City = city;
		this.PostalCode = postalCode;
		this.Country = country;
	}
	public String getStreetAdress() {
		return StreetAdress;
	}
	public String getCity() {
		return City;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public String getCountry() {
		return Country;
	}
	
	
	
}
