/*
 * t4ej8.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 8
 * Amplía el programa anterior para que diga la nota del boletín 
 * insuficiente, suficiente, bien, notable o sobresaliente).
 */

import java.util.Scanner;
public class t4ej8 {
	
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
      System.out.println("con un "+suma+" es insuficiente");
      }
      if ((suma>5) && (suma<6)){
      System.out.println("con un "+suma+" es suficiente");
      }
        if ((suma>6) && (suma<7)){
        System.out.println("con un "+suma+" es bien");
        }
          if ((suma>7) && (suma<8)){
          System.out.println("con un "+suma+" es notable");
          }
            if ((suma>8) && (suma<11)){
            System.out.println("con un "+suma+" es sobresaliente");
            }   
      }
}

