/*
 * Bridge.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 */


public class Bridge {

	public static void main (String[] args) {
  int longitud;
  do{
    System.out.print("Introduzca la longitud total del puente (un número mayor que 6): ");
    longitud = Integer.parseInt(System.console().redLine();
    if(longitud<=6){
      System.out.println("El dato introducido es incorrecto.");
      }
    }while (longitud<=6);

    System.out.println();
    //peña viendo el paisaje
    System.out.print(" ");

    //tablero
    System.out.print("     ");
    for (int i=0; i<(longitud-4); i++){
      System.out.print("*");
      }
    System.out.print();

    //subida-bajada intermedia
    System.out.println("  *")
    for (int i=0; i<(longitud-4); i++){
      System.out.print(" ");
      }
    System.out.print("*");

    //subida y bajada base


	}
}

