/*
 * ejPiramideHueca.java
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


public class ejPiramideHueca {
	
	public static void main (String[] args) {
		System.out.print("Por favor, introduzca la altura de la piramide: ");
int alturaIntroducida = Integer.parseInt(System.console().readLine());
System.out.print("Introduzca el caracter de relleno: ");
String relleno = System.console().readLine();
int altura = 1;
int i = 0;
int espaciosPorDelante = alturaIntroducida - 1;
int espaciosInternos = 0;
while (altura < alturaIntroducida) {

// inserta espacios delante
for (i = 1; i <= espaciosPorDelante; i++) {
System.out.print(" ");
}
// pinta la línea
System.out.print(relleno);
for (i = 1; i < espaciosInternos; i++) {
System.out.print(" ");
}
if (altura>1) {
System.out.print(relleno);
}
System.out.println();
altura++;
espaciosPorDelante--;
espaciosInternos += 2;
} // while ////////////////////////////
// base de la pirámide
for (i = 1; i < altura*2; i++) {
System.out.print(relleno);
}
}
}
