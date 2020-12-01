/*
 * t3ej1.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 1:
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 *
 */


public class t3ej1 {

	public static void main (String[] args) {
  String linea;
  System.out.print("Por favor, introduzca un número: ");
  linea = System.console().readLine();
  int primerNumero;
  primerNumero = Integer.parseInt(linea);

  System.out.println("Por favor, introduce un segundo número: ");
  linea = System.console().readLine();
  int segNumero;
  segNumero = Integer.parseInt(linea);
  int multiplica = primerNumero * segNumero;

  System.out.println("Hola, tu 1er número es el: " + primerNumero + " tu 2do número es el: " + segNumero);
  System.out.println("La multiplicación de ambos es: "+ multiplica + " gracias por participar.");
	}
}

