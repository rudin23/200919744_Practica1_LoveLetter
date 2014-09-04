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
	  System.out.println("(3) Mostrar las Reglas del Juego");
	  System.out.println("(4) Salir");
	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   }//Fin del metodo inicio
      
   public void juegoUsuario(String usuario, String rival, int tokensU, int tokensR){
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	  System.out.print("\"" + usuario + "\"" + ": " + " #Tokens: " + tokensU);
	  System.out.print("\t\t\t\t\t\"" + rival + "\"" + ": " + " #Tokens: " + tokensR);
	  System.out.println("\nTienes en tu mano: " + "NombreCarta#1, " + "NombreCarta#2");
	  System.out.println("(1) Usar Carta #1");
	  System.out.println("(2) Usar Carta #2");
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
   
   public void cartasRemovidas(String carta1, String carta2, String carta3, String nombre){
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	   System.out.println("LAS CARTAS QUE SE REMUEVEN SON: ");
	   System.out.println("\t" + carta1);
	   System.out.println("\t" + carta2);
	   System.out.println("\t" + carta3);
	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	   System.out.println("\t\t\t\t\t" + nombre + " tu comienzas el juego...");
	   System.out.println("\t\t\t\t\t\t\t Presiona ENTER_");
	   lectura.nextLine();
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
}//Fin de la clase 