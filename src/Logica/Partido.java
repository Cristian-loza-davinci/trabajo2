package Logica;

import java.util.LinkedList;

public class Partido {
	private String idPartido;
	private Paises paisA;
	private Paises paisB;
	private int goles1;
	private int goles2;
	
	public Partido(String idPartido, Paises paisA, Paises paisB, int goles1, int goles2) {
		super();
		this.idPartido = idPartido;
		this.paisA = paisA;
		this.paisB = paisB;
		this.goles1 = goles1;
		this.goles2 = goles2;
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

	public int getGoles1() {
		return goles1;
	}

	public void setGoles1(int goles1) {
		this.goles1 = goles1;
	}

	public int getGoles2() {
		return goles2;
	}

	public void setGoles2(int goles2) {
		this.goles2 = goles2;
	}

	@Override
	public String toString() {
		return "Partido [idPartido=" + idPartido + ", paisA=" + paisA + ", paisB=" + paisB + ", goles1=" + goles1
				+ ", goles2=" + goles2 + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
