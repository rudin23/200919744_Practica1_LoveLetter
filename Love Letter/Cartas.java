import java.util.Random;

public class Cartas{
   Partida partida = new Partida();
   
   public void barajar(){
       Random aleatorio = new Random();//crea un objeto de tipo random para, para los número aleatorios
	   //Partida partida = new Partida();//Crea un objeto partida para cambiar el valor de las cartas
	   boolean aprobado; //variable para verificar que no se repiten numeros en el mazo
	   
      //Rebuelve las 16 cartas asignando los números en forma aleatoria
	     for(int i = 0; i < 16; i++){
	        do{
		       aprobado = true;
			   int a = 1 + aleatorio.nextInt(16); //asigna un numero del 1 al 16 a la variale a
		       for(int j = i; j > -1; j--){
		          if(partida.getMazo(j) == a)//Verifica que el numero no este repetido
			      aprobado = false;
		       }//Fin del for anidado		 
		       if(aprobado){
		          partida.setMazo(i, a); //Le asigna el numero aleatorio al vector
               }//Fin del condicional if	
            }while(!aprobado);//Fin del condicional Do-While
	     }//Fin del 1mer ciclo for
		 
   }//Fin del método barajar. que revuelve las cartas
   
   public int devolverMazo(int posicion){
      return partida.getMazo(posicion);
   }//Fin 
   //Metodo para darle nombre a las cartas
   public String nombreCarta(int indicador){
	  switch(indicador){
	    case 1:
		  return "(1) GUARD";
		case 2:
		  return "(1) GUARD";
		case 3:
		  return "(1) GUARD";
		case 4:
		  return "(1) GUARD";
		case 5:
		  return "(1) GUARD";
		case 6:
		  return "(2) PRIES";
		case 7:
		  return "(2) PRIES";
		case 8:
		  return "(3) BARON";
		case 9:
		  return "(3) BARON";
		case 10:
		  return "(4) HANDMAID";
		case 11:
		  return "(4) HANDMAID";
		case 12:
		  return "(5) PRINCE";
		case 13:
		  return "(5) PRINCE";
		case 14:
		  return "(6) KING";
		case 15:
		  return "(7) COUNTESS";
		case 16:
		  return "(8) PRINCESS";
		default: 
		  return "null";
	  }//Fin del switch
	  
   }//Fin del método nombrecarta
   
}//Fin de la clase mazo