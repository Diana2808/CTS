package ro.ase.csie.cts.sem8.dp.facade;

public class Utilizator {
	
	public void login(String username, String password) {
		System.out.println("Login");
	}
	
	public ProfilJucator getProfil() {
		return new ProfilJucator();
	}
}
