package deporte;

public class Atleta {
	
	private String nAtleta;
	private String nombre;
	private float tiempo;
	
	
	public Atleta(String nAtleta, String nombre, float tiempo) {
		
		this.nAtleta = nAtleta;
		this.nombre = nombre;
		this.tiempo = tiempo;
	}


	public float getTiempo() {
		return tiempo;
	}


	public String mostrarDatos() {
		
		return "\nEl número del atleta es: "+nAtleta+"\nEl nombre es: "+nombre+"\nEl tiempo es: "+tiempo;
	}
	
	
	
	

}
