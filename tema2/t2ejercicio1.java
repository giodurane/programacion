/*
 * t2asignacionValoresVariables.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 1
 * Escribe un programa en el que se declaren las variables enteras x e y.
 * Asígnales los valores 144 y 999 respectivamente. A continuación, muestra
 * por pantalla el valor de cada variable, la suma, la resta, la división
 * y la multiplicación.

 */


public class t2ejercicio1 {

	public static void main (String[] args) {

  int x = 144;
  int y = 999;
  int suma = x + y;
  double division;
  int mult = x * y;
  division = (double) y / (double) x;


  System.out.println("Vamos a ver el valor de X: "+ x);
  System.out.println("Vamos a ver el valor de X: "+ y);
  System.out.println("Vamos a sumar los valores X e Y: "+ suma);


  System.out.println("dividimos los valores de X e Y: "+division);
	}
}

