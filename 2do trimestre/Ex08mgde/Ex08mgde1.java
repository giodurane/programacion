/*
 * Ex08mgde1.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * EJERCICIO 1
 * Dada una matriz unidimensional, pasar sus datos a otra matriz bidimensional. La primera debe ser
introducida por el usuario (tamaño y valores), y la segunda se rellenará hasta donde se pueda (si es que hay
más valores en la primera matriz que en la segunda). Si faltaran valores, se rellenarán con -1. El tamaño de la
segunda matriz también tiene que ser indicado por el usuario.
El programa tiene que hacer lo siguiente:
a) Pedir el tamaño de la matriz unidimensional y los valores
b) Pedir el tamaño de la matriz bidimensional
c) Rellenar la matriz bidimensional según lo indicados
d) Mostrar ambas matrices
 * 
 * 
 */

import java.util.Scanner;
public class Ex08mgde1 {
	
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int tamano;
    int[] matriz = new int[tamano];
		System.out.print("Introduzca el tamaño de la matriz unidimensional: ");
    tamano = s.nextInt();
    System.out.println("su tamano "+tamano);
	}
}

