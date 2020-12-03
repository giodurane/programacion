/*
 * t3ej2.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 2
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 *
 *
 */

import java.util.Scanner;
public class t3ej2 {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);

  System.out.print("Bienvenido al convesor DAW. Introduzca una cantidad en EUR y esta será convertida a pesetas ");

  double num1 = s.nextDouble();
  double opera = (num1 * 166.38);

  System.out.println("Ha introducido " + num1 + " euros. En pesetas son: " + opera + " pesetas");
	}
}

