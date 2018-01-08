package zoo;

import zoo.Koala;
import zoo.Perro;
import zoo.Elefante;
import zoo.Mono;
import zoo.Leon;
import zoo.Animal;


public  class Main_koala {

	public static void main(String[] args) {
		Animal [] animales = new Animal[4];
		
		animales [0] = new Koala();
		animales [1] = new Perro("Whisskey", "Labrador");
		animales [2] = new Elefante();
		animales [3] = new Mono();
		animales [4] = new Leon();
		
		for (int i = 0; i < animales.length; i++){
			Animal animal = animales[i];
			
			animal.mostrar();
			
		}
		
		
		
		
		
	}

}
