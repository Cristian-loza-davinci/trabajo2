package Logica;

public class Paises {
	private String nombre;
	 private int goles;
	 private boolean estadoClasi;
	 private String grupo;
	 
	 
	public Paises(String nombre, int goles, boolean estadoClasi, String grupo) {
		super();
		this.nombre = nombre;
		this.goles = goles;
		this.estadoClasi = estadoClasi;
		this.grupo = grupo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getGoles() {
		return goles;
	}


	public void setGoles(int goles) {
		this.goles = goles;
	}


	public boolean getEstadoClasi() {
		return estadoClasi;
	}


	public void setEstadoClasi(boolean estadoClasi) {
		this.estadoClasi = estadoClasi;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	@Override
	public String toString() {
		return "Paises [nombre=" + nombre + ", goles=" + goles + ", estadoClasi=" + estadoClasi + ", grupo=" + grupo
				+ "]";
	}
	 
	
	
	 
	 

}


