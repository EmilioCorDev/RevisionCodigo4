package com.generation;

import java.util.Scanner; //Faltaba importar el scanner

public class Codigo4 {
	public static void main(String[]args) { //Creando el metodo main dentro se pone el código
	Scanner s = new Scanner(System.in); //se agrega System.in para la entrada del scanner	
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //se modificó el mensaje para el turno del jugador 2
   /* "Scanner s2 = new Scanner();" Scanner extra ya se tenia un scanner anteriormente */
    String j2 = s.nextLine();

    if(j1.equals(j2)) { //la comparacion de cadenas se hace con metodo equals 
      System.out.println("Empate");
    }else{
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals ("tijeras")) { //siguiente comparacion de cadenas con metodo equals 
            g = 1;
          }
          break; // cada case del switch debe terminar mediante un break
        case "papel":
          if (j2.equals("piedra")) { //nuevamente comparacion de cadenas con metodo equals 
            g = 1;
          }// Agregué una llave que faltaba 
          break; // cada case del switch debe terminar mediante un break
        case "tijeras": //se agregó el case para tijeras
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default: // faltaba el default del switch
        	System.out.println("La opcion elegida no es valida!");
        	
        	return; 
      }
      
      System.out.println("Gana el jugador " + g);
    }
    s.close(); //Cerrando el scanner con nombre s 
    }
}