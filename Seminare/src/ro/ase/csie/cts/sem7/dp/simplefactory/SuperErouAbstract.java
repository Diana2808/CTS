package ro.ase.csie.cts.sem7.dp.simplefactory;

public abstract class SuperErouAbstract {
	String nume;
	int puncteViata;
	
	public SuperErouAbstract(String nume, int puncteViata) {
		this.nume = nume;
		this.puncteViata = puncteViata;
	}

	public abstract void seDeplaseaza();

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getPuncteViata() {
		return puncteViata;
	}

	public void setPuncteViata(int puncteViata) {
		this.puncteViata = puncteViata;
	}
	
	
}
