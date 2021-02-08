/*
 * t5ej14.java
 * 
 * Copyright 2021 giodurane <mario.duran.alu@iescampanillas.com>
 * TEMA 5
 * 
 * 14. Escribe un programa que pida una base y un exponente 
 * (entero positivo) y que calcule la potencia.
 * 
 */


public class t5ej14 {
	
	public static void main (String[] args) {
    
    
    System.out.println("Cálculo de una potencia");
    System.out.print("Introduzca la base: ");
    
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    double potencia = 1;

    if (exponente == 0) {
    potencia = 1;
    }
    if (exponente > 0) {
    for (int i = 0; i < exponente; i++) {
    potencia *= base;
    }
    }
    if (exponente < 0) {
    for (int i = 0; i < -exponente; i++) {
    potencia *= base;
    }
    potencia = 1/potencia;
    }
    System.out.println(base + "^" + exponente + " = " + potencia);
}}
