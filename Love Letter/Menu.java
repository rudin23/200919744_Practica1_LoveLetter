import java.util.Scanner;
//Esta clase menu trabajara mucho con la clase Mensaje por eso se 
//creara un objeto llamado mensajes

public class Menu{
   int ingreso = 0; //Recibe el valor de entrada para evaluar en el menu
   Mensaje mensajes = new Mensaje();//Crea un objeto para usar la clase Mensaje
   Scanner lectura = new Scanner(System.in);//lee el valor de entrada desde el teclado
   
   public int menuInicio(){
	  mensajes.inicio();//Llama al metodo que imprime el menu inicio
	  ingreso = lectura.nextInt();//resibe el valor del teclado para evaluarlo
	  
	  //Verifica la opción que desea ejecutar el Usuario
	  switch (ingreso){
	     case 1:
		    return 1;
		 case 2:
		    return 2;
		 case 3:
		    return 3;
		 case 4:
		    return 4;
		 default:
		    return 0;
	  }//Fin del condicional switch
   }//Fin del metodo de prueba
}//FIn de la clase Menu