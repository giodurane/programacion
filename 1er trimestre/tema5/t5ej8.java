/*
 * t5ej8.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * T5. Bucles
 *
 * 8. Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * 
 */

import java.util.Scanner; 
public class t5ej8 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
  int i , introduce;
  System.out.print("Introduce el numero a multiplicar: ");
  introduce = s.nextInt();
  for (i = 1; i <=1000; i++){
      System.out.println("Multiplicamos "+i+" x "+i*introduce);
    }
	}
}

