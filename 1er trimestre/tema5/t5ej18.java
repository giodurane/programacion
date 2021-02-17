/*
 * t5ej18.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 18
 * Escribe un programa que obtenga los números enteros comprendidos 
 * entre dos números introducidos por teclado y validados como
 * distintos, el programa debe empezar por el menor de los enteros 
 * introducidos e ir incrementando de 7 en 7.
 * 
 */

import java.util.Scanner;
public class t5ej18 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int a, z, rep;
    //coge datos
    do{
    System.out.print("dame dos numeros uno mayor a otro\n numero (a):  ");
    a = s.nextInt();
    System.out.print("dame el numero (b): ");
    z = s.nextInt();
    /*while (a!=z);
      System.out.println("Los numeros no pueden ser iguales. ");*/
    // comprueba que no haya numeros negativos
    if ((a>0)&&(z>0)){
    //ordena de menor a mayor los datos introducidos    
      if (z <= a){
        int aux;
        aux = z;
        z = a;
        a = aux;
      }
    } else{
          System.out.println("Ambos numeros han de ser mayor que 0");
      }
        
        for (int i = 0; i<z; i+=7){
        System.out.println("sumamos 7 unidades"+(a+i));
        }
    
    //repite el programa
    System.out.println("Desea repetir el programa? (1)SI  (2)NO");
    rep = s.nextInt();
    } while (rep == 1);
	}
}

