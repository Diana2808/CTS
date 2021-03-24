package ro.ase.csie.cts.sem4.banking;

public interface Account {

	//retragere
	void withdraw(long amount) throws InsuficientFundsException;

	//depundere
	void deposit(long amount);

}