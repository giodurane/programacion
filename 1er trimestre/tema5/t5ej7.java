/*
 * t5ej7.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * tema 5 ejercicio 7
 * Realiza el control de acceso a una caja fuerte. La combinación será
 * un número de 4 cifras. El programa nos pedirá la combinación para
 * abrirla. Si no acertamos, se nos mostrará el mensaje:
 * Lo siento, esa no es la combinación
 * si acertamos se nos dirá:
 * La caja fuerte se ha abierto satisfactoriamente.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 */

import java.util.Scanner;
public class t5ej7 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
    int pass = 1234, intento= 4;
    boolean acertado = false;
    do {
      System.out.print("Introduzca la contrasena: ");
      pass = s.nextInt();
      
      if (pass == oportunidad){
          acertado = true;
          
        } else{
            System.out.println("Lo siento, esta no es la combinacion. ");
          }
    intento--;
    
    } while ((intento >0)&&(!acertado));
    if (acertado){
      System.out.println("La caja fuerte se ha abierto satisfactoriamente. ");
      } else{
          System.out.println("Lo siento, esta no es la combinacion. ");
        }
	}
}

