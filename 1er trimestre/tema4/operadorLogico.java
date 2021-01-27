/*
 * operadorLogico.java
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
public class operadorLogico {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int n = 0;
    System.out.println("Hola, adivine el numero que estoy pensando. ");
    System.out.print("Introduzca un numero entre el 1 y el 100: ");
    n = s.nextInt();
    
    if((n>1) ||(n<100)){
        System.out.println("El numero introducido se encuentra el en intervalo seleccionado");
        /*System.out.print("Vuelve a intentarlo mas adelante, gracias.");*/
      }if(n == 25){
        System.out.println("Felicidades, ha acertado");
        }else{
          System.out.println("El numero "+n+ " no es el numero que estoy pensando");
          }
    
	}
}

