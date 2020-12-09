/*
 * Ex08MGDE1.java
 *5/11/2020
 * Copyright 2020 Mario Giovanny Duran Eyzaguirre  <mario.duran.alu@iescampanillas.com>
 *
 * Implemente un programa que solicite al usuario un par de números, que se corresponderán con el número de filas y el número de columnas de un tablero. Dicho tablero deberá presentarse por consola "al estilo" de los tableros de ajedrez. Para pintar la cuadrícula "rellena" puede utilizar dos caracteres "cuadrícula rellena". El carácter cuadrícula rellena es: █.
 */

public class Ex08MGDE1 {
  public static void main (String[] args) {
  String linea;

  System.out.print("Por favor, introduzca el número de columnas: ");
  linea = System.console().readLine();
  int primerNumero;
  primerNumero = Integer.parseInt( linea );

  System.out.print("introduzca el número de filas, por favor: ");
  linea = System.console().readLine();
  int segundoNumero;
  segundoNumero = Integer.parseInt( linea );

		for (int j=0; j<primerNumero; j++){
		 	for (int i=0; i<=segundoNumero; i++){
				System.out.print("██  ");
        //System.out.print("  ");
			}
				System.out.println();
		}
  }
}
