package ro.ase.csie.cts.sem4.banking;

public interface Payable {
	//retragere
		void withdraw(long amount) throws InsuficientFundsException;

}
