/*
 * t4ej3.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 3
 * Escribe un programa en que dado un número del 1 a 7 escriba el
 * correspondiente nombre del día de la semana.
 */

import java.util.Scanner;
public class t4ej3 {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  int ndia;
  System.out.print("Deme un número entre 1 - 7 y le diré a qué día de la semana corresponde: ");
  ndia = s.nextInt();

    switch(ndia){
    case 1:
      System.out.println("es lunes");
      break;
    case 2:
      System.out.println("es martes");
      break;
    case 3:
      System.out.println("es miercoles");
      break;
    case 4:
    System.out.println("es jueves");
      break;
    case 5:
    System.out.println("es viernes");
      break;
    case 6:
    System.out.println("es sábado");
      break;
    case 7:
    System.out.println("es domingo");
      break;
    default:
    System.out.println("Ha introducido un dato erróneo");
    }
	}
}

