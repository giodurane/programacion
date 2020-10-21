/*
 * T5ejemplo03.java
 * 
 * Copyright 2020 Mario Giovanny Duran Eyzaguirre <gd@giodurane.com>
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


public class T5ejemplo03 {
	
	public static void main (String[] args) {
		int num1;
    int num2;
    int suma;
    
    for ( int i = 1; i<11; i++){
      System.out.println("Introduzca un número: ");
      num1 = Integer.parseInt(System.console().readline());
      System.out.println("Introduzca otro número: ");
      num2 = Integer.parseInt(System.console().readline());
      
      int suma = num1 + num2;
      System.out.println("El resultado de la suma es: "+suma);
      
     
    }
	}
}

