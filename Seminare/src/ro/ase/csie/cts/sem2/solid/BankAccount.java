package ro.ase.csie.cts.sem2.solid;

public class BankAccount {
	private String iban;
	private long balance;
	
	private Person accountHolder;
	
	
	public BankAccount(String iban, Person person) {
		this.iban=iban;
		this.balance=0;
		this.accountHolder=person;
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
	public void withdraw(long amount) throws InsuficientFundsException {
		if(amount> balance) {
			throw new InsuficientFundsException("Insuficient funds "+ balance);
		}
		System.out.println("withdrawing "+ amount +" from " +iban);
		balance-=amount;
	}
	
	//depundere
	public void deposit(long amount) {
		System.out.println("depositing "+ amount +" from " +iban);
		balance+=amount;
	}

	
	
}
