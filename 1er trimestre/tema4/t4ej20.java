/*
 * t4ej20.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * EJERCICIO 20. 
 * Realiza un programa que diga si un número entero positivo
 * introducido por teclado es capicúa. Se permiten números de
 * hasta 5 cifras.
 * 
 * 
 */

import java.util.Scanner;
public class t4ej20 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    
    
	}
}

import java.util.Scanner;
public class t4ej17 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int numero;
    boolean capicua = false;
    
    System.out.print("Hola, introduce un numero entero de hasta 5 cifras y te dire si es capicua: ");
    numero = s.nextInt();
    
    if(numero<10){
      System.out.println("Es capicua");
      } if ((numero>=10)&&(numero<100)){
          if ((numero/10) == (numero%10)){
          capicua = true;
          }
        }
    if ((numero>=100)&&(numero<1000)){
      if ((numero/100) == (numero%1000)){
        capicua = true;
      }
    }
        
        
        
        
        
    if (capicua){
      System.out.println("El numero introducido es capicua");
      } else{
        System.out.println("El numero introducido no es capicua");
        }
    
    
	}
}



