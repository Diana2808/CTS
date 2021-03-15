package ro.ase.csie.cts.sem3;

public class FeeBankAccount extends DebitBankAccount {
	
	
	//comision
	private long fee=2;

	public FeeBankAccount(String iban, Person person) {
		super(iban, person);
		
	}
	
	
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		System.out.println("Adding "+ fee +" fee to withdrawal");
		super.withdraw(amount+fee);
	}
	

}
