
public class LoveLetter{
   public static void main(String args[]){
      int opcion = 0;
	  Menu menu = new Menu();
	  Partida partida = new Partida();
	  opcion = menu.menuInicio();
	  
	  switch (opcion){
	     case 0:
		    System.out.println("No eligio ninguna opción");
			break;
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
	  
   }//Fin del metodo principal (main)
}//Fin de la clase Love Letter