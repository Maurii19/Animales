package zoo;

public class Koala extends Animal{

	private String color;
	
	
	
	Koala(String color){
		super("Koala", 4);
		this.color = color;
	}
	
	
	public Koala() {
		
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public void mostrar() {
		System.out.println("El color del koala es " + this.getColor());		
	}

}
