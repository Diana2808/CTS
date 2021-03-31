package ro.ase.csie.cts.sem6.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3DCaracter implements Cloneable {

	String culoare;
	int inaltime;
	
	// trebuie creata cu new ArrayList() mereu
	ArrayList<Integer> puncte = new ArrayList<>();
	
	public Model3DCaracter(String culoare) {
		this.culoare = culoare;
		
		System.out.println("Incarcare model 3D din fisier .....");
		try {
			Thread.sleep(2000);
			
			Random random = new Random();
			for(int i = 0; i < 20; i++) {
				this.puncte.add(random.nextInt(1000));
			}
			System.out.println("Model 3d generat");
		} catch (InterruptedException e) {
			
		}
	}
	
	private Model3DCaracter() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { // deep copy
		//Model3DCaracter copie = new Model3DCaracter(this.culoare);
		Model3DCaracter copie = new Model3DCaracter();
		copie.culoare = this.culoare;
		copie.inaltime = this.inaltime;
		copie.puncte = (ArrayList<Integer>) this.puncte.clone();
		return copie;
	}
	
}
