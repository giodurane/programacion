/*
 * t4ej17.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 17
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * 
 */

import java.util.Scanner;
public class t4ej17 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int numero;
    
    System.out.print("Hola, introduce un numero entero: ");
    numero = s.nextInt();
    System.out.print("El ultimo numero introducido es: "+(numero%10));
	}
}

