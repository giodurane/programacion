/*
 * t5ej19.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 19
 * Realiza un programa que pinte una pirámide por pantalla.
 * La altura se debe pedir por teclado. El carácter con el que se pinta
 * la pirámide también se debe pedir por teclado.
 * 
 * 
 */

import java.util.Scanner;
public class t5ej19 {
	
	public static void main (String[] args) {
  Scanner s = new Scanner(System.in); 
  System.out.print("Introduzca el caracter de relleno: ");
  String relleno = s.nextLine();
  System.out.print("Por favor, introduzca la altura de la piramide: ");
  int alturaIntroducida = s.nextInt();
  
  int planta = 1;
  int longitudDeLinea = 1;
  int espacios = alturaIntroducida-1;
  while (planta <= alturaIntroducida) {
  // inserta espacios
  for (int i = 1; i <= espacios; i++) {
  System.out.print(" ");
  
  }
  // pinta la línea
  for (int i = 1; i <= longitudDeLinea; i++) {
  System.out.print(relleno);
  }
  System.out.println();
  planta++;
  espacios--;
  longitudDeLinea += 2;
  }
  }
}
