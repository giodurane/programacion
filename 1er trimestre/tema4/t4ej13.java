/*
 * t4ej13.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 13
 * Escribe un programa que ordene tres números enteros introducidos por teclado de menor a mayor.
 * 
 */

import java.util.Scanner;
public class t4ej13 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int a, b, c, aux;
    
    System.out.println("introduce tres valores y los ordenaremos de menor a mayor: ");
    
    System.out.print("introduce valor a: ");
    a = s.nextInt();
        System.out.print("introduce valor b: ");
    b = s.nextInt();
        System.out.print("introduce valor c: ");
    c = s.nextInt();
    
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
  // ordenación de los dos últimos números
    if (b > c) {
    aux = b;
    b = c;
    c = aux;
    }
  // se vuelven a ordenar los dos primeros
    if (a > b) {
    aux = a;
    a = b;
    b = aux;
    }
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
    
    System.out.println("ahora los ordenamos de mayor a menor: ");
    //ordenamos que a sea mayor que b
    if (b > a){
      aux = b;
      b = a;
      a = aux;
    } 
    // ordenamos que b sea mayor que c  
    if (c > b){
    aux = c;
    c = b;
    b = aux;
    }
  //ordenamos nuevamente a y b
    if (b > a){
    aux = b;
    b = a;
    a = aux;
    } 
    System.out.println("Los números introducidos ordenados de mayor a menor son " + a + ", " + b + " y " + c + ".");
	}
}

