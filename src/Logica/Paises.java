package Logica;

public class Paises {
	private String nombre;
	 private int goles;
	 private boolean estadoClasi;
	 private String grupo;
	 private int puntos;
	public Paises(String nombre, int goles, boolean estadoClasi, String grupo, int puntos) {
		super();
		this.nombre = nombre;
		this.goles = goles;
		this.estadoClasi = estadoClasi;
		this.grupo = grupo;
		this.puntos = puntos;
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
	public boolean isEstadoClasi() {
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
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Paises [nombre=" + nombre + ", goles=" + goles + ", estadoClasi=" + estadoClasi + ", grupo=" + grupo
				+ ", puntos=" + puntos + "]";
	}
	 
	
	 
	
	 
	
	 
	
	
	 
	 

}


