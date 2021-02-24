/*
 * t5ej21.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 21
 * Realiza un programa que vaya pidiendo números hasta que se introduzca
 * un numero negativo y nos diga cuantos números se han introducido, 
 * la media de los impares y el mayor de los pares. El número negativo 
 * sólo se utiliza para indicar el final de la introducción de datos 
 * pero no se incluye en el cómputo.
 * 
 * 
 */

import java.util.Scanner;
public class t5ej21 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int entrada, z=0, pares, impar=0, mayorPares=0, contador=0;
    double mediaImpar=0;
    
    do {
    System.out.print("Introduzca un numero entero: ");
    entrada = s.nextInt();
    contador++;
    
      if ((entrada %2)==1){
        entrada = impar;
        int aux=0;
        z++;
        double suma = aux + impar;
        mediaImpar =  suma /z;
      } else {
          System.out.println("El mayor numero de los pares es: "+mayorPares+" fin.");
        }
      System.out.println("Ha introducido: "+contador+" numeros");
      System.out.println("La media de los numeros impares es: "+mediaImpar+" fin");
      System.out.println("El mayor numero de los pares es: "+mayorPares+" fin.");
      } while(entrada <0);
        System.out.println("Ha salido correctamente del programa");
	}
}

