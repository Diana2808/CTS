package ro.ase.csie.cts.sem6.dp.builder;

public class SuperErou {

	private String nume;
	private int puncteViata;
	
	private boolean esteNegativ;
	private boolean esteRanitGrav;
	
	//DIP
	private InterfataArma armaStanga;
	private InterfataArma armaDreapta;
	private InterfataSuperPutere superPutere;
	private InterfataSuperPutere superSuperPutere;

	//trebuie sa fie PRIVATE
	private SuperErou() {
		
	}

	//optional PRIVATE
	private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
			InterfataArma armaDreapta, InterfataSuperPutere superPutere, InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	
	//BUILDER -> toate metodele returneaza builder
	public static class SuperErouBuilder {
		
		SuperErou supererou;
		
		// constructorul unde setez atrbutele
		public SuperErouBuilder(String nume, int puncteViata) {
			//set de valori absolut necesare pentru a crea un superErou
			this.supererou = new SuperErou();
			this.supererou.nume = nume;
			this.supererou.puncteViata = puncteViata;
		}
		
		// metoda care seteaza supereroul ca fiind negativ 
		public SuperErouBuilder esteNegativ() {
			this.supererou.esteNegativ = true;
			return this;
		}
		
		public SuperErouBuilder esteRanit() {
			this.supererou.esteRanitGrav = true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.supererou.armaStanga = arma;
			return this;
		}
		
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.supererou.armaDreapta = arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
			this.supererou.superPutere = superPutere;
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
			this.supererou.superSuperPutere = superSuperPutere;
			return this;
		}
		
		public SuperErou build() {
			return this.supererou;
		}
		
	}
	
}
