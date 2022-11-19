package Logica;

import java.util.LinkedList;

public class Admin {
	private String nombre;
	
	
	public Admin(String nombre) {
		super();
		this.nombre = nombre;
	}
	


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	


	@Override
	public String toString() {
		return "Admin [nombre=" + nombre + "]";
	}



	public  static void cargarResultados(LinkedList<Partido> listaPartidosG) {
		
		for (Partido partido : listaPartidosG) {
			
			do {
				partido.setGoles1((int)(Math.random()*5));
			    partido.setGoles2((int)(Math.random()*5));
			}while(partido.getGoles1()==partido.getGoles2());
		}
		
	}

}
