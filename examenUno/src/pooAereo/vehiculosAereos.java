package pooAereo;
import javax.swing.JOptionPane;

public class vehiculosAereos {
	public static void main(String[]args) {
		byte opc=0;
				do {
				opc=Byte.parseByte(JOptionPane.showInputDialog("Menu Principal\n 1) aviones\n 2) avionetas\n 3) helicoptero\n 4)salir\n elija su opcion "));
					switch(opc) {
					case 1:
						JOptionPane.showMessageDialog(null, "entrara en modo de edicion para aviones");
						byte menuAvion=0;
						do {
							menuAvion=Byte.parseByte(JOptionPane.showInputDialog("Menu Aviones\n 1) carga\n 2) pasajeros\n 3) militar\n 4) salir\n elija su opcion "));
							switch(menuAvion) {
							
							case 1:
								JOptionPane.showMessageDialog(null, "entrara en modo de edicion para aviones de carga");
								avionesCarga AvionCargaPrueba= new avionesCarga();
								  
								  System.out.println("en que pais lo quiere fabricar?");
								  AvionCargaPrueba.setPaisElab(JOptionPane.showInputDialog("Ingrese el pais donde se fabricara el avion"));
								  System.out.println(AvionCargaPrueba.getPaisElab());
								  
								  
								  System.out.println("\n con filtro UV?");
								  AvionCargaPrueba.configFUV(JOptionPane.showInputDialog("quiere filtro UV? Ingrese si o no"));
								  System.out.println(AvionCargaPrueba.getfiltroUV());
								  
								  System.out.println(AvionCargaPrueba.getInfo());

								  // editando datos para modificar el precio 
								 
								  AvionCargaPrueba.setnPasajeros (6);
								  AvionCargaPrueba.setnTripulantes (3);
								  
								  System.out.println("\ndatos modificados para prueba de precio\n");
								  System.out.println(AvionCargaPrueba.getInfo());
								  
								break;
								
							case 2: 
								JOptionPane.showMessageDialog(null, "entrara en modo de edicion para aviones de pasajeros");
								avionesPasajero AvionPasajeroPrueba= new avionesPasajero();
								  
								  System.out.println("en que pais lo quiere fabricar?");
								  AvionPasajeroPrueba.setPaisElab(JOptionPane.showInputDialog("Ingrese el pais donde se fabricara el avion"));
								  System.out.println(AvionPasajeroPrueba.getPaisElab());
								  
								  
								  System.out.println("\n con filtro UV?");
								  AvionPasajeroPrueba.configFUV(JOptionPane.showInputDialog("quiere filtro UV? Ingrese si o no"));
								  System.out.println(AvionPasajeroPrueba.getfiltroUV());
								  
								  System.out.println("\n con maletero de mano?");
								  AvionPasajeroPrueba.configFUV(JOptionPane.showInputDialog("quiere maletero de mano? Ingrese si o no"));
								  System.out.println(AvionPasajeroPrueba.getfiltroUV());
								  
								  System.out.println(AvionPasajeroPrueba.getInfo());
								  
								break;
								
							case 3: 
								JOptionPane.showMessageDialog(null, "entrara en modo de edicion para aviones militares");
								avionesMilitar AvionMilitarPrueba= new avionesMilitar();
								  
								  System.out.println("en que pais lo quiere fabricar?");
								  AvionMilitarPrueba.setPaisElab(JOptionPane.showInputDialog("Ingrese el pais donde se fabricara el avion"));
								  System.out.println(AvionMilitarPrueba.getPaisElab());
								  
								  
								  System.out.println("\n con filtro UV?");
								  AvionMilitarPrueba.configFUV(JOptionPane.showInputDialog("quiere filtro UV? Ingrese si o no"));
								  System.out.println(AvionMilitarPrueba.getfiltroUV());
								  
								  System.out.println(AvionMilitarPrueba.getInfo());
								  
								  System.out.println("\n con camuflaje?");
								  AvionMilitarPrueba.setCamuflaje(JOptionPane.showInputDialog("quiere camuflaje? Ingrese si o no"));
								  System.out.println(AvionMilitarPrueba.getCamuflaje());
								  
								  System.out.println("\n con Blindado?");
								  AvionMilitarPrueba.setBlindado(JOptionPane.showInputDialog("quiere doble blindado? Ingrese si o no"));
								  System.out.println(AvionMilitarPrueba.getBlindado());
								  
								  System.out.println(AvionMilitarPrueba.getInfo());

								
								break;
						case 4:
							menuAvion=4;
							break;
						default:
							JOptionPane.showMessageDialog(null, "no contamos con esa opcion");
							break;
							}
						}while (menuAvion!=4); 
						System.exit(0);
						
				// menu para avionetas		
					case 2:
						JOptionPane.showMessageDialog(null, "entrara en modo de edicion para avionetas");
						byte menuAvionetas=0;
						do {
							menuAvionetas=Byte.parseByte(JOptionPane.showInputDialog("Menu Avionetas\n 1) competencia\n 2) comercial\n 4) salir\n elija su opcion "));
							switch(menuAvionetas) {
							
							case 1:
								JOptionPane.showMessageDialog(null, "entrara en modo de edicion para avionetas competencia");
								avionetasCompetencia AvionetaCompetencia= new avionetasCompetencia();
								  
								  System.out.println("en que pais lo quiere fabricar?");
								  AvionetaCompetencia.setPaisElab(JOptionPane.showInputDialog("Ingrese el pais donde se fabricara el avion"));
								  System.out.println(AvionetaCompetencia.getPaisElab());
								  
								  
								  System.out.println("\n con turbo?");
								  AvionetaCompetencia.setTurbo(JOptionPane.showInputDialog("quiere turbo? Ingrese si o no"));
								  System.out.println(AvionetaCompetencia.getTurbo());
								  
								  System.out.println("\n con decoracion?");
								  AvionetaCompetencia.setDecoracion(JOptionPane.showInputDialog("quiere decoracion de patrocinio? Ingrese si o no"));
								  System.out.println(AvionetaCompetencia.getDecoracion());
								  
								  System.out.println("que color quiere?");
								  AvionetaCompetencia.setColor(JOptionPane.showInputDialog("Ingrese el color de la avioneta"));
								  System.out.println(AvionetaCompetencia.getColor());
								  
								  System.out.println("\n con doble helices?");
								  AvionetaCompetencia.setHelices(JOptionPane.showInputDialog("quiere doble helices? Ingrese si o no"));
								  System.out.println(AvionetaCompetencia.getHelices());
								  
								  System.out.println(AvionetaCompetencia.getInfo());
								  
								break;
								
							case 2: 
								JOptionPane.showMessageDialog(null, "entrara en modo de edicion para avioneta comercial");
								avionetasComercial AvionetaComercial= new avionetasComercial();
								  
								  System.out.println("en que pais lo quiere fabricar?");
								  AvionetaComercial.setPaisElab(JOptionPane.showInputDialog("Ingrese el pais donde se fabricara el avion"));
								  System.out.println(AvionetaComercial.getPaisElab());
								  
								  
								  System.out.println("\n con pancarta publicitaria?");
								 AvionetaComercial.setPancarta(JOptionPane.showInputDialog("quiere pancarta publicitaria? Ingrese si o no"));
								  System.out.println(AvionetaComercial.getPancarta());
  
								  System.out.println("\n con decoracion?");
								  AvionetaComercial.setDecoracion(JOptionPane.showInputDialog("quiere decoracion de patrocinio? Ingrese si o no"));
								  System.out.println(AvionetaComercial.getDecoracion());
								  
								  System.out.println("que color quiere?");
								  AvionetaComercial.setColor(JOptionPane.showInputDialog("Ingrese el color de la avioneta:"));
								  System.out.println(AvionetaComercial.getColor());
								  
								  System.out.println("\n con doble helices?");
								  AvionetaComercial.setHelices(JOptionPane.showInputDialog("quiere doble helices? Ingrese si o no"));
								  System.out.println(AvionetaComercial.getHelices());
								  
								  System.out.println(AvionetaComercial.getInfo());

								break;

						case 4:
							menuAvionetas=4;
							break;
						default:
							JOptionPane.showMessageDialog(null, "no contamos con esa opcion");
							break;
							}
						}while (menuAvionetas!=4); 
						System.exit(0);
						break;
						
				// menu para helicopteros
					case 3:
						JOptionPane.showMessageDialog(null, "entrara en modo de edicion para helicopteros");
						byte menuHelicopteros=0;
						do {
							menuHelicopteros=Byte.parseByte(JOptionPane.showInputDialog("Menu Helicopteros\n 1) combate\n 2) civil\n 4) salir\n elija su opcion "));
							switch(menuHelicopteros) {
							
							case 1:
								JOptionPane.showMessageDialog(null, "entrara en modo de edicion para helicoptero de combate");
								helicopterosCombate helicopteroCombate= new helicopterosCombate();
								  
								  System.out.println("en que pais lo quiere fabricar?");
								  helicopteroCombate.setPaisElab(JOptionPane.showInputDialog("Ingrese el pais donde se fabricara el helicoptero"));
								  System.out.println(helicopteroCombate.getPaisElab());
								  
								  
								  System.out.println("\n con estabilizador?");
								  helicopteroCombate.setEstabilizador(JOptionPane.showInputDialog("quiere estabilizador? Ingrese si o no"));
								  System.out.println(helicopteroCombate.getEstabilizador());
								  
								  System.out.println("\n con camuflaje?");
								  helicopteroCombate.setCamuflaje(JOptionPane.showInputDialog("quiere camuflaje? Ingrese si o no"));
								  System.out.println(helicopteroCombate.getCamuflaje());
								  
								  System.out.println("que color quiere?");
								  helicopteroCombate.setColor(JOptionPane.showInputDialog("Ingrese el color del helicoptero es"));
								  System.out.println(helicopteroCombate.getColor());
								  
								  System.out.println("\n con Blindado?");
								  helicopteroCombate.setBlindado(JOptionPane.showInputDialog("quiere doble blindado? Ingrese si o no"));
								  System.out.println(helicopteroCombate.getBlindado());
								  
								  System.out.println(helicopteroCombate.getInfo());
								  
								break;
								
							case 2: 
								JOptionPane.showMessageDialog(null, "entrara en modo de edicion para helicoptero civil");
								helicopterosCivil helicopteroCivil= new helicopterosCivil();
								  
								  System.out.println("en que pais lo quiere fabricar?");
								  helicopteroCivil.setPaisElab(JOptionPane.showInputDialog("Ingrese el pais donde se fabricara el helicoptero"));
								  System.out.println(helicopteroCivil.getPaisElab());
								  
								  System.out.println("\n con decoracion?");
								  helicopteroCivil.setDecoracion(JOptionPane.showInputDialog("quiere decoracion de patrocinio? Ingrese si o no"));
								  System.out.println(helicopteroCivil.getDecoracion());
								  
								  System.out.println("\n con estabilizador?");
								  helicopteroCivil.setEstabilizador(JOptionPane.showInputDialog("quiere estabilizador? Ingrese si o no"));
								  System.out.println(helicopteroCivil.getEstabilizador());
								 
								  System.out.println("que color quiere?");
								  helicopteroCivil.setColor(JOptionPane.showInputDialog("Ingrese el color del helicoptero es"));
								  System.out.println(helicopteroCivil.getColor());
								  
								  System.out.println("\n con doble helices?");
								  helicopteroCivil.setHelices(JOptionPane.showInputDialog("quiere doble helices? Ingrese si o no"));
								  System.out.println(helicopteroCivil.getHelices());
								  
								  System.out.println(helicopteroCivil.getInfo());
								  
								break;

						case 4:
							menuHelicopteros=4;
							break;
						default:
							JOptionPane.showMessageDialog(null, "no contamos con esa opcion");
							break;
							}
						}while (menuHelicopteros!=4); 
						System.exit(0);
						break;
				
					case 4:
						opc=4;
						break;
					default:
						JOptionPane.showMessageDialog(null, "no contamos con esa opcion");
						break;
					}
				}while (opc!=4);
				System.exit(0);
	}

}
