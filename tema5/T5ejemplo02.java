/*
 * T5ejemplo02.java
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


public class T5ejemplo02 {
	
	public static void main (String[] args) {
		long x = 5;
      
      //for (int i=14; i>=0; i--) {//
      for (int i=14; i>=0; i--) {
        System.out.printf("Hola %2d",i);
        x = x *(i+1);
        System.out.printf("Valor de x: %15d\n",x);
      }
	}
}

