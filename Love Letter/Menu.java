import java.util.Scanner;
//Esta clase menu trabajara mucho con la clase Mensaje por eso se 
//creara un objeto llamado mensajes

public class Menu{
   int ingreso = 0; //Recibe el valor de entrada para evaluar en el menu
   Mensaje mensajes = new Mensaje();//Crea un objeto para usar la clase Mensaje
   Scanner lectura = new Scanner(System.in);//lee el valor de entrada desde el teclado
   Partida partida = new Partida();//Utiliza los metodoso de la clase partida
   
   public void menuInicio(){
	  mensajes.menuInicio();//Llama al metodo que imprime el menu inicio
	  ingreso = lectura.nextInt();//resibe el valor del teclado para evaluarlo
	  
	  //Verifica la opción que desea ejecutar el Usuario
	   switch (ingreso){
		 case 1:
		    partida.juego();
			break;
		 case 2:
		    System.out.println("Eligio la opción 2");
			break;
		 case 3:
		    System.out.println("Eligio la opción 3");
			break;
		 case 4:
		    System.out.println("Eligio la opción 4");
			break;	
	  }//Fin del condicional switch
   }//Fin del metodo de prueba
}//FIn de la clase Menu