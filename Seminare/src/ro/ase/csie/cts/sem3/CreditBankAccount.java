package ro.ase.csie.cts.sem3;

public class CreditBankAccount implements Receivable {
	
	private long balance;
	private String iban;
	private Person accountHolder;
	
	

	

	public CreditBankAccount(String iban,long balance, Person accountHolder) {
		this.iban=iban;
		this.accountHolder=accountHolder;
		this.balance=balance;
		
	}


	@Override
	public void deposit(long amount) {
		System.out.println("Adding "+ amount +" to " +iban);
		this.balance+=amount;

	}

}
