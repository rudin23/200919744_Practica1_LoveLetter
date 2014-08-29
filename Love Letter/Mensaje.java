import java.util.Scanner;

public class Mensaje{
  public void inicio(){
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("\t\t\t\t-= Bienvenido a Love Letter=-\n");
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
   
   public void bienvenida(String nomUsuario){
      Scanner lectura = new Scanner(System.in);
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	  System.out.println("\t\t\t===================================");
	  System.out.println("\t\t\t||                                ||");
	  System.out.println("\t\t\t||      Bienvenido: " + nomUsuario + "        ||");
	  System.out.println("\t\t\t||                                ||");
	  System.out.println("\t\t\t===================================");
	  System.out.println("\t\t\tSus cartas se estan barajeando...");
	  System.out.println("\n\n\n\n\n\n\n");
	  System.out.print("Presino ENTER PARA CONTINUAR:_");
	  lectura.nextLine();
   }//Fin del método bienvenida
}//Fin de la clase 