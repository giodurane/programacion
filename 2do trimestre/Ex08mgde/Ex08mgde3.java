/*
 * Ex08mgde3.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * EJERCICIO 3.-
 * Dada una frase introducida por teclado, el programa debe sustituir las ocurrencias de los dígitos del
0 al 9 por su transcripción literal en español, separando las transcripciones por corchetes [ ]. La frase será
preguntada por el programa al usuario. El programa deberá presentar por pantalla la frase original y la frase
con las sustituciones realizadas. Finalmente, se le preguntará al usuario si desea salir. En caso negativo, el
programa solicitará al usuario una nueva frase de partida, y el programa volverá a sustituir los dígitos por su
transcripción literal, separando con corchetes. Volverá a presentar por pantalla la frase original y la frase con
las sustituciones realizadas, y finalmente se le volverá a preguntar si desea salir. Y el programa actuará como
antes.
 * 
 * 
 */

import java.util.Scanner;
public class Ex08mgde3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
       
//do - que se inicie el programa y pedimos la frase
      String frase;
      System.out.println("Introduzca una frase (a ser posible, con digitos alfanumericos en ella: ");
      frase = s.nextLine();
      System.out.println("su frase: "+frase);
      switch (frase){
      case 1:
        System.out.print(convert+"prueba");
        double lado = s.nextDouble();
        //el print entrega la frase formateda
        System.out.print("el lado introducido es: "+lado+"cm; el área del cuadrado es: "+lado*lado+"cm2");
        break;
      case 2:
        
      default:
        System.out.print("hola");
      //while continuar si o no
      }
    
	}
}

