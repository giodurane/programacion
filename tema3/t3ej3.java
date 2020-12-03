/*
 * t3ej3.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 3
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado. *
 *
 */

import java.util.Scanner;
public class t3ej3 {

	public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.print("Bienvenido al conversor inverso. Vamos a transformar de pesetas a EUR. Por favor, introduzca la cantidad a convertir: ");
    double num1 = s.nextDouble();
    double conversor = num1/166.68;

    System.out.println("Ha introducido " + num1 + "pesetas. Equivalen a " + conversor + "EUR. Gracias por participar");
	}
}

