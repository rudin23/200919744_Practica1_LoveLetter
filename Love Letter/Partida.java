import java.util.Scanner;
import java.util.Random;

public class Partida{
      String nomUsuario = null;
	  String nomRival = null;
	  int tokensU = 0;
	  int tokensR = 0;
	  
   public void juego(){
      Scanner lectura = new Scanner(System.in);
	  Mensaje mensaje = new Mensaje();
	  Cartas carta = new Cartas();
	  	  
	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("Por Favor Ingrese su Nombre: ");
	  nomUsuario = lectura.nextLine();
	  System.out.println("\nIngrese el nombre de su Rival: ");
	  nomRival = lectura.nextLine();
		 
	  mensaje.bienvenidaUsuario(nomUsuario);
	  
	  Random aleatorio = new Random();
	  int mazo[] = new int[16]; //Crea un arreglo, le asigna la variable.  
	  boolean aprobado;
	  
	  for(int i = 0; i < 16; i++){
	     do{
		    aprobado = true;
			int a = 1 + aleatorio.nextInt(16);
		    for(int j = i; j > -1; j--){
		       if(mazo [j] == a)
			   aprobado = false;
		    }//Fin del for anidado		 
		    if(aprobado){
		       mazo [i] = a;
            }//Fin del condicional if	
         }while(!aprobado);//Fin del condicional Do-While
	  }//Fin del 1mer ciclo for
	  
	  int decicion = 0; //Esta variable es la que decide que jugador va primero
	  decicion = 1 + aleatorio.nextInt(2);// Signa un 1 o 2
	  
	     int player1 = 1; //esta es la variable para usuario
		 int player2 = 2;// esta es la variable para PC
		 int aux = 0;// esta variable sirve para inter cambiar a y b
		 
	  //Muestra las cartas removidas y el usuario que comienza. 
	  if(decicion == 1){
	     mensaje.cartasRemovidas(carta.nombreCarta(mazo[0]), carta.nombreCarta(mazo[1]),
	                             carta.nombreCarta(mazo[2]), getNomUsuario());
		 player1 = 1;
		 player2 = 2;
	  }else{
	     mensaje.cartasRemovidas(carta.nombreCarta(mazo[0]), carta.nombreCarta(mazo[1]),
	                             carta.nombreCarta(mazo[2]), getNomRival());
		 player1 = 2;
		 player2 = 1;
	  }//Fin del condicional if else de elección
	  
	  //For para los turnos
	  for(int i = 3; i < 16; i++ ){
	    
		if (player1 == 1){
		   System.out.println("El Usuario tiene ");
		   System.out.println(carta.nombreCarta(mazo[i]));
		}else{
		   System.out.println("El cpU tiene este turno");
		   System.out.println(carta.nombreCarta(mazo[i]));
		}//if para alternar a los juegadores
		aux = player1;//variables para 
		player1 = player2;//cambiar
		player2 = aux;//los valores de cada jugador 
	  }//Fin del for para turnos
	  
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