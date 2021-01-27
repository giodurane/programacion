/*
 * t4ej7.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 *Ejercicio 7
 *Realiza un programa que calcule la media de tres notas.
 * 
 */

import java.util.Scanner;
public class t4ej7 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    double a;
    double b;
    double c;
    
    System.out.println("vamos a calcular la media de tres notas.");
    System.out.print("introduce la nota a: ");
    a = s.nextDouble();
    System.out.print("introduce la nota b: ");
    b = s.nextDouble();
    System.out.print("introduce la nota c: ");
    c = s.nextDouble();
    double suma = (a+b+c)/3;    
    if (suma<5){
      System.out.println("con un "+suma+" esta suspenso");
      }else{
        System.out.println("con un" +suma+ " esta aprobado");
        }
	}
}

