/*
 * ejemploPiramide.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
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

import java.util.Scanner;
public class ejemploPiramide {
	
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

