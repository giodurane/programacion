/*
 * t3ej8.java
 *
 * Ejercicio 8
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 *
 *
 */

import java.util.Scanner;
public class t3ej8 {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Vamos a calcular el salario semanal de un empleado ");

  System.out.print("Introduzca el número de horas trabajadas esta semana: ");
  int horasTrb = s.nextInt();
  int precio = 12;
  int semhs = horasTrb * precio;

  System.out.println("Usted suma un total de " + horasTrb + " horas trabajadas. Le corresponde una paga de " + semhs + " Euros.-");
	}
}

