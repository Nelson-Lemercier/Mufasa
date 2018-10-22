import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class testMufasa {

	Bank bank;
	User user;
	BankAccount account;
	Address address;
	CreditCard CC;
	Mufasa mufasa;
	
	
	@Before
	public void setup(){

		mufasa = EasyMock.createMock(Mufasa.class);
		
	}

	@Test
	public void testWithdraw() {
		
		EasyMock.expect(mufasa.test(CC, 321)).andReturn(false);
		EasyMock.expect(mufasa.test(CC, 123)).andReturn(true);
		
		EasyMock.replay(mufasa);

		bank = new Bank();
		user = new User("Nelson", "Lemercier", "1234", "France", "10/08/1996", "060708010", "test@email.com");
		address = new Address("Yliopistokatu", "Oulu", "90570", "Finland");
		CC = new CreditCard("LEMERCIER", "VISA", 001, "08/25", 123, 5781.24);
		account = new BankAccount(user, address, "4321", CC);
		
		bank.addUser(account);

		assertTrue(mufasa.test(CC, 123));
		
	}
	
}
