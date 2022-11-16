 package Logica;

public class Grupo {
	private Paises equipo1;
	private Paises equipo2;
	private Paises equipo3;
	private Paises equipo4;
	
	public Grupo(Paises equipo1, Paises equipo2, Paises equipo3, Paises equipo4) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.equipo3 = equipo3;
		this.equipo4 = equipo4;
	}

	public Paises getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Paises equipo1) {
		this.equipo1 = equipo1;
	}

	public Paises getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Paises equipo2) {
		this.equipo2 = equipo2;
	}

	public Paises getEquipo3() {
		return equipo3;
	}

	public void setEquipo3(Paises equipo3) {
		this.equipo3 = equipo3;
	}

	public Paises getEquipo4() {
		return equipo4;
	}

	public void setEquipo4(Paises equipo4) {
		this.equipo4 = equipo4;
	}

	@Override
	public String toString() {
		return "Grupo [equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", equipo3=" + equipo3 + ", equipo4=" + equipo4
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
