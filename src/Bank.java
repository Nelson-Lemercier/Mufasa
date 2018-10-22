import java.util.ArrayList;

public class Bank {
	
	private ArrayList<BankAccount> accounts;

	public Bank() {
		
		this.accounts = new ArrayList<BankAccount>();
		
	}
	
	public void addUser(BankAccount account) {
		
		this.accounts.add(account);
		
	}
	
	public boolean userExist(String firstName, String lastName, String password) {
		
		for(int i = 0; i < accounts.size(); i++) {
			
			if(accounts.get(i).getUserAccount().getFirstName() == firstName) {
				
				if(accounts.get(i).getUserAccount().getLastName() == lastName) {
					
					if(accounts.get(i).getUserAccount().getPassword() == password) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}
	
	public BankAccount getBankAccount(String firstName, String lastName, String password) {
		
		BankAccount foundAccount = null;
		
		for(int i = 0; i < accounts.size(); i++) {
					
			if(accounts.get(i).getUserAccount().getFirstName() == firstName) {
				
				if(accounts.get(i).getUserAccount().getLastName() == lastName) {
					
					if(accounts.get(i).getUserAccount().getPassword() == password) {
						
						foundAccount = accounts.get(i);
						
					}
					
				}
				
			}
					
		}

		return foundAccount;
		
	}
	
	public boolean withdrawPossible(double amount, BankAccount BA) {
		
		if(BA.getCreditcard().getBalance() < amount) {
			
			return false;
			
		}
		
		else {
			
			return true;
			
		}
		
	}
	
	public void withdraw(double amount, BankAccount BA) {
		
		double balance = BA.getCreditcard().getBalance();
		
		BA.getCreditcard().setBalance(balance - amount);;
		
	}

}
