/*
 * TicketCompra.java
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


public class TicketCompra {
	
    public static void main (String[] args) {

    
 /*esto es declarar una variable*/
    String nombreArticulo1, nombreArticulo2, nombreArticulo3;
    float precioArticulo1, precioArticulo2, precioArticulo2;
    int cantidadArticulo1, cantidadArticulo3, cantidadArticulo3;
    
    System.out.print("Introduzca el nombre del art 1: ");
    nombreArticulo1= System.console().readLine();
    System.out.print("Introduzca el precio del 1er articulo: ");
    precioArticulo1 = Float.parsefloat(System.console().readline());
    System.out.print("Introduzca la cantidad del 1er articulo: ");
    cantidadArticulo1 = Integer.parseInt(System.console().readline());
    
    /*String aux = System.console().readline(); |||estas dos variables se pueden
    precioArticulo1 = Float.parseFloat(aux);    |||resumir en una sola (linea38)*/
    
    
    System.out.print("Introduzca el nombre del art 2: ");
    nombreArticulo2= System.console().readLine();
    System.out.print("Introduzca el precio del 2er articulo: ");
    precioArticulo2 = Float.parsefloat(System.console().readline());
    System.out.print("Introduzca la cantidad del 2er articulo: ");
    cantidadArticulo2 = Integer.parseInt(System.console().readline());
    
    System.out.print("Introduzca el nombre del art: 3 ");
    nombreArticulo3= System.console().readLine();
    System.out.print("Introduzca el precio del 3er articulo: ");
    precioArticulo3 = Float.parsefloat(System.console().readline());
    System.out.print("Introduzca la cantidad del 3er articulo: ");
    cantidadArticulo3 = Integer.parseInt(System.console().readline());
    
    float subtotal = String * 
    System.out.printf("%-10s %-10.2f% %-10d %-10.2f",nombreArticulo1, precioArticulo1, cantidadArticulo1, subtotal);
    
    
    
    
    
    
    
    	}
    
}

