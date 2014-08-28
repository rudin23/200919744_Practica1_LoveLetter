
public class LoveLetter{
   public static void main(String args[]){
      Menu menu = new Menu();
	  int opcion = 0;
	  opcion = menu.menuInicio();
	  
	  switch (opcion){
	     case 0:
		    System.out.println("No eligio ninguna opción");
			break;
		 case 1:
		    System.out.println("Eligio la opción 1");
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