/*
 * ejemploDoWhile_1.java
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


public class ejemploDoWhile_1 {
	
	public static void main (String[] args) {

    int numero;
    do {
      System.out.println("dime un numero: ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero %2 ==0){
        System.out.println("Que bonito es el "+numero);
        } else {
          System.out.println("No me gustan los numeros impares, adios!");
          }
    System.out.println("quiere continuar?: s/n ");
    String continuar = System.console().readLine();
    
    } while (numero %2 == 0);
	}
}

