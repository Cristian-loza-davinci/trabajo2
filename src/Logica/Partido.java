package Logica;

public class Partido {
	private String idPartido;
	private Paises paisA;
	private Paises paisB;
	private int goles;
	private int duracion;
	
	public Partido(String idPartido, Paises paisA, Paises paisB, int goles, int duracion) {
		super();
		this.idPartido = idPartido;
		this.paisA = paisA;
		this.paisB = paisB;
		this.goles = goles;
		this.duracion = duracion;
	}

	public String getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(String idPartido) {
		this.idPartido = idPartido;
	}

	public Paises getPaisA() {
		return paisA;
	}

	public void setPaisA(Paises paisA) {
		this.paisA = paisA;
	}

	public Paises getPaisB() {
		return paisB;
	}

	public void setPaisB(Paises paisB) {
		this.paisB = paisB;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Partido [idPartido=" + idPartido + ", paisA=" + paisA + ", paisB=" + paisB + ", goles=" + goles
				+ ", duracion=" + duracion + "]";
	}
	
	
	
	

}
