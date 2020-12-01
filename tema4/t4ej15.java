/*
 * t4ej15.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 *
 *
 */


public class t4ej15 {

	public static void main (String[] args) {

  System.out.println("Este programa pinta una pirámide.");
  System.out.print("Introduzca un caracter de relleno: ");
  String a = System.console().readLine();

  System.out.println("1 dibujar hacia la izquierda");
  System.out.println("2 dibujar hacia arriba");
  System.out.println("3 dibujar hacia la derecha");
  System.out.println("4 dibujar hacia abajo");
  int dibujo = Integer.parseInt(System.console().readLine());

  switch (dibujo){
    case 1 :
    System.out.println("     "+a);
    System.out.println("    "+a+a);
    System.out.println("   "+a+a+a);
    System.out.println("    "+a+a);
    System.out.println("     "+a);
    break;

    case 2 :
    System.out.println("   "+a);
    System.out.println("  "+a+a+a);
    System.out.println(" "+a+a+a+a+a);
    break;
    case 3 :
    System.out.println("  "+a);
    System.out.println("  "+a+a);
    System.out.println("  "+a+a+a);
    System.out.println("  "+a+a);
    System.out.println("  "+a);
    break;
    case 4 :
    System.out.println(" "+a+a+a+a+a);
    System.out.println("  "+a+a+a);
    System.out.println("   "+a);
    break;
    }
	}
}

