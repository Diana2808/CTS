package ro.ase.csie.cts.sem3;

public interface Account {

	//retragere
	void withdraw(long amount) throws InsuficientFundsException;

	//depundere
	void deposit(long amount);

}