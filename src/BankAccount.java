
public class BankAccount {
	
	private User UserAccount;
	private Address userAdress;
	private String password;
	private CreditCard creditcard;
	public BankAccount(User userAccount, Address userAdress, String password,
			CreditCard creditcard) {
		
		this.UserAccount = userAccount;
		this.userAdress = userAdress;
		this.password = password;
		this.creditcard = creditcard;
	}
	
	public User getUserAccount() {
		return UserAccount;
	}
	public Address getUserAdress() {
		return userAdress;
	}
	public String getPassword() {
		return password;
	}
	public CreditCard getCreditcard() {
		return creditcard;
	}
	
	
}
