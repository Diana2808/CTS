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
	public void withdraw(long amount) {
		System.out.println("withdrawing "+ amount);
		balance-=amount;
	}
	
	//depundere
	public void deposit(long amount) {
		System.out.println("depositing "+ amount);
		balance+=amount;
	}

	
	
}
