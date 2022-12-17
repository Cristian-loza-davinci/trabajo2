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
		Partido octavos2 =new Partido("2",null,null,0,0);
		Partido octavos3 =new Partido("3",null,null,0,0);
		Partido octavos4 =new Partido("4",null,null,0,0);
		Partido octavos5 =new Partido("5",null,null,0,0);
		Partido octavos6 =new Partido("6",null,null,0,0);
		Partido octavos7 =new Partido("7",null,null,0,0);
		Partido octavos8 =new Partido("8",null,null,0,0);
		
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
	public static void Resultado8vos(LinkedList<Partido> partido8vos) {
		
		
		
		
		for (Partido partido2 : partido8vos) {
			do {
			partido2.setGoles1((int)(Math.random()*5));
		    partido2.setGoles2((int)(Math.random()*5));
		    
		}while(partido2.getGoles1()==partido2.getGoles2());
		}
		
		
	}
	public static void pase4tos(LinkedList<Partido> partido8vos,LinkedList<Paises> cuartos) {
		
		for (Partido partido : partido8vos) {
			if (partido.getGoles1()>partido.getGoles2()) {
				
				cuartos.add(partido.getPaisA());
			
			}
			if (partido.getGoles1()<partido.getGoles2()) {
				cuartos.add(partido.getPaisB());
			}
			
		}
	}
	public static void partidoCuartos(LinkedList<Paises> cuartos,LinkedList<Partido> cuartosFinal) {
		Partido cuartos1 =new Partido("1",null,null,0,0);
		Partido cuartos2 =new Partido("2",null,null,0,0);
		Partido cuartos3 =new Partido("3",null,null,0,0);
		Partido cuartos4 =new Partido("4",null,null,0,0);
		int pais=1;
		for (Paises paises : cuartos) {
			if (pais==1 || pais==3 || pais==5 || pais==7) {
				if (pais==1) {
					
					cuartos1.setPaisA(paises);
				}
                if (pais==3) {
					
					cuartos2.setPaisA(paises);
				}
                
                if (pais==5) {
					
					cuartos3.setPaisA(paises);
				}
                
                if (pais==7) {
					
					cuartos4.setPaisA(paises);
				}
                
                
			}
			
			if (pais==2 || pais==4 || pais==6 || pais==8) {
				
                if (pais==2) {
					
					cuartos1.setPaisB(paises);
				}
                if (pais==4) {
					
					cuartos2.setPaisB(paises);
				}
                
                if (pais==6) {
					
					cuartos3.setPaisB(paises);
				}
                
                if (pais==8) {
					
					cuartos4.setPaisB(paises);
				}
                
                
				
			}
			pais++;
		}
		
		cuartosFinal.add(cuartos1);
		cuartosFinal.add(cuartos2);
		cuartosFinal.add(cuartos3);
		cuartosFinal.add(cuartos4);
	}
	public static void resultado4tos(LinkedList<Partido> cuartosFinal) {
		for (Partido partido : cuartosFinal) {
			do {

			partido.setGoles1((int)(Math.random()*5));
		    partido.setGoles2((int)(Math.random()*5));
		    
		}while(partido.getGoles1()==partido.getGoles2());
		}
	}
	public static void paseSemifinal(LinkedList<Partido> cuartosFinal,LinkedList<Paises> semis) {
		
		
		for (Partido partido : cuartosFinal) {
			if (partido.getGoles1()>partido.getGoles2()) {
				
				semis.add(partido.getPaisA());
			
			}
			if (partido.getGoles1()<partido.getGoles2()) {
				semis.add(partido.getPaisB());
			}
			
		}
		
		
	}
	public static void partidoSemifinal(LinkedList<Paises> semis,LinkedList<Partido> semiFinal) {
		Partido semis1 =new Partido("1",null,null,0,0);
		Partido semis2 =new Partido("2",null,null,0,0);
	
		int semi=1;
		for (Paises paises : semis) {
			if (semi==1 || semi==3) {
				if (semi==1) {
					semis1.setPaisA(paises);
					
				}
				if (semi==3) {
					semis2.setPaisA(paises);
					
				}
				
			}
			
			if (semi==2 || semi==4) {
				if (semi==2) {
					semis1.setPaisB(paises);
					
				}
				if (semi==4) {
					semis2.setPaisB(paises);
					
				}
				
			}
			semi++;
		}
		
		semiFinal.add(semis1);
		semiFinal.add(semis2);
		
		
	}
	public static void resultadoSemis(LinkedList<Partido> semiFinal) {
		
		for (Partido partido2 : semiFinal) {
			do {

			partido2.setGoles1((int)(Math.random()*5));
		    partido2.setGoles2((int)(Math.random()*5));
		    
		}while(partido2.getGoles1()==partido2.getGoles2());
		}
		
	}

public static void paseFinal(LinkedList<Paises> final0,LinkedList<Partido> semiFinal) {
	
	for (Partido partido : semiFinal) {
		if (partido.getGoles1()>partido.getGoles2()) {
			
			final0.add(partido.getPaisA());
		
		}
		if (partido.getGoles1()<partido.getGoles2()) {
			final0.add(partido.getPaisB());
		}
		
	}
	
}
public static void partidoFinal(LinkedList<Paises> final0,LinkedList<Partido> Finales) {
	Partido final1 =new Partido("2",null,null,0,0);
	int fin=1;
	for (Paises pais : final0) {
		if (fin==1) {
			final1.setPaisA(pais);
		}
		if (fin==2) {
			final1.setPaisB(pais);
		}
		fin++;
	}
	
	Finales.add(final1);
}
public static void resultadoFinal(LinkedList<Partido> Finales) {
	for (Partido partido : Finales) {
		do {

			partido.setGoles1((int)(Math.random()*5));
		    partido.setGoles2((int)(Math.random()*5));
		    
		}while(partido.getGoles1()==partido.getGoles2());
	}
}
}
	


