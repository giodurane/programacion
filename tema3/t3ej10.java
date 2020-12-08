/*
 * t3ej10.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 10
 * Realiza un conversor de Mb a Kb.
 *
 */

import java.util.Scanner;
public class t3ej10 {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Conversor de Mb a Kb");
  System.out.print("Introduzca el número de Mb a convertir: ");
  int mb = s.nextInt();
  int conversor = mb * 1024;

  System.out.println("Sus "+ mb + " Mb en Kb equivalen a: " + conversor + " Kb");
	}
}

