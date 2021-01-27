/*
 * t4ej1.java
 *
 *
 */

import java.util.Scanner;
public class t4ej1 {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  String dia;

  System.out.print("Eliga un día de la semana para saber qué tiene a primera hora: ");
  dia = s.nextLine();
  dia.toLowerCase(); //convierte el texto introducido a minúsculas.

    switch(dia){
      case "lunes":
      System.out.println("el "+dia+" tiene programacion");
        break;
      case "martes":
      System.out.println("BBDD");
        break;
      case "miercoles":
      System.out.println("SiINF");
        break;
      case "jueves":
      System.out.println("FOL");
        break;
      case "viernes":
      System.out.println("programacion2");
        break;

      default:
      System.out.println("Ese día no hay clase");
    }

	}
}

