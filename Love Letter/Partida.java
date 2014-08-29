import java.util.Scanner;

public class Partida{
      String nomUsuario = null;
	  String nomRival = null;
	  int tokensU = 0;
	  int tokensR = 0;
	  
   public void juego(){
      Scanner lectura = new Scanner(System.in);
	  Mensaje mensaje = new Mensaje();
	  	  
	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("Por Favor Ingrese su Nombre: ");
	     nomUsuario = lectura.nextLine();
	     System.out.println("\nIngrese el nombre de su Rival: ");
	     nomRival = lectura.nextLine();
		 
		 mensaje.bienvenida(nomUsuario);
   }//Fin del método juego
   
   public void setNomUsuario(String nombre){
      nomUsuario = nombre;
   }//Fin del método establecer setNomUsuario
   
   public String getNomUsuario(){
      return nomUsuario;
   }//Fin del método obtener getNomUsuario
   
   public void setNomRival(String nombre){
     nomRival = nombre;
   }//Fin del método establecer setNomRival
   
   public String getNomRival(){
      return nomRival;
   }//Fin del método obtener getNomRival
   
   public void setTokensU(int numTokens){
   tokensU = numTokens;
   }//Fin del método establecer setTokensU
   
   public int getTokensU(){
      return tokensU;
   }//Fin del método obtener getTokensR
   
   public void setTokensR(int numTokens){
      tokensR = numTokens;
   }//Fin del método establecer setTokensR
   
   public int getTokensR(){
     return tokensR; 
   }//Fin del método obtener getTokensR
	  
}//Fin de la clase Partida