/*
 * t5ej6.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Tema 5 ejercicio 6
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando
 * un bucle do-while.
 * 
 * 
 */


public class t5ej6 {
	
	public static void main (String[] args) {
		int i = 320;
    
    do{
      System.out.println(i);
      i-=20;
    } while (i>=160);
    
	}
}

