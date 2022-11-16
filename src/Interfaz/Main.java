package Interfaz;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import Logica.Grupo;
import Logica.Paises;

public class Main {

	public static void main(String[] args) {
		//faseGrupos();
	   
	    Paises pais1 = new Paises("Argentina",0,false,"C");
		Paises pais2 = new Paises("Arabia Saudita",0,false,"C");
		Paises pais3 = new Paises("Mexico",0,false,"C");
		Paises pais4 = new Paises("Polonia",0,false,"C");
		
		Paises pais5 = new Paises("Qatar",0,false,"A");
		Paises pais6 = new Paises("Ecuador",0,false,"A");
		Paises pais7 = new Paises("Senegal",0,false,"A");
		Paises pais8 = new Paises("Holanda",0,false,"A");
		
		Paises pais9 = new Paises("Inglaterra",0,false,"B");
		Paises pais10 = new Paises("Iran",0,false,"B");
		Paises pais11 = new Paises("USA",0,false,"B");
		Paises pais12 = new Paises("Gales",0,false,"B");
		
		Paises pais13= new Paises("Francia",0,false,"D");
		Paises pais14= new Paises("Australia",0,false,"D");
		Paises pais15= new Paises("Dinamarca",0,false,"D");
		Paises pais16= new Paises("Tunez",0,false,"D");
		
		Paises pais17= new Paises("España",0,false,"E");
		Paises pais18= new Paises("Costa Rica",0,false,"E");
		Paises pais19= new Paises("Alemania",0,false,"E");
		Paises pais20= new Paises("Japon",0,false,"E");
		
		Paises pais21= new Paises("Belgica",0,false,"F");
		Paises pais22= new Paises("Canada",0,false,"F");
		Paises pais23= new Paises("Marruecos",0,false,"F");
		Paises pais24= new Paises("Croacia",0,false,"F");
		
		Paises pais25= new Paises("Brazil",0,false,"G");
		Paises pais26= new Paises("Serbia",0,false,"G");
		Paises pais27= new Paises("Suiza",0,false,"G");
		Paises pais28= new Paises("Camerun",0,false,"G");
		
		Paises pais29= new Paises("Portugal",0,false,"H");
		Paises pais30= new Paises("Ghana",0,false,"H");
		Paises pais31= new Paises("Uruguay",0,false,"H");
		Paises pais32= new Paises("Corea del Sur",0,false,"H");
		
		
		LinkedList<Paises> faseGrupos =new LinkedList<Paises>();
		
		faseGrupos.add(0,pais1);
		faseGrupos.add(1,pais2);
		faseGrupos.add(2,pais3);
		faseGrupos.add(3,pais4);
		faseGrupos.add(4,pais5);
		faseGrupos.add(5,pais6);
		faseGrupos.add(6,pais7);
		faseGrupos.add(7,pais8);
		faseGrupos.add(8,pais9);
		faseGrupos.add(9,pais10);
		faseGrupos.add(10,pais11);
		faseGrupos.add(11,pais12);
		faseGrupos.add(12,pais13);
		faseGrupos.add(13,pais14);
		faseGrupos.add(14,pais15);
		faseGrupos.add(15,pais16);
		faseGrupos.add(16,pais17);
		faseGrupos.add(17,pais18);
		faseGrupos.add(18,pais19);
		faseGrupos.add(19,pais20);
		faseGrupos.add(20,pais21);
		faseGrupos.add(21,pais22);
		faseGrupos.add(22,pais23);
		faseGrupos.add(23,pais24);
		faseGrupos.add(24,pais25);
		faseGrupos.add(25,pais26);
		faseGrupos.add(26,pais27);
		faseGrupos.add(27,pais28);
		faseGrupos.add(28,pais29);
		faseGrupos.add(29,pais30);
		faseGrupos.add(30,pais31);
		faseGrupos.add(31,pais32);
		
		
		
		
		/*for (int i = 0; i <faseGrupos.size(); i++) {
			System.out.println("Equipo numero "+ (i+1)+ ":" +  faseGrupos.get(i));
		}*/
		
		Grupo grupoA = new Grupo(null,null,null,null);
		Grupo grupoB = new Grupo(null,null,null,null);
		Grupo grupoC = new Grupo(null,null,null,null);
		Grupo grupoD = new Grupo(null,null,null,null);
		Grupo grupoE = new Grupo(null,null,null,null);
		Grupo grupoF = new Grupo(null,null,null,null);
		Grupo grupoG = new Grupo(null,null,null,null);
		Grupo grupoH = new Grupo(null,null,null,null);
		
		
		int cont1=0;
		int cont2=0;
		int cont3=0;
		int cont4=0;
		int cont5=0;
		int cont6=0;
		int cont7=0;
		int cont8=0;

		for (Paises paises : faseGrupos) {
			if(paises.getGrupo().equalsIgnoreCase("A")) {
				cont1++;
				if(cont1==1) {
				grupoA.setEquipo1(paises);
				
				}
				if(cont1==2) {
					grupoA.setEquipo2(paises);
				}
				if(cont1==3) {
					grupoA.setEquipo3(paises);
				}
				if(cont1==4) {
					grupoA.setEquipo4(paises);
				}
			}
			
			if(paises.getGrupo().equalsIgnoreCase("B")) {
				cont2++;
				if(cont2==1) {
				    grupoB.setEquipo1(paises);
				}
				if(cont2==2) {
					grupoB.setEquipo2(paises);
				}
				if(cont2==3) {
					grupoB.setEquipo3(paises);
				}
				if(cont2==4) {
					grupoB.setEquipo4(paises);
				}
				
				
				
			}
			if(paises.getGrupo().equals("C")) {
				cont3++;
				if(cont3==1) {
				    grupoC.setEquipo1(paises);
				}
				if(cont3==2) {
					grupoC.setEquipo2(paises);
				}
				if(cont3==3) {
					grupoC.setEquipo3(paises);
				}
				if(cont3==4) {
					grupoC.setEquipo4(paises);
				}
				
				
				
			}
			if(paises.getGrupo().equals("D")) {
				cont4++;
				if(cont4==1) {
				    grupoD.setEquipo1(paises);
				}
				if(cont4==2) {
					grupoD.setEquipo2(paises);
				}
				if(cont4==3) {
					grupoD.setEquipo3(paises);
				}
				if(cont4==4) {
					grupoD.setEquipo4(paises);
				}
				
			}
			if(paises.getGrupo().equals("E")) {
				cont5++;
				if(cont5==1) {
				    grupoE.setEquipo1(paises);
				}
				if(cont5==2) {
					grupoE.setEquipo2(paises);
				}
				if(cont5==3) {
					grupoE.setEquipo3(paises);
				}
				if(cont5==4) {
					grupoE.setEquipo4(paises);
				}
				
				
				
			}
			if(paises.getGrupo().equals("F")) {
				cont6++;
				if(cont6==1) {
				    grupoF.setEquipo1(paises);
				}
				if(cont6==2) {
					grupoF.setEquipo2(paises);
				}
				if(cont6==3) {
					grupoF.setEquipo3(paises);
				}
				if(cont6==4) {
					grupoF.setEquipo4(paises);
				}
				
				
				
			}
			if(paises.getGrupo().equals("G")) {
				cont7++;
				if(cont7==1) {
				    grupoG.setEquipo1(paises);
				}
				if(cont7==2) {
					grupoG.setEquipo2(paises);
				}
				if(cont7==3) {
					grupoG.setEquipo3(paises);
				}
				if(cont7==4) {
					grupoG.setEquipo4(paises);
				}
				
				
				
			}
			if(paises.getGrupo().equals("H")) {
				cont8++;
				if(cont8==1) {
				    grupoH.setEquipo1(paises);
				}
				if(cont8==2) {
					grupoH.setEquipo2(paises);
				}
				if(cont8==3) {
					grupoH.setEquipo3(paises);
				}
				if(cont8==4) {
					grupoH.setEquipo4(paises);
				}
				
				
				
			}
			
			
		}
		
		
		LinkedList<Grupo> Grupos =new LinkedList<Grupo>();
		Grupos.add(grupoA);
		Grupos.add(grupoB);
		Grupos.add(grupoC);
		Grupos.add(grupoD);
		Grupos.add(grupoE);
		Grupos.add(grupoF);
		Grupos.add(grupoG);
		Grupos.add(grupoH);
		
		
		
		
		
	  Scanner entrada = new Scanner(System.in);
	  System.out.println("Bienvenido al fixtuere del Mundial");
	  System.out.println("-----------------------------------");
	  
	  System.out.println("¿Que opcion desea elegir?");
	  System.out.println("1-Ver lista de todos los paises ");
	  System.out.println("2-Ver los grupos ");
	  int res= entrada.nextInt();
	  
	  switch (res) {
	  
	case 1:
		System.out.println("Lista de los 32 Equipos");
		for (int i = 0; i <faseGrupos.size(); i++) {
			System.out.println("Equipo numero "+ (i+1)+ ":" +  faseGrupos.get(i));
		}
		
		break;
    case 2:
    	System.out.println("¿Que grupo desea ver?");
    	System.out.println("1-Grupo A");
    	System.out.println("2-Grupo B");
    	System.out.println("3-Grupo C");
    	System.out.println("4-Grupo D");
    	System.out.println("5-Grupo E");
    	System.out.println("6-Grupo F");
    	System.out.println("7-Grupo G");
    	System.out.println("8-Grupo H");
    	int num =entrada.nextInt();
    	
    	      switch (num) {
		      case 1:
		    	  for (Grupo grupo : Grupos) {
		    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("A")) {
		    			  System.out.println(grupo.getEquipo1());
		    			  System.out.println(grupo.getEquipo2());
		    			  System.out.println(grupo.getEquipo3());
		    			  System.out.println(grupo.getEquipo4());
					}
				}
						
					
		  		
		    		 
			       break;
		      case 2:
		    	  for (Grupo grupo : Grupos) {
		    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("B")) {
		    			  System.out.println(grupo.getEquipo1());
		    			  System.out.println(grupo.getEquipo2());
		    			  System.out.println(grupo.getEquipo3());
		    			  System.out.println(grupo.getEquipo4());
					}
				}
					
			       break;
		      case 3:
		    	  for (Grupo grupo : Grupos) {
		    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("C")) {
		    			  System.out.println(grupo.getEquipo1());
		    			  System.out.println(grupo.getEquipo2());
		    			  System.out.println(grupo.getEquipo3());
		    			  System.out.println(grupo.getEquipo4());
					}
				}
					
