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
	  String enter;
	  
	  //Verifica la opción que desea ejecutar el Usuario
	   switch (ingreso){
		 case 1:
		    partida.juego();
			break;
		 case 2:
			mensajes.mensajeTokens();
			ingreso = lectura.nextInt();
			partida.setTokens(ingreso);
			System.out.printf("El numero de tokens es a jugar es: %d",
			                      partida.getTokens());
			enter = lectura.nextLine();
			enter = lectura.nextLine();
			mensajes.tituloMenu();
			menuInicio();
			break;
		 case 3:
		    mensajes.introduccion();
			enter = lectura.nextLine();
			enter = lectura.nextLine();
			mensajes.tituloMenu();
			menuInicio();
			break;
		 case 4:
			menuRuler();//LLama al metodo para las reglas que esta en esta misma clase
			break;
         case 5:
            mensajes.salida();
            break;
         default:
            System.out.println("\n\n\n\n");
			menuInicio();		 
	  }//Fin del condicional switch
	  
   }//Fin del método menuInicio
   
   public void menuRuler(){
	      mensajes.menuReglas();
		  ingreso = lectura.nextInt();//resibe el valor del teclado para evaluarlo
	      String enter;
		  
		  //Verifica la opción que desea ejecutar el Usuario
	   switch (ingreso){
		 case 1:
		    mensajes.objetivo();
			enter = lectura.nextLine();
			enter = lectura.nextLine();
			menuRuler();
			break;
		 case 2:
			mensajes.preparacionPartida();
			enter = lectura.nextLine();
			enter = lectura.nextLine();
			menuRuler();
			break;
		 case 3:
		    mensajes.comoJugar();
			enter = lectura.nextLine();
			enter = lectura.nextLine();
			menuRuler();
			break;
		 case 4:
		    mensajes.desarrollo();
			enter = lectura.nextLine();
			enter = lectura.nextLine();
			menuRuler();
			break;
         case 5:
            mensajes.finalRonda();
			enter = lectura.nextLine();
			enter = lectura.nextLine();
			menuRuler();
            break;
		 case 6:
            mensajes.personajes();
			enter = lectura.nextLine();
			enter = lectura.nextLine();
			menuRuler();
            break;
		 case 7:
            mensajes.tituloMenu();
			menuInicio();
            break;
         default:
            System.out.println("\n\n\n\n");
			menuRuler();		 
	  }//Fin del condicional switch
		  
	  }//Fin del metodo menuRuler
   
}//FIn de la clase Menu