/*
 * t5ej10.java
 * 
 * Copyright 2021 giodurane <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 10
 * Escribe un programa que calcule la media de un conjunto de 
 * números positivos introducidos por teclado. A priori, el 
 * programa no sabe cuántos números se introducirán.
 * El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 */

import java.util.Scanner;
public class t5ej10 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
    int n=0, intro=0, suma=0;
    
    while(intro >=0){
    System.out.print("Indique un número: ");
    intro = s.nextInt();
    n++;
    suma += intro;
    
    } 
    int divisor = n-1;
    System.out.println("la media de los numeros introducidos es: "+(suma-intro)/divisor);
	}
}
