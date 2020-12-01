/*
 * t3numero.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 */


public class t3numero {

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
  int suma = primerNumero + segNumero;

  System.out.println("Hola, tu 1er número es el: " + primerNumero + " tu 2do número es el: " + segNumero);
  System.out.println("La suma de ambos es: "+ suma + "gracias por participar.");
	}
}

