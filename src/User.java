
public class User {
	
	private String FirstName;
	private String LastName;
	private String Password;
	private String Country;
	private String BirthDate;
	private String PhoneNumber;
	private String EmailAdress;

	public User(String firstName, String lastName, String password, String country, String birthDate, String phoneNumber, String emailAdress) {
		
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Password = password;
		this.Country = country;
		this.BirthDate = birthDate;
		this.PhoneNumber = phoneNumber;
		this.EmailAdress = emailAdress;
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getPassword() {
		return Password;
	}

	public String getCountry() {
		return Country;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public String getEmailAdress() {
		return EmailAdress;
	}
	
	
	
}
