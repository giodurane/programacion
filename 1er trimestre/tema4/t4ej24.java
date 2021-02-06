/*
 * t4ej24.java
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
public class t4ej24 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int cargo, visita, sueldoBase=0, esCivil;
    double irpf=0, sueldoNeto=0;
    
    System.out.println("Seleccione cargo del empleado:");
    System.out.print("(1) Programador Jr. (2) Programador Sr. (3) Jefe de proyecto  \nSELECCIONA:   ");
    cargo= s.nextInt();
    switch(cargo){
      case 1:
      sueldoBase = 950;
      break;
      case 2:
      sueldoBase = 1200;
      break;
      case 3:
      sueldoBase = 1600;
      break;
      default:
        System.out.println("Ese no es un puesto contemplado.");
      }
      
    System.out.print("Indique los dias que ha estado de viaje: ");
    visita= s.nextInt();
    if((visita>0)&&(visita<31)){
      visita = visita * 30;
    } else{
        System.out.println("Numero de dias introducidos erroneo");
      }
    
    System.out.print("Indique Estado Civil: (1)Soltero  (2)casado \nSELECCIONE   :");
    esCivil= s.nextInt();
    switch (esCivil){
      case 1:
      irpf = sueldoBase*(0.25);
      case 2:
      irpf = sueldoBase*(0.20);
      }
    sueldoNeto = sueldoBase + visita - irpf; 
    System.out.println("sueldo base  "+sueldoBase);
    System.out.println("dietas       "+visita);
    System.out.println("retencion    "+irpf);
    System.out.println("salario neto  "+sueldoNeto);
  
	}
}

