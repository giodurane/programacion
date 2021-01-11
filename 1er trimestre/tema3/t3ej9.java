/*
 * t3ej9.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 9
 * Escribe un programa que calcule el volumen de un cono según la fórmula:
 * V = (1/3) * π * r^2 * h
 *
 */

import java.util.Scanner;
public class t3ej9 {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  final double PI = 3.1416;
  System.out.println("Vamos a calcular el volumen de un cono.");
  System.out.print("Introduzca la altura (cm): ");
  double h = s.nextDouble();

  System.out.print("Introduzca el radio (cm): ");
  double r = s.nextDouble();

  double v = (1.0/3.0) * PI * r * r * h;

  System.out.println("El volumen de su cono es de: " + v + "cm3");
	}
}

