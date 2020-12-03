/*
 * t3ej1.java.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 1
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 *
 *
 */

import java.util.Scanner;
public class t3ej1 {

	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce dos números, te los muestro y los multiplico ");
    /*int num1 = s.nextInt();
    int num2 = s.nextInt();
    int multiplico = (num1 * num2);*/
    double num1 = s.nextDouble();
    double num2 = s.nextDouble();
    double multiplico = (num1 * num2);

    System.out.println("tus numeros son el " + num1 + " y el " + num2 + " multiplicados dan: " + multiplico);
	}
}

