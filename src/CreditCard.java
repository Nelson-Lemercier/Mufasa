
public class CreditCard {
	
	private String cardHolderName;
	private String typeCard;
	private int cardNumber;
	private String expiryDate;
	private int CVC;
	private double balance;
	
	public CreditCard(String cardHolderName, String typeCard, int cardNumber, String expiryDate, int CVC, double balance) {
		
		this.cardHolderName = cardHolderName;
		this.typeCard = typeCard;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.CVC = CVC;
		this.balance = balance;
		
	}

	public int getCVC() {
		return CVC;
	}

	public double getBalance() {
		return balance;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public String getTypeCard() {
		return typeCard;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	

}
