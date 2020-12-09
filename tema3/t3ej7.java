/*
 * t3ej7.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 7
 * Escribe un programa que calcule el total de una factura a partir de la
 * base imponible.
 *
 *
 */

import java.util.Scanner;
public class t3ej7 {

	public static void main (String[] args) {
  Scanner s = new Scanner (System.in);
  System.out.println("Vamos a hacer el ticket de la factura con IVA del 21%: ");
  System.out.print("Introduzca la base imponible (Precio del artículo sin IVA): ");

  double baseImp = s.nextDouble();
  double elIva = baseImp * 0.21;
  double total = baseImp * 1.21;

  System.out.println("El precio del artóculo es: " + baseImp);
  System.out.print("El 21% de iva: ");
  System.out.printf("%6.2f \n", elIva);
  System.out.println("El precio total: " + total+"€");

	}
}

