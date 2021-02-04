/*
 * t4ej14.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 14
 * Realiza un programa que diga si un número introducido 
 * por teclado es par y/o divisible entre 5.
 * 
 */

import java.util.Scanner;
public class t4ej14 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int numero;
    System.out.print("Introduce un número y te dire si es par o divisible entre 5: ");
    numero = s.nextInt();
    System.out.println("El número introducido es: "+numero);
    if ((numero % 2) == 0){
      System.out.println("el número introducido es par.");
      } else {
          System.out.println("es impar");
        }
    if((numero % 5) == 0){
        System.out.println("el número es divisible entre 5");
      } else {
          System.out.println("el número no es divisible entre 5");
        }
	}
}

