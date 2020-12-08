/*
 * t4SentenciaIf02.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 *
 *
 */


public class t4SentenciaIf02 {

	public static void main (String[] args) {
  System.out.print("Por favor, introduzca un número entero: ");
  String linea = System.console().readLine();
  int x = Integer.parseInt(linea);

  if (x< 5) {
    System.out.println("El número que has introducido es menor que 5");
    } else {
      System.out.println("El número introducido es mayor que 5");
      }
	}
}

