/*
 * t5ej17java
 * 
 * Copyright 2021 giodurane <mario.duran.alu@iescampanillas.com>
 * 
 * tema 5 ejercicio 17
 * 
 * Realiza un programa que sume los 100 numeros siguientes 
 * al número introducido por teclado. Debe comprobrar que 
 * el número introducido es positivo
 * 
 */

import java.util.Scanner;
public class t5ej17 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int a, i;
    do{
    System.out.print("Introduzca un número y le sumaremos los 100 números siguientes.");
    a = s.nextInt();
    if (a<0){
      System.out.println("El número introducido no es correcto");
    } while (a<0);
    for (i=0; i<=100;i++){
      System.out.println("El número "+(a+i));
      }
    
    } while (a<= 0);
    System.out.println("Ha salido usted correctamente del programa.");
	}
}

