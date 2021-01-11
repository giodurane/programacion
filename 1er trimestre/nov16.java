/*
 * nov16.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 *Tema 4 ejercicio  15 pirámides
 *
 */


public class nov16 {

	public static void main (String[] args) {
  System.out.println("Este programa pinta una pirámide.");
  System.out.print("Introduzca un caracter de relleno: ");
  String a = System.console().readLine();

  System.out.println("1 dibujar hacia la izquierda");
  System.out.println("2 dibujar hacia arriba");
  System.out.println("3 dibujar hacia la derecha");
  System.out.println("4 dibujar hacia abajo");
  int dibujo = Integer.parseInt(System.console().readLine());

    switch (Dibujo){
      case 1:
        System.out.println("   "+a);
        System.out.println(" "+a+a);
        System.out.println("   "+a);
      }
	}
}

