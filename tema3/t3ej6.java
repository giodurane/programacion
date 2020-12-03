/*
 * t3ej6.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 6
 * Escribe un programa que calcule el área de un triángulo.
 *
 *
 */

import java.util.Scanner;
public class t3ej6 {

	public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Vamos a calcular el área de un triángulo.");
    System.out.println("Introduzca los valores a continuación para efectuar la operación.");
    System.out.print("Introduzca la altura del seno: ");
    double num1 = s.nextDouble();
    System.out.print("Introduzca la altura del coseno: ");
    double num2 = s.nextDouble();
    double area = (num1 * num2)/2;
    System.out.println("El valor del área del triángulo es: " + area + "m2. Gracias por participar. Fin");
	}
}

