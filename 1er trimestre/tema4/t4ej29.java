/*
 * t4ej29.java
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
public class t4ej29 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    String comida="", bebe="";
    int desayuno, pitufo, bebida=0;
    double precioDesayuno =0, precioBebida=0, totalDesayuno=0;
    
    System.out.print("que ha tomado para comer?(1)palmera, (2)donut (3)pitufo:  ");
    desayuno = s.nextInt();
    switch(desayuno){
      case 1:
      comida = "palmera";
      precioDesayuno = 1.40;
      break;
      case 2:
      comida = "donut";
      precioDesayuno = 1;
      break;
      case 3:
      System.out.print("El pitufo es (1) de aceite o (2) con tortilla:  ");
      pitufo = s.nextInt();
      if (pitufo==1){
        comida = "pitufo con aceite";
        precioDesayuno = 1.2;
        }
      if (pitufo ==2){
        comida = "pitufo con tortilla";
        precioDesayuno = 1.6;
        }  
      break;
      default:
      }
    System.out.print("Indique la bebida elegida: (1)zumo (2)cafe:  ");
    bebida = s.nextInt();
    switch (bebida){
      case 1:
      precioBebida = 1.5;
      bebe= "zumo";
      case 2:
      precioBebida = 1.2;
      bebe = "cafe";
      }
    
    totalDesayuno = precioDesayuno+precioBebida;
    
    System.out.println(comida+": "+precioDesayuno+" Euros");
    System.out.println(bebe+": "+precioBebida+" Euros");
    System.out.println("Total desayuno: "+totalDesayuno+" Euros");
    
    System.out.println("");
    
    
	}
}

