/*
 * t4ej23.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * T4 ejercicio 23
 * 
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. 
 * 
 * Los tipos de IVA:
 * - general 21%
 * - reducido 10%
 * - superreducido 4%
 
 * Los códigos promocionales pueden ser:
 * nopro: no se aplica promoción
 * mitad: el precio se reduce a la mitad
 * meno5: se descuentan 5 euros
 * por5: se descuenta el 5%. 
 * 
 * El ejercicio se da por bueno si se muestran los valores correctos, 
 * aunque los números no estén tabulados.
 * 
 */

import java.util.Scanner;
public class t4ej23 {
	
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
		
    String producto;
    double precio;
    int iva, descuento;
    
    System.out.println("Indique el producto: ");
    producto = s.nextLine();
    System.out.println("Indique la base imponible: ");
    precio = s.nextDouble();
    System.out.println("\n(1)General, (2) Reducido (3) Superreducido");
    System.out.print("Indique el tipo de iva: ");
    iva = s.nextInt();
    
    System.out.println("\n(1)nopro, (2) mitad (3) meno5 (4) por5 -- ");
    System.out.print("Aplique su codigo promocional: ");
    descuento = s.nextInt();
    
    
	}
}

