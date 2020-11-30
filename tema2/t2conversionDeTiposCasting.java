/*
 * t2asignacionValoresVariables.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Cuando queremos convertir una variable, o expresión en general, de
 * un tipo a otro, hay que escribir entre paréntesis el tipo que se
 * quiere obtener
 *(double) y convierte el valor de y en un double, es decir, en un número
 * con decimales y (double) x hace lo propio con x, por tanto, la operación
 * de división quedaría como 9.0 / 2.0. Al tratarse de una división entre
 * números decimales, Java entiende que el resultado debe tener también
 * decimales y usa toda la precisión disponible en el tipo.
 */


public class t2conversionDeTiposCasting {

	public static void main (String[] args) {

  int x = 10;
  int y = 144;
  double division;

  division = (double) y / (double) x;

  int suma = x + y;
  System.out.println("Vamos a ver el valor de X: "+ x);
  System.out.println("Vamos a ver el valor de X: "+ y);
  System.out.println("Vamos a sumar los valores X e Y: "+ suma);

  int mult = x * y;
  System.out.println("dividimos los valores de X e Y: "+division);
	}
}

