/*
 * numEntero.java
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
public class numEntero {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
    int numero;
    System.out.print("Introduce un numero y te dire si es negato o positivo: ");
    numero = s.nextInt();
    System.out.println("ha introducido el: "+numero);
    if (numero>0){
      System.out.println("Su numero es positivo");
      }else{
        System.out.println("su numero es negativo");
        }
    
	}
}

