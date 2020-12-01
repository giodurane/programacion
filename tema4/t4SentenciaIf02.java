/*
 * t4SentenciaIf02.java
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


public class t4SentenciaIf02 {

	public static void main (String[] args) {
  System.out.print("Por favor, introduzca un número entero: ");
  String linea = System.console().readLine();
  int x = Integer.parseInt(linea);

  if (x< 5) {
    System.out.println("El número que has introducido es menor que 5");
    } else {
      System.out.println("El número introducido es mayor que 5");
      }
	}
}

