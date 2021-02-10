/*
 * t5ej16.java
 * 
 * Copyright 2021 giodurane <mario.duran.alu@iescampanillas.com>
 * 
 * 16. Escribe un programa que diga si un número introducido por teclado
 * es o no primo. Un número primo es aquel que sólo es divisible entre
 * él mismo y la unidad.
 * 
 */

import java.util.Scanner;
public class t5ej16 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    boolean esPrimo=true;
    int continuar = 0, a=0;
  
    do{
      
    System.out.print("Introduce un número y te dire si es primo o no: ");
    a = s.nextInt();
    
        for (int i =2; i < a; i++){
          if((a%i)==0){
          esPrimo = false;
          }
        }
        if (esPrimo){
        System.out.println("El número introducido es primo");
        } else {
            System.out.println("El número introducido no es primo");
          }
      System.out.print("¿Desea continuar? (1)Continuar | (2) salir  :    ");
      continuar = s.nextInt();
    
    } while (continuar == 1);
        System.out.println("Usted ha salido correctamente");
    
	}
}

