package Logica;

import java.util.LinkedList;

public class Admin {
	

	public  static void cargarResultados(LinkedList<Partido> listaPartidosG) {
		
		
		for (Partido partido : listaPartidosG) {
			
			do {
				partido.setGoles1((int)(Math.random()*5));
			    partido.setGoles2((int)(Math.random()*5));
			    
			}while(partido.getGoles1()==partido.getGoles2());
			
			
		}
		
		
		
	}
	public static void mostarResultadosFG(LinkedList<Partido> listaPartidosG) {

		for (Partido partido : listaPartidosG) {
			System.out.println("\n"+partido.getPaisA().getNombre()+" " + partido.getGoles1()+ " vs " +partido.getGoles2()+ " " + partido.getPaisB().getNombre()+ ": Finalizado");
			  
		}
		
		
	}
	public static void darPuntos(LinkedList<Partido> listaPartidosG) {

		for (Partido partido : listaPartidosG) {
			int aux1=0;
		int punt=1;
		int punt1=2;
		int punt2=3;
		 
			if (partido.getGoles1()>partido.getGoles2()) {
				if (partido.getPaisA().getPuntos()==aux1) {
					
					partido.getPaisA().setPuntos(punt);
					
				}else if(partido.getPaisA().getPuntos()==punt) {
					partido.getPaisA().setPuntos(punt1);
				}else if (partido.getPaisA().getPuntos()==punt1) {
					partido.getPaisA().setPuntos(punt2);
				}
			    
			}
			if (partido.getGoles1()<partido.getGoles2()) {
				if (partido.getPaisB().getPuntos()==0) {
					partido.getPaisB().setPuntos(punt);
					
				}else if (partido.getPaisB().getPuntos()==1) {
					partido.getPaisB().setPuntos(punt1);
				}else if (partido.getPaisB().getPuntos()==2) {
					partido.getPaisB().setPuntos(punt2);
				}
			    
			}
			
			
		}
	}
	public static void clasiOctavos(LinkedList<Grupo> Grupos,LinkedList<Paises> Octavos ) {
		for (Grupo paises : Grupos) {
			
			if (paises.getEquipo1().getPuntos()>0) {
				if (paises.getEquipo1().getPuntos()==3) {
					Octavos.add(paises.getEquipo1());
					
				}else if (paises.getEquipo1().getPuntos()==2 && paises.getEquipo2().getPuntos()!=2 && paises.getEquipo3().getPuntos()!=2 && paises.getEquipo4().getPuntos()!=2) {
					Octavos.add(paises.getEquipo1());
				}
				
			}
			if (paises.getEquipo2().getPuntos()>0) {
				if (paises.getEquipo2().getPuntos()==3) {
					Octavos.add(paises.getEquipo2());
					
				}else if (paises.getEquipo2().getPuntos()==2 && paises.getEquipo1().getPuntos()!=2 && paises.getEquipo3().getPuntos()!=2 && paises.getEquipo4().getPuntos()!=2) {
					Octavos.add(paises.getEquipo2());
				}
				
			}
			if (paises.getEquipo3().getPuntos()>0) {
				if (paises.getEquipo3().getPuntos()==3) {
					Octavos.add(paises.getEquipo3());
					
				}else if (paises.getEquipo3().getPuntos()==2 && paises.getEquipo2().getPuntos()!=2 && paises.getEquipo1().getPuntos()!=2 && paises.getEquipo4().getPuntos()!=2) {
					Octavos.add(paises.getEquipo3());
				}
				
			}
			if (paises.getEquipo4().getPuntos()>0) {
				if (paises.getEquipo4().getPuntos()==3) {
					Octavos.add(paises.getEquipo4());	
				}else if (paises.getEquipo4().getPuntos()==2 && paises.getEquipo2().getPuntos()!=2 && paises.getEquipo3().getPuntos()!=2 && paises.getEquipo1().getPuntos()!=2) {
				Octavos.add(paises.getEquipo4());
			}
				
			}
			
			
			
              if (paises.getEquipo1().getPuntos()==1 &&paises.getEquipo2().getPuntos()==1 && paises.getEquipo3().getPuntos()==1 && paises.getEquipo4().getPuntos()==3 ) {
				
				
				Octavos.add(paises.getEquipo1());
				
				
			}else if (paises.getEquipo1().getPuntos()==1 && paises.getEquipo2().getPuntos()==1 && paises.getEquipo4().getPuntos()==1 && paises.getEquipo3().getPuntos()==3) {
				
				
				Octavos.add(paises.getEquipo2());
				Octavos.add(paises.getEquipo4());
				
			}else if (paises.getEquipo1().getPuntos()==1 && paises.getEquipo3().getPuntos()==1 && paises.getEquipo4().getPuntos()==1 && paises.getEquipo2().getPuntos()==3) {
				
				
				Octavos.add(paises.getEquipo4());
				
				
			}else if (paises.getEquipo2().getPuntos()==1 && paises.getEquipo3().getPuntos()==1 && paises.getEquipo4().getPuntos()==1 && paises.getEquipo1().getPuntos()==3) {
				
				
				Octavos.add(paises.getEquipo4());
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			if (paises.getEquipo1().getPuntos()==2 &&paises.getEquipo2().getPuntos()==2 && paises.getEquipo3().getPuntos()==2) {
				
				
				Octavos.add(paises.getEquipo1());
				Octavos.add(paises.getEquipo3());
				
			}else if (paises.getEquipo1().getPuntos()==2 && paises.getEquipo2().getPuntos()==2 && paises.getEquipo4().getPuntos()==2) {
				
				
				Octavos.add(paises.getEquipo2());
				Octavos.add(paises.getEquipo4());
				
			}else if (paises.getEquipo1().getPuntos()==2 && paises.getEquipo3().getPuntos()==2 && paises.getEquipo4().getPuntos()==2) {
				
				
				Octavos.add(paises.getEquipo4());
				Octavos.add(paises.getEquipo3());
				
			}else if (paises.getEquipo2().getPuntos()==2 && paises.getEquipo3().getPuntos()==2 && paises.getEquipo4().getPuntos()==2) {
				
				
				Octavos.add(paises.getEquipo4());
				Octavos.add(paises.getEquipo2());
				
			}
			
			
			
			
			
			
			
			
			else if (paises.getEquipo1().getPuntos()==2 && paises.getEquipo2().getPuntos()==2) {
				paises.getEquipo1().setPuntos(3);
				paises.getEquipo2().setPuntos(2);
				
				Octavos.add(paises.getEquipo1());
				Octavos.add(paises.getEquipo2());
				
			}else if (paises.getEquipo3().getPuntos()==2 && paises.getEquipo4().getPuntos()==2) {
				paises.getEquipo3().setPuntos(3);
				paises.getEquipo4().setPuntos(2);
				
				Octavos.add(paises.getEquipo3());
				Octavos.add(paises.getEquipo4());
				
			}else if (paises.getEquipo1().getPuntos()==2 && paises.getEquipo3().getPuntos()==2) {
				paises.getEquipo1().setPuntos(3);
				paises.getEquipo3().setPuntos(2);
				
				Octavos.add(paises.getEquipo1());
				Octavos.add(paises.getEquipo3());
				
			}else if (paises.getEquipo2().getPuntos()==2 && paises.getEquipo4().getPuntos()==2) {
				paises.getEquipo2().setPuntos(3);
				paises.getEquipo4().setPuntos(2);
				
				Octavos.add(paises.getEquipo4());
				Octavos.add(paises.getEquipo2());
				
			}else if (paises.getEquipo1().getPuntos()==2 && paises.getEquipo4().getPuntos()==2) {
				paises.getEquipo1().setPuntos(3);
				paises.getEquipo4().setPuntos(2);
				
				Octavos.add(paises.getEquipo4());
				Octavos.add(paises.getEquipo1());
				
			}else if (paises.getEquipo2().getPuntos()==2 && paises.getEquipo3().getPuntos()==2) {
				paises.getEquipo2().setPuntos(3);
				paises.getEquipo3().setPuntos(2);
				
				Octavos.add(paises.getEquipo3());
				Octavos.add(paises.getEquipo2());
				
			}
			
			
		}
		
		
		
	}

}



