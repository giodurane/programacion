/*
 * t4ej5.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 6
 * Realiza un programa que calcule el tiempo que tardará en caer un
 * objeto desde una altura h. Aplica siendo g = 9.81m/s2
 */

import java.util.Scanner;
public class t4ej6 {

	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
  int altura = 0;
   System.out.print("Hola, vamos a calcular el tiempo que tarda un objeto en caer desde una altura dada por el usuario. \nIntroduzca la altura: ");
  altura = s.nextInt();

  System.out.print("Tu dato: "+altura);


	}
}

