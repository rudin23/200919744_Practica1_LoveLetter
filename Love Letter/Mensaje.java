import java.util.Scanner;

public class Mensaje{
   
   Scanner lectura = new Scanner(System.in);
   
  public void tituloBienvenida(){
     System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	 System.out.println("\t\t\t\t-= Bienvenido a Love Letter=-\n");
  }//Fin del método bienvenida
  
  public void tituloMenu(){
     System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	 System.out.println("\t\t\t\t-= MENÚ PRINCIPAL =-\n");
  }//Fin del método tituloMenu
  
  public void menuInicio(){
      System.out.println("(1) Jugar Una Partida");
	  System.out.println("(2) Seleccionar el Número de Tokens a Juagar");
	  System.out.println("(3) Introduccion");
	  System.out.println("(4) Mostrar las Reglas del Juego");
	  System.out.println("(5) Salir");
	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   }//Fin del metodo inicio
   
   public void menuReglas(){
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("\t\t\t\t-= REGLAS PRINCIPALES =-\n");
	  System.out.println("(1) Objetivo");
	  System.out.println("(2) Preparacion de la Partida");
	  System.out.println("(3) Como Jugar");
	  System.out.println("(4) Desarrollo del Juego");
	  System.out.println("(5) Final de la Ronda");
	  System.out.println("(6) Personajes");
	  System.out.println("(7) Salir");
	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   }//Fin del método menuReglas
      
   public void juegoUsuario(String usuario, String rival, int tokensU, int tokensR,
                            String carta1, String carta2){
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	  System.out.print("\"" + usuario + "\"" + ": " + " #Tokens: " + tokensU);
	  System.out.print("\t\t\t\t\t\"" + rival + "\"" + ": " + " #Tokens: " + tokensR);
	  System.out.println("\nTienes en tu mano: " + carta1 + " y" + carta2);
	  System.out.println("(1) Usar: " Carta1);
	  System.out.println("(2) Usar: " Carta2);
	  System.out.println("(3) Terminar juego");
	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   }//Fil del metodo juego1
   
   public void bienvenidaUsuario(String nomUsuario){
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("\t\t\t===================================");
	  System.out.println("\t\t\t||                                ||");
	  System.out.printf("\t\t\t||      Bienvenido: %-14s||", nomUsuario);
	  System.out.println("\n\t\t\t||                                ||");
	  System.out.println("\t\t\t===================================");
	  System.out.println("\t\t\tSus cartas se estan barajeando...");
	  System.out.println("\n\n\n\n\n\n\n");
	  System.out.print("Presino ENTER PARA INICIAR:_");
	  lectura.nextLine();
   }//Fin del método bienvenida
   
   public void cartasRemovidas(String carta1, String carta2, String carta3, String nombre, 
                                     int turno){
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	   System.out.println("LAS CARTAS QUE SE REMUEVEN SON: ");
	   System.out.println("\t" + carta1);
	   System.out.println("\t" + carta2);
	   System.out.println("\t" + carta3);
	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	   if(turno == 1){
	      System.out.println("\t\t\t\t\t" + nombre + " tu comienzas el juego...");
	      System.out.println("\t\t\t\t\t\t\t Presiona ENTER_");
	      lectura.nextLine();
	   }else{
	      System.out.println("\t\t\t\t\t" + "Tu rival " + nombre + " comienza el juego...");
	      System.out.println("\t\t\t\t\t\t\t Presiona ENTER_");
	      lectura.nextLine();
	   }
   }//Fin del método cartasRemovidas
   
   public void mensajeTokens(){
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	  System.out.printf("%-15s --TOKENS--\n","");
	  System.out.println("Elija el número de tokens que desea jugar");
	  System.out.println("Es posible juagar hasta un máximo de 3 tokens");
	  System.out.println("\n(1) Para 1 Token");
	  System.out.println("(3) Para 3 Tokens");
	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   }//Fin del método mensajeTokens
   
   public void introduccion(){
     System.out.println("\t\t\t\tLOVE LETTER\n");
	 System.out.println("La guardia echo una mirada de arriba a abajo a Bartolemew Kaiss y fruncio el" + 
	                    "\ncenio.\"Lo siento maestro Kaiss, pero la princesa no recibe visitas. Como puede" + 
						"\nimaginar se encuentra desconsolada por el arresto de su madre.\"");
	 System.out.println("\n\"Por supuesto,\" dijo el joven compositor asintiendo y con gesto comprensivo. " + 
	                    "\n\"Pero no estoy solo de visita, vera: Su alteza ha requerido mis servicios, vamos" +
						"a practicar canto.\"");
	 System.out.println("\n\"La princesa ya tiene un maestro de canto,\" respondio la mujer bruscamente \narqueando una ceja.");
	 System.out.println("\n\"Estoy segura de que el ya lo sabe, Odette,\" dijo una voz gentil que resono" + 
	                    "\ndesde la estancia que conectaba la residencia al palacio. Ambos se giraron " + 
						"\npara ver a Susannah, una de las doncellas de la princesa Annete quien caminaba" + 
						"\nhacia ellos. \"Lo que el buen compositor quiere decir es que Annete ha" + 
						"\nsolicitado sus obras para ensayar.\" La joven mujer sonrio a la guardia" + 
						"\nmientras le guiniaba el ojo a Bartolemew de una manera complice. De su cartera," + 
						"\nBartolemew saco un tubo cerrado. \"Si fueras tan amable de entregar estas " + 
						"\npartituras, mi querida Susannah,\" dijo con una sonrisa y asentimiento.");
	 System.out.println("\n\"Me encargare de que lleguen a mi lady,\" dijo mientras posaba su mano en el" + 
	                    "\nbrazo de Batolemew. \"Estoy segura de que arde en deseos de ver su contenido.\"");
   }//Fin del metodo introduccion
   
   public void objetivo(){
      System.out.println("\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("\t\t\t-Objetivo del Juego-");
   }//Fin del método objetivo
   
   public void preparacionPartida(){
      System.out.println("\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("\t\t-Reglas Para la Preparacion de Una Partida-");
   }//Fin del metodo preparacionPartida
   
   public void comoJugar(){
      System.out.println("\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("\t\t\t-Relas Para Jugar-");
   }//Fin del metodo comoJugar
   
   public void desarrollo(){
      System.out.println("\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("\t\t\t-Desarrollo del Juego-");
   }//Fin del método desarrollo
   
   public void finalRonda(){
      System.out.println("\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("\t\t\t-Cuando Termina Una Ronda-");
   }//Fin del metodo finalRonda
   
   public void personajes(){
      System.out.println("\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("\t\t\t-Personajes-");  
   }//Fin del metodo personajes
   
   public void salida(){
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("\t\t\t===================================");
	  System.out.println("\t\t\t||                                ||");
	  System.out.printf("\t\t\t||          HASTA PRONTO!         ||");
	  System.out.println("\n\t\t\t||                                ||");
	  System.out.println("\t\t\t===================================");
	  System.out.println("\n\n\n\n\n\n\n\n\n");

   }//Fin del método salida
}//Fin de la clase 