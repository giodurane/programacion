/*
 * t3ej5.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 5
 * Escribe un programa que calcule el área de un rectángulo.
 *
 *
 */

import java.util.Scanner;
public class t3ej5 {

	public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Calcularemos el área de un rectángulo. Por favor introduzca las medias a continuación:");

    System.out.println("introduzca la altura");
    double num1 = s.nextDouble();

    System.out.println("introduzca la anchura");
    double num2 = s.nextDouble();
    double oper = num1 * num2;

    System.out.println("El área de su rectángulo es: " + oper + "m2. Hasta pronto");
	}
}

