package ro.ase.csie.cts.sem4.banking;

public class CreditBankAccount extends BankAccount implements Receivable{


	public CreditBankAccount(NotificationService notificationService,String iban, Person accountHolder, long balance) {
		super(notificationService);
		this.iban=iban;
		this.accountHolder=accountHolder;
		this.balance=balance;
		
	}

	@Override
	public void deposit(long amount) {
		notificationService.sendNotification(accountHolder, "Adding "+ amount +" to " +iban);
		this.balance+=amount;

	}
	
	
	//pt a nu folosi constructorul
	public static CreditBankAccount createCreditBankAccountWithBalance(NotificationService notificationService,
			String iban, Person accountHolder, long balance) {
		return new CreditBankAccount(notificationService, iban, accountHolder, balance);
	}
	
	public static CreditBankAccount createCreditBankAccount(NotificationService notificationService,
			String iban, Person accountHolder) {
		return new CreditBankAccount(notificationService, iban, accountHolder,0);	
}
}
