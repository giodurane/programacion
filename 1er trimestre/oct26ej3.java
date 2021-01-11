/*
 * oct26ej3.java
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

/*el usuario va a meter dos números, 4, 6, el triángulo que se pinta, comienza en 4 y acaba en 6*/
public class oct26ej3 {
	public static void main (String[] args) {

  int = num1;
  int = num2;

	System.out.print("Introduce un número: ");
	int num1 = Integer.parseInt(System.console().readline());
  System.out.print("Introduce otro número: ");
	int num2 = Integer.parseInt(System.console().readline());

	if (num1<num2){
		for (int j=num1; j>num2; j++){
			for (int i=1; i<=j; i++){
				System.out.print("*");
			}
				System.out.println();
		}
	} else {
		for (int j=num1; j>num2; j++){
			for (int i=1; i<=j; i++){
				System.out.print("*");
			}
				System.out.println();
		}


  }
}}
