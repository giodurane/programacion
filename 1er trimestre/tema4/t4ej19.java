/*
 * t4ej18.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 19. 
 * Realiza un programa que nos diga cuántos dígitos tiene un número
 * entero que puede ser positivo o negativo. Se permiten números de
 * hasta 5 dígitos.
 * 
 */

import java.util.Scanner;
public class t4ej19 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int numero, digito = 0;
    
    System.out.print("Hola, introduce un numero entero: ");
    numero = s.nextInt();
    
    if (numero<10){
      digito = 1;
    } if ((numero>=10)&&(numero<100)){
      digito = 2;
      } if ((numero>=100)&&(numero<1000)){
      digito = 3;
      } if ((numero>=1000)&&(numero<10000)){
      digito = 4;
      }
    
    System.out.print("El numero de digitos introducido es: "+digito);
	}
}

