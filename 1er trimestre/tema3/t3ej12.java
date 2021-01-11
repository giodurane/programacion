/*
 * t3ej12.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 12
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 *
 */

import java.util.Scanner;
public class t3ej12 {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);

  System.out.print("Introduce la nota de tu primer examen: ");
  double primerEx = s.nextDouble();

  System.out.print("¿Qué nota deseas sacar en la asignatura?: ");

  double notaAsignatura = s.nextDouble();
  double primeraNota = .4;
  double segundaNota = .6;
  double media = primerEx * primeraNota + notaAsignatura * segundaNota;

  System.out.print("Para alcanzar tu objetivo, necesitas sacar en el segundo examen un: " + media);
	}
}

