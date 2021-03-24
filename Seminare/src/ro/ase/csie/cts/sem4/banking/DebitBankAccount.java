package ro.ase.csie.cts.sem4.banking;

public class DebitBankAccount extends BankAccount implements Payable, Receivable,Transferable {

	
	public DebitBankAccount(NotificationService notificationService,String iban, Person accountHolder,long balance) {
		super(notificationService);
		this.iban=iban;
		this.balance=balance;
		this.accountHolder=accountHolder;
	}
	
	public DebitBankAccount(NotificationService notificationService,String iban, Person accountHolder) {
		super(notificationService);
		this.iban=iban;
		this.balance=0;
		this.accountHolder=accountHolder;
	}


	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}
	
	
	// METODE
	
	//retragere
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		if(amount> balance) {
			throw new InsuficientFundsException("Insuficient funds "+ balance);
		}
		notificationService.sendNotification(accountHolder,"withdrawing "+ amount +" from " +iban );
		balance-=amount;
	}
	
	//depundere
	@Override
	public void deposit(long amount) {
		notificationService.sendNotification(accountHolder,"Adding "+ amount +" to " +iban );
		balance+=amount;
	}

	//transfer
	@Override
	public void transfer(Receivable destination, long amount) throws InsuficientFundsException {
			this.withdraw(amount);
		destination.deposit(amount);
		
		
	}

	
	
}
