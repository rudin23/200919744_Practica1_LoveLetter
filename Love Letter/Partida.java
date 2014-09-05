import java.util.Scanner;
import java.util.Random;

public class Partida{
      String nomUsuario = null;
	  String nomRival = null;
	  int tokens = 1;//Es el número de tokens que tiene que ganar una persona para ganar
	  int tokensU = 0;//Es el número de tokes inicial del usuario
	  int tokensR = 0;//Es el número de tokes inicial de la Pc
	  int mazo[] = new int[16]; //Crea el mazo con 16 cartas. no esta lleno
	  
   public void juego(){
      Scanner lectura = new Scanner(System.in);
	  Random aleatorio = new Random();//crea un objeto de tipo random para, para los número aleatorios
	  Mensaje mensaje = new Mensaje();
	  Cartas carta = new Cartas();
	  int decicion = 0; //Esta variable es la que decide que jugador va primero
	  
	  	  
	  //Pide datos del Usuario y Pc y envia un mensaje de bienvenida
	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("Por Favor Ingrese su Nombre: ");
	  nomUsuario = lectura.nextLine();
	  System.out.println("\nIngrese el nombre de su Rival: ");
	  nomRival = lectura.nextLine();
	  mensaje.bienvenidaUsuario(nomUsuario);
	  
	     
	  
	  //do{
	     //baraja las cartas en forma aleatoria
		 carta.barajar();
		 
		 decicion = 1 + aleatorio.nextInt(2);// Signa un 1 o 2 en forma aleatoria para decidir el turno
	     int player1 = 1; //esta es la variable para usuario, por default el usuario va primero
		 int player2 = 2;// esta es la variable para PC, por default la PC ve en segundo
		 int aux = 0;// esta variable sirve para intercambiar el valor de player1 y player2
		 
		 
		 //Muestra las cartas removidas y el usuario que comienza. 
	     if(decicion == 1){
	        mensaje.cartasRemovidas(carta.nombreCarta(carta.devolverMazo(0)), 
			                        carta.nombreCarta(carta.devolverMazo(1)),
	                                carta.nombreCarta(carta.devolverMazo(2)), getNomUsuario(), decicion);
		    player1 = 1;
		    player2 = 2;
	     }else{
	        mensaje.cartasRemovidas(carta.nombreCarta(carta.devolverMazo(0)), 
			                        carta.nombreCarta(carta.devolverMazo(1)),
	                                carta.nombreCarta(carta.devolverMazo(2)), getNomRival(), decicion);
		    player1 = 2;
		    player2 = 1;
	     }//Fin del condicional if else de elección
	  
	     //For para los turnos
	     for(int i = 3; i < 16; i++ ){
	    
		   if (player1 == 1){
		      System.out.println("El Usuario tiene ");
		      System.out.println(carta.nombreCarta(carta.devolverMazo(i)));
		   }else{
		      System.out.println("El cpU tiene este turno");
		      System.out.println(carta.nombreCarta(carta.devolverMazo(i)));
		   }//if para alternar a los juegadores
		   aux = player1;//variables para 
		   player1 = player2;//cambiar
		   player2 = aux;//los valores de cada jugador 
	     }//Fin del for para turnos
	  
	     System.out.println("El número de tokens es: ");
	     System.out.println(getTokens());
		 
	  //}while((tokensU < tokens) && (tokensR < tokens));
	  
   }//Fin del método juego
   
   public void setMazo(int posicion, int valor){
      mazo[posicion] = valor;
   }//Fin del metodo setMazo
   
   public int getMazo(int posicion){
     return mazo[posicion];
   }//Fin del método getMazo
   
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
   
   public void setTokens(int numTokens){
   tokens = numTokens;
   }//Fin del método establecer setTokensU
   
   public int getTokens(){
      return tokens;
   }//Fin del método obtener getTokensR

	  
}//Fin de la clase Partida