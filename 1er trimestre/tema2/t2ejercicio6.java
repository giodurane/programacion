/*
 * t2ejercicio6.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 6
 * -----------
 * Escribe un programa que calcule el total de una factura a partir de la
 * base imponible (precio sin IVA). La base imponible estará almacenada en
 * una variable.
 */


public class t2ejercicio6 {

  public static void main(String[] args) {

  double tBase = 216.34;
  double iva = (double) (tBase * 0.21);
  double tFactura = (double) ( tBase + iva );

  System.out.println("Total base "+ tBase +"€");
  System.out.println("IVA 21% "+ iva +"€");
  System.out.println("Total de factura "+ tFactura +"€");//preguntar como limitar los decimales a 2
  }
}


