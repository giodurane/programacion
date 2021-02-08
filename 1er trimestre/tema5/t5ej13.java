/*
 * t5ej13.java
 * 
 * Copyright 2021 giodurane <mario.duran.alu@iescampanillas.com>
 * 
 * 13. Escribe un programa que lea una lista de diez números y determine
 * cuántos son positivos, y cuántos son negativos.
 * 
 * 
 */

import java.util.Scanner;
public class t5ej13 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int pos=0, neg=03-, a;
    
    for (int i=0;i<10; i++){
      a = s.nextInt();
      if (a<0){
        neg++;
      } else {
        pos++;
        }
      System.out.println("Ha introducido "+pos+" números positivos y "+neg+" números negativos");
    }
    
	}
}