			       break;
		      case 4:
		    	  for (Grupo grupo : Grupos) {
		    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("D")) {
		    			  System.out.println(grupo.getEquipo1());
		    			  System.out.println(grupo.getEquipo2());
		    			  System.out.println(grupo.getEquipo3());
		    			  System.out.println(grupo.getEquipo4());
					}
				}
					
			       break;
		      case 5:
		    	  for (Grupo grupo : Grupos) {
		    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("E")) {
		    			  System.out.println(grupo.getEquipo1());
		    			  System.out.println(grupo.getEquipo2());
		    			  System.out.println(grupo.getEquipo3());
		    			  System.out.println(grupo.getEquipo4());
					}
				}
					
			       break;
		      case 6:
		    	  for (Grupo grupo : Grupos) {
		    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("F")) {
		    			  System.out.println(grupo.getEquipo1());
		    			  System.out.println(grupo.getEquipo2());
		    			  System.out.println(grupo.getEquipo3());
		    			  System.out.println(grupo.getEquipo4());
					}
				}
					
			       break;
		      case 7:
		    	  for (Grupo grupo : Grupos) {
		    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("G")) {
		    			  System.out.println(grupo.getEquipo1());
		    			  System.out.println(grupo.getEquipo2());
		    			  System.out.println(grupo.getEquipo3());
		    			  System.out.println(grupo.getEquipo4());
					}
				}
					
			       break;
		      case 8:
		    	  for (Grupo grupo : Grupos) {
		    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("H")) {
		    			  System.out.println(grupo.getEquipo1());
		    			  System.out.println(grupo.getEquipo2());
		    			  System.out.println(grupo.getEquipo3());
		    			  System.out.println(grupo.getEquipo4());
					}
				}
					
			       break;

		       default:
			   break;
    	      }
    	
		
		break;
		

	   default:
		break;
	}
	  
		
		
		
		
		/*for (Grupo grupo : Grupos) {
			
			System.out.println("Grupo " +  grupo.getEquipo1().getGrupo() + " Nombre " + grupo.getEquipo1().getNombre());
		}*/
		
		
		
			
		}

   
  
   
  

}
