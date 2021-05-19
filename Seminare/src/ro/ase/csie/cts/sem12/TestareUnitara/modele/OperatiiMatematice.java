package ro.ase.csie.cts.sem12.TestareUnitara.modele;

import ro.ase.csie.cts.sem12.TestareUnitara.exceptii.ExceptieImpartireLaZero;

public class OperatiiMatematice {

	public static int aduna(int a, int b) {
		return a + b;
	}

	public static double impartire(int a, int b) throws ExceptieImpartireLaZero {
		if(b == 0) {
			throw new ExceptieImpartireLaZero();
		}
		return (double)a / b;
	}
}
