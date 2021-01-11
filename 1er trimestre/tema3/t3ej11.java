/*
 * t3ej11.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 11
 * Realiza un conversor de Kb a Mb.
 *
 *
 *
 */

import java.util.Scanner;
public class t3ej11 {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Vamos a convertir sus Kb en Mb.");
  System.out.print("Introduzca Kb: ");
  int kb = s.nextInt();
  int cv = kb/1024;

  System.out.println("Sus " + kb + " Kb equivalen a " + cv + "Mb");
	}
}

