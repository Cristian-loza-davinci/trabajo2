package Interfaz;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import Logica.Grupo;
import Logica.Paises;
import Logica.Partido;
import Logica.Admin;
import Logica.Torneo;
public class Main {

	public static void main(String[] args) {
		//faseGrupos();
	   
	    Paises pais1 = new Paises("Argentina",0,false,"C",0);
		Paises pais2 = new Paises("Arabia Saudita",0,false,"C",0);
		Paises pais3 = new Paises("Mexico",0,false,"C",0);
		Paises pais4 = new Paises("Polonia",0,false,"C",0);
		
		Paises pais5 = new Paises("Qatar",0,false,"A",0);
		Paises pais6 = new Paises("Ecuador",0,false,"A",0);
		Paises pais7 = new Paises("Senegal",0,false,"A",0);
		Paises pais8 = new Paises("Holanda",0,false,"A",0);
		
		Paises pais9 = new Paises("Inglaterra",0,false,"B",0);
		Paises pais10 = new Paises("Iran",0,false,"B",0);
		Paises pais11 = new Paises("USA",0,false,"B",0);
		Paises pais12 = new Paises("Gales",0,false,"B",0);
		
		Paises pais13= new Paises("Francia",0,false,"D",0);
		Paises pais14= new Paises("Australia",0,false,"D",0);
		Paises pais15= new Paises("Dinamarca",0,false,"D",0);
		Paises pais16= new Paises("Tunez",0,false,"D",0);
		
		Paises pais17= new Paises("España",0,false,"E",0);
		Paises pais18= new Paises("Costa Rica",0,false,"E",0);
		Paises pais19= new Paises("Alemania",0,false,"E",0);
		Paises pais20= new Paises("Japon",0,false,"E",0);
		
		Paises pais21= new Paises("Belgica",0,false,"F",0);
		Paises pais22= new Paises("Canada",0,false,"F",0);
		Paises pais23= new Paises("Marruecos",0,false,"F",0);
		Paises pais24= new Paises("Croacia",0,false,"F",0);
		
		Paises pais25= new Paises("Brazil",0,false,"G",0);
		Paises pais26= new Paises("Serbia",0,false,"G",0);
		Paises pais27= new Paises("Suiza",0,false,"G",0);
		Paises pais28= new Paises("Camerun",0,false,"G",0);
		
		Paises pais29= new Paises("Portugal",0,false,"H",0);
		Paises pais30= new Paises("Ghana",0,false,"H",0);
		Paises pais31= new Paises("Uruguay",0,false,"H",0);
		Paises pais32= new Paises("Corea del Sur",0,false,"H",0);
		
		
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
	
		Grupo grupoA = new Grupo(null,null,null,null);
		Grupo grupoB = new Grupo(null,null,null,null);
		Grupo grupoC = new Grupo(null,null,null,null);
		Grupo grupoD = new Grupo(null,null,null,null);
		Grupo grupoE = new Grupo(null,null,null,null);
		Grupo grupoF = new Grupo(null,null,null,null);
		Grupo grupoG = new Grupo(null,null,null,null);
		Grupo grupoH = new Grupo(null,null,null,null);
		
		
		//--------------------AGRUPACION DE PAISES EN SUS GRUPOS-----------
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
			if(paises.getGrupo().equalsIgnoreCase("C")) {
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
			if(paises.getGrupo().equalsIgnoreCase("D")) {
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
			if(paises.getGrupo().equalsIgnoreCase("E")) {
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
			if(paises.getGrupo().equalsIgnoreCase("F")) {
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
			if(paises.getGrupo().equalsIgnoreCase("G")) {
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
			if(paises.getGrupo().equalsIgnoreCase("H")) {
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
		
		
		
		Partido partido1 =new Partido("A",null,null,0,0);
		Partido partido2 =new Partido("A",null,null,0,0);
		Partido partido3 =new Partido("A",null,null,0,0);
		Partido partido4 =new Partido("A",null,null,0,0);
		Partido partido5 =new Partido("A",null,null,0,0);
		Partido partido6 =new Partido("A",null,null,0,0);
		Partido partido7 =new Partido("B",null,null,0,0);
		Partido partido8 =new Partido("B",null,null,0,0);
		Partido partido9 =new Partido("B",null,null,0,0);
		Partido partido10 =new Partido("B",null,null,0,0);
		Partido partido11 =new Partido("B",null,null,0,0);
		Partido partido12 =new Partido("B",null,null,0,0);
		Partido partido13 =new Partido("C",null,null,0,0);
		Partido partido14 =new Partido("C",null,null,0,0);
		Partido partido15=new Partido("C",null,null,0,0);
		Partido partido16 =new Partido("C",null,null,0,0);
		Partido partido17 =new Partido("C",null,null,0,0);
		Partido partido18 =new Partido("C",null,null,0,0);
		Partido partido19 =new Partido("D",null,null,0,0);
		Partido partido20 =new Partido("D",null,null,0,0);
		Partido partido21 =new Partido("D",null,null,0,0);
		Partido partido22 =new Partido("D",null,null,0,0);
		Partido partido23 =new Partido("D",null,null,0,0);
		Partido partido24 =new Partido("D",null,null,0,0);
		Partido partido25 =new Partido("E",null,null,0,0);	
		Partido partido26 =new Partido("E",null,null,0,0);
		Partido partido27 =new Partido("E",null,null,0,0);	
		Partido partido28 =new Partido("E",null,null,0,0);	
		Partido partido29 =new Partido("E",null,null,0,0);	
		Partido partido30 =new Partido("E",null,null,0,0);	
		Partido partido31 =new Partido("F",null,null,0,0);	
		Partido partido32 =new Partido("F",null,null,0,0);
		Partido partido33 =new Partido("F",null,null,0,0);	
		Partido partido34 =new Partido("F",null,null,0,0);	
		Partido partido35 =new Partido("F",null,null,0,0);	
		Partido partido36 =new Partido("F",null,null,0,0);	
		Partido partido37 =new Partido("G",null,null,0,0);	
		Partido partido38 =new Partido("G",null,null,0,0);
		Partido partido39 =new Partido("G",null,null,0,0);	
		Partido partido40 =new Partido("G",null,null,0,0);
		Partido partido41 =new Partido("G",null,null,0,0);	
		Partido partido42 =new Partido("G",null,null,0,0);	
		Partido partido43 =new Partido("H",null,null,0,0);	
		Partido partido44 =new Partido("H",null,null,0,0);	
		Partido partido45 =new Partido("H",null,null,0,0);	
		Partido partido46 =new Partido("H",null,null,0,0);	
		Partido partido47 =new Partido("H",null,null,0,0);	
		Partido partido48 =new Partido("H",null,null,0,0);	
		
		int aux1=0;
		int aux2=0;
		int aux3=0;
		int aux4=0;
		int aux5=0;
		int aux6=0;
		int aux7=0;
		int aux8=0;
		for (Paises pais : faseGrupos) {
			if(pais.getGrupo().equalsIgnoreCase("A")) {
				aux1++;
				if(aux1==1) {
				    partido1.setPaisA(pais);
				    partido2.setPaisB(pais);
				    partido3.setPaisA(pais);
				
				}
				if(aux1==2) {
					partido1.setPaisB(pais);
					partido4.setPaisA(pais);
					partido5.setPaisB(pais);
				}
				if(aux1==3) {
					partido2.setPaisA(pais);
					partido4.setPaisB(pais);
					partido6.setPaisA(pais);
				}
				if(aux1==4) {
					partido3.setPaisB(pais);
					partido5.setPaisA(pais);
					partido6.setPaisB(pais);
				}
				
				
			}
			
			if(pais.getGrupo().equalsIgnoreCase("B")) {
				aux2++;
				if(aux2==1) {
				    partido7.setPaisA(pais);
				    partido8.setPaisB(pais);
				    partido9.setPaisA(pais);
				
				}
				if(aux2==2) {
					partido7.setPaisB(pais);
					partido10.setPaisA(pais);
					partido11.setPaisB(pais);
				}
				if(aux2==3) {
					partido8.setPaisA(pais);
					partido10.setPaisB(pais);
					partido12.setPaisA(pais);
				}
				if(aux2==4) {
					partido9.setPaisB(pais);
					partido11.setPaisA(pais);
					partido12.setPaisB(pais);
				}
				
				
			}
			
			if(pais.getGrupo().equalsIgnoreCase("C")) {
				aux3++;
				if(aux3==1) {
				    partido13.setPaisA(pais);
				    partido14.setPaisB(pais);
				    partido15.setPaisA(pais);
				
				}
				if(aux3==2) {
					partido13.setPaisB(pais);
					partido16.setPaisA(pais);
					partido17.setPaisB(pais);
				}
				if(aux3==3) {
					partido14.setPaisA(pais);
					partido16.setPaisB(pais);
					partido18.setPaisA(pais);
				}
				if(aux3==4) {
					partido15.setPaisB(pais);
					partido17.setPaisA(pais);
					partido18.setPaisB(pais);
				}
				
				
			}
			
			if(pais.getGrupo().equalsIgnoreCase("D")) {
				aux4++;
				if(aux4==1) {
				    partido19.setPaisA(pais);
				    partido20.setPaisB(pais);
				    partido21.setPaisA(pais);
				
				}
				if(aux4==2) {
					partido19.setPaisB(pais);
					partido22.setPaisA(pais);
					partido23.setPaisB(pais);
				}
				if(aux4==3) {
					partido20.setPaisA(pais);
					partido22.setPaisB(pais);
					partido24.setPaisA(pais);
				}
				if(aux4==4) {
					partido21.setPaisB(pais);
					partido23.setPaisA(pais);
					partido24.setPaisB(pais);
				}
				
				
			}
			
			if(pais.getGrupo().equalsIgnoreCase("E")) {
				aux5++;
				if(aux5==1) {
				    partido25.setPaisA(pais);
				    partido26.setPaisB(pais);
				    partido27.setPaisA(pais);
				
				}
				if(aux5==2) {
					partido25.setPaisB(pais);
					partido28.setPaisA(pais);
					partido29.setPaisB(pais);
				}
				if(aux5==3) {
					partido26.setPaisA(pais);
					partido28.setPaisB(pais);
					partido30.setPaisA(pais);
				}
				if(aux5==4) {
					partido27.setPaisB(pais);
					partido29.setPaisA(pais);
					partido30.setPaisB(pais);
				}
				
				
			}
			
			if(pais.getGrupo().equalsIgnoreCase("F")) {
				aux6++;
				if(aux6==1) {
				    partido31.setPaisA(pais);
				    partido32.setPaisB(pais);
				    partido33.setPaisA(pais);
				
				}
				if(aux6==2) {
					partido31.setPaisB(pais);
					partido34.setPaisA(pais);
					partido35.setPaisB(pais);
				}
				if(aux6==3) {
					partido32.setPaisA(pais);
					partido34.setPaisB(pais);
					partido36.setPaisA(pais);
				}
				if(aux6==4) {
					partido33.setPaisB(pais);
					partido35.setPaisA(pais);
					partido36.setPaisB(pais);
				}
				
				
			}
			
			if(pais.getGrupo().equalsIgnoreCase("G")) {
				aux7++;
				if(aux7==1) {
				    partido37.setPaisA(pais);
				    partido38.setPaisB(pais);
				    partido39.setPaisA(pais);
				
				}
				if(aux7==2) {
					partido37.setPaisB(pais);
					partido40.setPaisA(pais);
					partido41.setPaisB(pais);
				}
				if(aux7==3) {
					partido38.setPaisA(pais);
					partido40.setPaisB(pais);
					partido42.setPaisA(pais);
				}
				if(aux7==4) {
					partido39.setPaisB(pais);
					partido41.setPaisA(pais);
					partido42.setPaisB(pais);
				}
				
				
			}
			
			if(pais.getGrupo().equalsIgnoreCase("H")) {
				aux8++;
				if(aux8==1) {
				    partido43.setPaisA(pais);
				    partido44.setPaisB(pais);
				    partido45.setPaisA(pais);
				
				}
				if(aux8==2) {
					partido43.setPaisB(pais);
					partido46.setPaisA(pais);
					partido47.setPaisB(pais);
				}
				if(aux8==3) {
					partido44.setPaisA(pais);
					partido46.setPaisB(pais);
					partido48.setPaisA(pais);
				}
				if(aux8==4) {
					partido45.setPaisB(pais);
					partido47.setPaisA(pais);
					partido48.setPaisB(pais);
				}
				
				
			}
			
		}
		
		LinkedList<Partido> listaPartidosG =new LinkedList<Partido>();
		listaPartidosG.add(partido1);
		listaPartidosG.add(partido2);
		listaPartidosG.add(partido3);
		listaPartidosG.add(partido4);
		listaPartidosG.add(partido5);
		listaPartidosG.add(partido6);
		listaPartidosG.add(partido7);
		listaPartidosG.add(partido8);
		listaPartidosG.add(partido9);
		listaPartidosG.add(partido10);
		listaPartidosG.add(partido11);
		listaPartidosG.add(partido12);
		listaPartidosG.add(partido13);
		listaPartidosG.add(partido14);
		listaPartidosG.add(partido15);
		listaPartidosG.add(partido16);
		listaPartidosG.add(partido17);
		listaPartidosG.add(partido18);
		listaPartidosG.add(partido19);
		listaPartidosG.add(partido20);
		listaPartidosG.add(partido21);
		listaPartidosG.add(partido22);
		listaPartidosG.add(partido23);
		listaPartidosG.add(partido24);
		listaPartidosG.add(partido25);
		listaPartidosG.add(partido26);
		listaPartidosG.add(partido27);
		listaPartidosG.add(partido28);
		listaPartidosG.add(partido29);
		listaPartidosG.add(partido30);
		listaPartidosG.add(partido31);
		listaPartidosG.add(partido32);
		listaPartidosG.add(partido33);
		listaPartidosG.add(partido34);
		listaPartidosG.add(partido35);
		listaPartidosG.add(partido36);
		listaPartidosG.add(partido37);
		listaPartidosG.add(partido38);
		listaPartidosG.add(partido39);
		listaPartidosG.add(partido40);
		listaPartidosG.add(partido41);
		listaPartidosG.add(partido42);
		listaPartidosG.add(partido43);
		listaPartidosG.add(partido44);
		listaPartidosG.add(partido45);
		listaPartidosG.add(partido46);
		listaPartidosG.add(partido47);
		listaPartidosG.add(partido48);
		
		
		//--------------Lista de Octavos--------------------//
		LinkedList<Paises> Octavos =new LinkedList<Paises>();
		
	
		
		LinkedList<Partido> partido8vos =new LinkedList<Partido>();
		
		
	
		
		
		
		
		
		
		
		//-------------------------- Interfaz De Usuario/Administrador------------------------------//
		int corr=0;
		do {
			Scanner aux = new Scanner(System.in);
		System.out.println("Bienvenido");
		System.out.println("¿Como desea ingresar?");
		System.out.println("1-Espectador");
		System.out.println("2-Administrador");
		int menu=aux.nextInt();
		switch (menu) {
		case 1:
			int carga=0;
			if (carga==0) {
				Admin.cargarResultados(listaPartidosG);
				Admin.darPuntos(listaPartidosG);
				Admin.clasiOctavos(Grupos, Octavos);
			}
			MenuUsuario(Grupos,faseGrupos,listaPartidosG, Octavos,partido8vos);
			
			
			corr=1;
			break;
         case 2:
			MenuAdmin(listaPartidosG, Grupos, Octavos);
			corr=1;
			break;

		default:
			System.out.println("Opcion incorrecta vuelva a intentarlo \n");
			corr=0;
			break;
		}
		if (corr==1) {
			System.out.println("\n Desea volver al menu de Opcion de Usuario?");
			  System.out.println("1-si");
			  System.out.println("2-no");
			  corr=aux.nextInt();
		}
		
		}while(corr<=1);
		
			
		}
	
	
	public static  void MenuAdmin(LinkedList<Partido> listaPartidosG,LinkedList<Grupo> Grupos,LinkedList<Paises> Octavos ) {
		Scanner aux2 = new Scanner(System.in);
		int lis=0;
		do {
			System.out.println("Bienvenido al menu Administrativo \n");
		
		System.out.println("¿Que opcion desea elegir?");
		System.out.println("1-Cargar los resultados de los partidos");
		System.out.println("2-Subir Octavos");
		int resp=aux2.nextInt();
		switch (resp) {
		case 1:
			Admin.cargarResultados(listaPartidosG);
			Admin.darPuntos(listaPartidosG);
			System.out.println("Resultados cargados correctamente \n");
			System.out.println("¿Quieres ver los resultados?");
			System.out.println("1-Si");
			System.out.println("2-No");
			int aux=aux2.nextInt();
			if (aux==1) {
				Admin.mostarResultadosFG(listaPartidosG);
 			}
			break;
		case 2:
			Admin.clasiOctavos(Grupos, Octavos);
			System.out.println("Lista subida correctamente");
			
		 break;

		default:
			break;
		}
		System.out.println("Quieres volver al menu del Admin?");
		System.out.println("1-Si");
		System.out.println("2-No");
		int cod=aux2.nextInt();
		if (cod==1) {
			lis=0;
			
		}
		if (cod==2) {
			lis=2;
			
		}
		}while(lis<1);
		
		
		
		
		
		
		
	}
	
	
	public static  void MenuUsuario(LinkedList<Grupo> Grupos,LinkedList<Paises> faseGrupos,LinkedList<Partido> listaPartidosG,LinkedList<Paises> Octavos,LinkedList<Partido> partido8vos) {
		int opt=0;
		do {
			
			Scanner entrada = new Scanner(System.in);
		  System.out.println("Bienvenido al fixtuere del Mundial");
		  System.out.println("-----------------------------------");
		  
		  System.out.println("¿Que opcion desea elegir?");
		  System.out.println("1-Ver lista de todos los paises ");
		  System.out.println("2-Ver los grupos ");
		  System.out.println("3-Ver los Partidos");
		  System.out.println("4-Ver lista de Octavos");
		  System.out.println("5-Ver resultados de Octavos de final");
		  int res= entrada.nextInt();
		  
		  switch (res) {
		  
			case 1:
				System.out.println("Lista de los 32 Equipos");
				for (Paises pais : faseGrupos) {
					System.out.println("Nombre de pais: "+pais.getNombre()+ "\n Goles: "+pais.getGoles()+ "\n Grupo: " +pais.getGrupo()+"\n");
					opt=1;
					
				}
				
				break;
		    case 2:
		    	verGrupos(Grupos);
		    	opt=1;
				
				break;
				
		    case 3:
		    	verPartidos(listaPartidosG);
		    	opt=1;
		    	break;
		    case 4:
		    	for (Paises paises2 : Octavos) {
					System.out.println("Los paises que pasaron a Octavos son : " +paises2.getNombre());
					
				}
		    	opt=1;
		    	break;
		    	
		    case 5:
		    	Torneo.Partido8vos(Octavos,partido8vos);
		    	for (Partido partidoOct : partido8vos) {
		    		
		    		System.out.println("\n"+partidoOct.getPaisA().getNombre()+" " + partidoOct.getGoles1()+ " vs " +partidoOct.getGoles2()+ " " + partidoOct.getPaisB().getNombre()+ ": Finalizado");
					
				}
		    	break;
				

			   default:
				   System.out.println("Opcion no valida \n");
				   opt=0;
				   
				
			}
		  if (opt==1) {
			System.out.println("\n Quieres ver las Otras Opciones de Vista?");
		  System.out.println("1-si");
		  System.out.println("2-no");
		  int up = entrada.nextInt();
	      if (up==1) {
 	    	   opt=0;
				
			}if (up==2) {
				opt=2;
				
			} 
		}
		  
			
		}while(opt<=1);
		  
	}
	public static void verGrupos(LinkedList<Grupo> Grupos) {
		Scanner entrada = new Scanner(System.in);
		int opt=0;
		do {
			
			System.out.println("¿Que grupo desea ver?");
			System.out.println("Ingrese con numero la opcion que desea elegir");
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
			    	  System.out.println("El grupo A se compone por: \n");
			    	  for (Grupo grupo : Grupos) {
			    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("A")) {
			    			  System.out.println("Pais 1: " +grupo.getEquipo1().getNombre()+": " +grupo.getEquipo1().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 2: " +grupo.getEquipo2().getNombre()+": " +grupo.getEquipo2().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 3: " +grupo.getEquipo3().getNombre()+": " +grupo.getEquipo3().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 4: " +grupo.getEquipo4().getNombre()+": " +grupo.getEquipo4().getPuntos()+ " Puntos");
			    			  opt=1;
						}
					}
							
						
			  		
			    		 
				       break;
			      case 2:
			    	  System.out.println("El grupo B se compone por: \n");
			    	  for (Grupo grupo : Grupos) {
			    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("B")) {
			    			  System.out.println("Pais 1: " +grupo.getEquipo1().getNombre()+": " +grupo.getEquipo1().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 2: " +grupo.getEquipo2().getNombre()+": " +grupo.getEquipo2().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 3: " +grupo.getEquipo3().getNombre()+": " +grupo.getEquipo3().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 4: " +grupo.getEquipo4().getNombre()+": " +grupo.getEquipo4().getPuntos()+ " Puntos");
			    			  opt=1;
						}
					}
						
				       break;
			      case 3:
			    	  System.out.println("El grupo C se compone por: \n");
			    	  for (Grupo grupo : Grupos) {
			    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("C")) {
			    			  System.out.println("Pais 1: " +grupo.getEquipo1().getNombre()+": " +grupo.getEquipo1().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 2: " +grupo.getEquipo2().getNombre()+": " +grupo.getEquipo2().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 3: " +grupo.getEquipo3().getNombre()+": " +grupo.getEquipo3().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 4: " +grupo.getEquipo4().getNombre()+": " +grupo.getEquipo4().getPuntos()+ " Puntos");
			    			  opt=1;
						}
					}
						
				       break;
			      case 4:
			    	  System.out.println("El grupo D se compone por: \n");
			    	  for (Grupo grupo : Grupos) {
			    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("D")) {
			    			  System.out.println("Pais 1: " +grupo.getEquipo1().getNombre()+": " +grupo.getEquipo1().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 2: " +grupo.getEquipo2().getNombre()+": " +grupo.getEquipo2().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 3: " +grupo.getEquipo3().getNombre()+": " +grupo.getEquipo3().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 4: " +grupo.getEquipo4().getNombre()+": " +grupo.getEquipo4().getPuntos()+ " Puntos");
			    			  opt=1;
						}
					}
						
				       break;
			      case 5:
			    	  System.out.println("El grupo E se compone por: \n");
			    	  for (Grupo grupo : Grupos) {
			    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("E")) {
			    			  System.out.println("Pais 1: " +grupo.getEquipo1().getNombre()+": " +grupo.getEquipo1().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 2: " +grupo.getEquipo2().getNombre()+": " +grupo.getEquipo2().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 3: " +grupo.getEquipo3().getNombre()+": " +grupo.getEquipo3().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 4: " +grupo.getEquipo4().getNombre()+": " +grupo.getEquipo4().getPuntos()+ " Puntos");
			    			  opt=1;
						}
					}
						
				       break;
			      case 6:
			    	  System.out.println("El grupo F se compone por: \n");
			    	  for (Grupo grupo : Grupos) {
			    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("F")) {
			    			  System.out.println("Pais 1: " +grupo.getEquipo1().getNombre()+": " +grupo.getEquipo1().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 2: " +grupo.getEquipo2().getNombre()+": " +grupo.getEquipo2().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 3: " +grupo.getEquipo3().getNombre()+": " +grupo.getEquipo3().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 4: " +grupo.getEquipo4().getNombre()+": " +grupo.getEquipo4().getPuntos()+ " Puntos");
			    			  opt=1;
						}
					}
						
				       break;
			      case 7:
			    	  System.out.println("El grupo G se compone por: \n");
			    	  for (Grupo grupo : Grupos) {
			    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("G")) {
			    			  System.out.println("Pais 1: " +grupo.getEquipo1().getNombre()+": " +grupo.getEquipo1().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 2: " +grupo.getEquipo2().getNombre()+": " +grupo.getEquipo2().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 3: " +grupo.getEquipo3().getNombre()+": " +grupo.getEquipo3().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 4: " +grupo.getEquipo4().getNombre()+": " +grupo.getEquipo4().getPuntos()+ " Puntos");
			    			  opt=1;
						}
					}
						
				       break;
			      case 8:
			    	  System.out.println("El grupo H se compone por: \n");
			    	  for (Grupo grupo : Grupos) {
			    		  if (grupo.getEquipo1().getGrupo().equalsIgnoreCase("H")) {
			    			  System.out.println("Pais 1: " +grupo.getEquipo1().getNombre()+": " +grupo.getEquipo1().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 2: " +grupo.getEquipo2().getNombre()+": " +grupo.getEquipo2().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 3: " +grupo.getEquipo3().getNombre()+": " +grupo.getEquipo3().getPuntos()+ " Puntos");
			    			  System.out.println("Pais 4: " +grupo.getEquipo4().getNombre()+": " +grupo.getEquipo4().getPuntos()+ " Puntos");
			    			  opt=1;
						}
					}
						
				       break;

			       default:
			    	   System.out.println("Opcion no valido, vuelva a intentar");
			    	   opt=0;
			    	   
	    	      }
	    	      if (opt==1) {
					System.out.println("Queres ver otros grupos?");
	    	      System.out.println("1-Si");
	    	      System.out.println("2-No");
	    	      int up = entrada.nextInt();
	    	      if (up==1) {
	     	    	   opt=0;
	   				
	   			}if (up==2) {
	   				opt=2;
	   				
	   			}
				}
	    	      
	   			
	    	      
	    	     
			
		}while(opt<=1);
		
		
		
    	
		
	}
	public static void verPartidos(LinkedList<Partido> listaPartidosG) {
		Scanner entrada = new Scanner(System.in);
		int opt=0;
		do {
			
			System.out.println("Partidos de que grupo quiere ver?");
	    	System.out.println("1-Grupo A");
	    	System.out.println("2-Grupo B");
	    	System.out.println("3-Grupo C");
	    	System.out.println("4-Grupo D");
	    	System.out.println("5-Grupo E");
	    	System.out.println("6-Grupo F");
	    	System.out.println("7-Grupo G");
	    	System.out.println("8-Grupo H");
	    	int grup=entrada.nextInt();
	    	
	    	
	    	switch (grup) {
			case 1:
				System.out.println("Los partidos del Grupo A son ");
				for (Partido partido : listaPartidosG) {
					if (partido.getIdPartido().equals("A")) {
						
						System.out.println("\n"+partido.getPaisA().getNombre()+" " + partido.getGoles1()+ " vs " +partido.getGoles2()+ " " + partido.getPaisB().getNombre()+ ": Finalizado");
						
						opt=1;
					}
				}
				
				break;
			case 2:
				System.out.println("Los partidos del Grupo B son ");
				for (Partido partido : listaPartidosG) {
					if (partido.getIdPartido().equals("B")) {
						
						System.out.println("\n"+partido.getPaisA().getNombre()+" " + partido.getGoles1()+ " vs " +partido.getGoles2()+ " " + partido.getPaisB().getNombre()+ ": Finalizado");
						opt=1;
					}
				}
				
				break;
				
			case 3:
				System.out.println("Los partidos del Grupo C son ");
				for (Partido partido : listaPartidosG) {
					if (partido.getIdPartido().equals("C")) {
						
						System.out.println("\n"+partido.getPaisA().getNombre()+" " + partido.getGoles1()+ " vs " +partido.getGoles2()+ " " + partido.getPaisB().getNombre()+ ": Finalizado");
						opt=1;
					}
				}
				
				break;
				
			case 4:
				System.out.println("Los partidos del Grupo D son ");
				for (Partido partido : listaPartidosG) {
					if (partido.getIdPartido().equals("D")) {
						
						System.out.println("\n"+partido.getPaisA().getNombre()+" " + partido.getGoles1()+ " vs " +partido.getGoles2()+ " " + partido.getPaisB().getNombre()+ ": Finalizado");
						opt=1;
					}
				}
				
				break;
				
			case 5:
				System.out.println("Los partidos del Grupo E son ");
				for (Partido partido : listaPartidosG) {
					if (partido.getIdPartido().equals("E")) {
						
						System.out.println("\n"+partido.getPaisA().getNombre()+" " + partido.getGoles1()+ " vs " +partido.getGoles2()+ " " + partido.getPaisB().getNombre()+ ": Finalizado");
						opt=1;
					}
				}
				
				break;
				
			case 6:
				System.out.println("Los partidos del Grupo F son ");
				for (Partido partido : listaPartidosG) {
					if (partido.getIdPartido().equals("F")) {
						
						System.out.println("\n"+partido.getPaisA().getNombre()+" " + partido.getGoles1()+ " vs " +partido.getGoles2()+ " " + partido.getPaisB().getNombre()+ ": Finalizado");
						opt=1;
					}
				}
				
				break;
				
			case 7:
				System.out.println("Los partidos del Grupo G son ");
				for (Partido partido : listaPartidosG) {
					if (partido.getIdPartido().equals("G")) {
						
						System.out.println("\n"+partido.getPaisA().getNombre()+" " + partido.getGoles1()+ " vs " +partido.getGoles2()+ " " + partido.getPaisB().getNombre()+ ": Finalizado");
						opt=1;
					}
				}
				
				break;
				
			case 8:
				System.out.println("Los partidos del Grupo H son ");
				for (Partido partido : listaPartidosG) {
					if (partido.getIdPartido().equals("H")) {
						
						System.out.println("\n"+partido.getPaisA().getNombre()+" " + partido.getGoles1()+ " vs " +partido.getGoles2()+ " " + partido.getPaisB().getNombre()+ ": Finalizado");
						opt=1;
					}
				}
				
				break;

			default:
				System.out.println("Opcion incorrecta vuelva a intertarlo ");
				opt=0;
				break;
			}
	    	if (opt==1 ) {
				System.out.println("Queres ver otros Paartidos ?");
  	      System.out.println("1-Si");
  	      System.out.println("2-No");
  	      int up = entrada.nextInt();
  	       if (up==1) {
  	    	   opt=0;
				
			}if (up==2) {
				opt=2;
				
			}
			}
	    	
		}while(opt<=1 );
		
		
	}

   
  
   
  

}
/*for (Grupo grupo : Grupos) {
			
			System.out.println("Grupo " +  grupo.getEquipo1().getGrupo() + " Nombre " + grupo.getEquipo1().getNombre());
		}*/