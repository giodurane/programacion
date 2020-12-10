/*
 * t4ej4.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 4
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 *
 * el ejercicio en cuestión es el t3ej8
 */


import java.util.Scanner;
public class t4ej4 {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Vamos a calcular el salario semanal de un empleado ");

  System.out.print("Introduzca el número de horas trabajadas esta semana: ");
  int horasTrb = s.nextInt();

  int precionormal = 12;
  int precioplus = 16;

  int hsExtra = horasTrb - 40;
  int cobroNormal = horasTrb * precionormal;
  int cobroExtra = (horasTrb - 40) * precioplus;
  int cobroOrdinario = 40 * 12;
  int cobrototal = cobroOrdinario + (hsExtra*precioplus);

  if (horasTrb <= 40){
    System.out.println("Usted suma un total de " + horasTrb + " horas trabajadas esta semana. Le corresponden " + cobroNormal + " Euros.-");
  } else{
      System.out.println("Usted suma un total de " + horasTrb + " horas trabajadas esta semana. Le corresponden " + cobroOrdinario + " Euros.- por su trabajo ordinario.");
      System.out.println("Horas extra total: "+hsExtra+" hora/s, le corresponden "+cobroExtra+"€.- Esta semana cobrará usted"+cobrototal+"€ bruto");
    }
	}
}

