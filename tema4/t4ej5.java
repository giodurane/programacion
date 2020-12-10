/*
 * t4ej5.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 5
 * Realiza un programa que resuelva una ecuación de primer grado
 * (del tipo: ax+b =0).
 *
 */

import java.util.Scanner;
public class t4ej5 {
	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  double valorA;
  double valorB;
  System.out.println("Vamos a resolver tus ecuaciones del tipo ax+b.");
  System.out.print("Introduzca el valor de a: ");
  valorA = s.nextInt();
  System.out.print("Introduzca el valor de b: ");
  valorB = s.nextInt();

  System.out.print("Valores: "+valorA+" sd "+valorB);

  if (valorA == 0) {
    System.out.println("No hay solución real");
    } else {
        System.out.println("x= "+(-valorB/valorA));
      }


	}
}

