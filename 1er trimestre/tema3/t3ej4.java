/*
 * t3ej4.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 *  Ejercicio 4
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 *
 *
 */

import java.util.Scanner;
public class t3ej4 {

	public static void main (String[] args) {
  Scanner s = new Scanner (System.in);
  System.out.print("Introduzca dos números que a continuación operaremos con ellos: ");
  double num1 = s.nextDouble();
  double num2 = s.nextDouble();
  double suma = num1 + num2;
  double rest = num1 - num2;
  double mult = num1 * num2;
  double divi = num1 / num2;

  System.out.println("aquí sumamos " + suma);
  System.out.println("aquí restamos " + rest);
  System.out.println("aquí multiplicamos " + mult);
  System.out.println("aquí dividimos " + divi);
  System.out.println("gracias por participar, fin.");
	}
}

