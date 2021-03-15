package ro.ase.csie.cts.sem3;

public interface Payable {
	//retragere
		void withdraw(long amount) throws InsuficientFundsException;

}
