package zoo;

import zoo.Koala;
import zoo.Perro;
import zoo.Elefante;
import zoo.Mono;
import zoo.Leon;
import zoo.Animal;


public  class Main_Mauricio {

	public static void main(String[] args) {
		Animal [] animales = new Animal[5];
		
		animales [0] = new Koala("negro");
		animales [1] = new Perro("Whisskey", "Labrador");
		animales [2] = new Elefante("gris", 1.5);
		animales [3] = new Mono("Dross", "monoloco");
		animales [4] = new Leon(20.4, 55.4, 4);
		
		for (int i = 0; i < animales.length; i++){
			Animal animal = animales[i];
			
			animal.mostrar();
			
		}
		
		
		
		
		
	}

}
