/*
 * sentenciaIf.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 *
 * La sentencia if permite la ejecución de una serie de instrucciones
 * en función del resultado de una expresión lógica. El resultado de
 * evaluar una expresión lógica es siempre verdadero (true) o falso
 * formato de la condición:
 * if (condición){
 *    instrucción a ejecutar si la condición es verdadera
 * } else {
 *    instrucción a ejecutar si la condición es falsa
 * }
 */

import java.util.Scanner;
public class sentenciaIf {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Introduce la palabra 'naranja'");
  String miFruta = s.nextLine();
  

  if ("naranja".equals(miFruta)){
    System.out.println("las palabras son iguales");
    } else {
      System.out.println("las palabras son distintas, intenta nuevamente.");
      }
	}
}

