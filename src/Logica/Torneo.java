package Logica;

import java.util.LinkedList;


public class Torneo {
	
	public static  void Partido8vos(LinkedList<Paises> Octavos,LinkedList<Partido> partido8vos) {
		int punt1=0;
		int punt2=0;
		int punt3=0;
		int punt4=0;
		int punt5=0;
		int punt6=0;
		int punt7=0;
		int punt8=0;
		Partido octavos1 =new Partido("1",null,null,0,0);
		Partido octavos2 =new Partido("1",null,null,0,0);
		Partido octavos3 =new Partido("1",null,null,0,0);
		Partido octavos4 =new Partido("1",null,null,0,0);
		Partido octavos5 =new Partido("1",null,null,0,0);
		Partido octavos6 =new Partido("1",null,null,0,0);
		Partido octavos7 =new Partido("1",null,null,0,0);
		Partido octavos8 =new Partido("1",null,null,0,0);
		
		for (Paises paises : Octavos) {
			if (paises.getGrupo().equalsIgnoreCase("A")) {
				punt1++;
				if (punt1==1) {
				octavos1.setPaisA(paises);
					
				}
				if (punt1==2) {
					octavos2.setPaisB(paises);
					
				}
				
			}
			if (paises.getGrupo().equalsIgnoreCase("B")) {
				punt2++;
				if (punt2==1) {
				octavos1.setPaisB(paises);
					
				}
				if (punt2==2) {
					octavos2.setPaisA(paises);
					
				}
				
			}
			
		}
		
		
		
		for (Paises paises : Octavos) {
			if (paises.getGrupo().equalsIgnoreCase("C")) {
				punt3++;
				if (punt3==1) {
				octavos3.setPaisA(paises);
					
				}
				if (punt3==2) {
					octavos4.setPaisB(paises);
					
				}
				
			}
			if (paises.getGrupo().equalsIgnoreCase("D")) {
				punt4++;
				if (punt4==1) {
				octavos3.setPaisB(paises);
					
				}
				if (punt4==2) {
					octavos4.setPaisA(paises);
					
				}
				
			}
			
			
		}
		
		for (Paises paises : Octavos) {
			if (paises.getGrupo().equalsIgnoreCase("E")) {
				punt5++;
				if (punt5==1) {
				octavos5.setPaisA(paises);
					
				}
				if (punt5==2) {
					octavos6.setPaisB(paises);
					
				}
				
			}
			if (paises.getGrupo().equalsIgnoreCase("F")) {
				punt6++;
				if (punt6==1) {
				octavos5.setPaisB(paises);
					
				}
				if (punt6==2) {
					octavos6.setPaisA(paises);
					
				}
				
			}
			
			
		}
		
		for (Paises paises : Octavos) {
			if (paises.getGrupo().equalsIgnoreCase("G")) {
				punt7++;
				if (punt7==1) {
				octavos7.setPaisA(paises);
					
				}
				if (punt7==2) {
					octavos8.setPaisB(paises);
					
				}
				
			}
			if (paises.getGrupo().equalsIgnoreCase("H")) {
				punt8++;
				if (punt8==1) {
				octavos7.setPaisB(paises);
					
				}
				if (punt8==2) {
					octavos8.setPaisA(paises);
					
				}
				
			}
			
			
		}
		
		partido8vos.add(octavos1);
		partido8vos.add(octavos2);
		partido8vos.add(octavos3);
		partido8vos.add(octavos4);
		partido8vos.add(octavos5);
		partido8vos.add(octavos6);
		partido8vos.add(octavos7);
		partido8vos.add(octavos8);
		
		
	}

}
