/*
 * T5ej11.java
 * 
 * Copyright 2021 giodurane <mario.duran.alu@iescampanillas.com>
 * 
 * 5. Bucles
 *
 * 11. Escribe un programa que muestre en tres columnas, el cuadrado y
 * el cubo de los 5 primeros números enteros a partir de uno que se
 * introduce por teclado.
 * 
 * 
 */

import java.util.Scanner;
public class T5ej11 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    double cuadrado, cubo;
    int i=1, n;
    System.out.println("Introduzca 5 números y mostraremos su cuadrado y su cubo en pantalla:");
    
    
    
    while (i<=5){
    System.out.print("número "+i+": ");
    n = s.nextInt();
    i++;
    System.out.println("imprime numeros: ");
    System.out.printf("%4d %6d %8d\n", n, n*n, n*n*n);
    }
    
	}
}

