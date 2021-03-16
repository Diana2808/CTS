package ro.ase.csie.cts.sem3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import ro.ase.csie.cts.sem2.IncorectDayException;


public class Main {
	public static void main(String[] args) {
	
		NotificationService  smsService=new SMSNotificationService();
		NotificationService  emailService=new EmailNotificationService();
		
		Map<Person, Receivable> employees=new HashMap<>();
		
		Person p1=new Person("Chuck Norris");
		CreditBankAccount b1=new CreditBankAccount(smsService,"RFZ123123123", p1,500);
		
		Person p2=new Person("Arnold");
		DebitBankAccount b2=new DebitBankAccount(emailService,"ING123123123", p2);
		
		Person p3=new Person("Van Damme");
		DebitBankAccount b3=new DebitBankAccount(emailService,"BT123123123", p3);
		
		
		//email notification
				p1.setEmail("chuck@gmail.com");
				p2.setEmail("arnold@arnold.com");
				p3.setEmail("van@damme.com");

		
		//sms notification
				p1.setMobile("0722222222");
				p2.setMobile("0723456789");
				p3.setMobile("0745356723");
				
		employees.put(p1, b1);
		employees.put(p2, b2);
		employees.put(p3, b3);
		
		for(Receivable a: employees.values()) {
			a.deposit(1000);
		}
		
		Map<Person, Payable> union=new HashMap<>();
		
		union.put(p2, b2);
		union.put(p3, b3);


		for(Payable a: union.values()) {
		try {
			a.withdraw(10);

		}catch(InsuficientFundsException ex) {
			System.out.println(ex.getMessage());
			
		}

			
		}
		
		//-------TRANSFER-----------

		//FARA interface
		try {
			b2.withdraw(50);
		} catch (InsuficientFundsException e) {
			e.printStackTrace();
		}
		b3.deposit(50);
		
		System.out.println("\n\n");
		
		//interface 
		try {
			b2.transfer(b3, 200);
		} catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
