/*
 * sentenciaIf.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 *
 * La sentencia if permite la ejecución de una serie de instrucciones
 * en función del resultado de una expresión lógica. El resultado de
 * evaluar una expresión lógica es siempre verdadero (true) o falso
 * (false). Es muy simple, en lenguaje natural sería algo como ”si
 * esta condición es verdadera entonces haz esto, sino haz esto otro”.
 *
 * formato de la condición:
 * if (condición){
 *    instrucción a ejecutar si la condición es verdadera
 * } else {
 *    instrucción a ejecutar si la condición es falsa
 * }
 */


public class sentenciaIf {

	public static void main (String[] args) {
  String miFruta = "naranja";

  if ("naranja".equals(miFruta)){
    System.out.println("iguales");
    } else {
      System.out.println("distintas");
      }
	}
}

