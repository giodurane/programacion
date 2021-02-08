/*
 * t4ej18.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 18. 
 * Escribe un programa que diga cuál es la primera cifra de un número
 * entero introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 */

import java.util.Scanner;
public class t4ej18 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int numero, primera = 0;
    
    System.out.print("Hola, introduce un numero entero: ");
    numero = s.nextInt();
    
    if (numero<10){
      primera = numero;
    } if ((numero>=10)&&(numero<100)){
      primera = numero/10;
      } if ((numero>=100)&&(numero<1000)){
      primera = numero/100;
      } if ((numero>=1000)&&(numero<10000)){
      primera = numero/1000;
      }
    
    System.out.print("El primer numero introducido es: "+primera);
	}
}

