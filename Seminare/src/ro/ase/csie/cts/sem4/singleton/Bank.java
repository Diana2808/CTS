package ro.ase.csie.cts.sem4.singleton;

import ro.ase.csie.cts.sem4.banking.FeeBankAccount;
import ro.ase.csie.cts.sem4.banking.DebitBankAccount;
import ro.ase.csie.cts.sem4.banking.EmailNotificationService;
import ro.ase.csie.cts.sem4.banking.NotificationService;
import ro.ase.csie.cts.sem4.banking.SMSNotificationService;
import ro.ase.csie.cts.sem4.banking.Person;

public class Bank {

	private static Bank INSTANCE;
	private NotificationService emailNotificationService;
	private NotificationService SMSNotificationService;
	
	private Bank() {
		emailNotificationService=new EmailNotificationService();
		SMSNotificationService=new SMSNotificationService();
	}
	
	public static synchronized Bank getInstance() {
		if(INSTANCE == null) {
			INSTANCE=new Bank();
		}
		
		return INSTANCE;
	}
	
	public DebitBankAccount openDebitAccount(Person holder) {
		DebitBankAccount account;
		if(holder.getAge()>18) {
			account = new FeeBankAccount(
					holder.getNotificationType().getNotificationService(), generateIban(), holder);
		} else {
			account = new DebitBankAccount(
					holder.getNotificationType().getNotificationService(),generateIban(), holder);
		}
			return account;
	}
	
	private String generateIban() {
		return "IMGB"+System.currentTimeMillis();
		}
}
