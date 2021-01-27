/*
 * t4ej10.java
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
public class t4ej10 {
	
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
		String horoscopo = "";
    int mes;
    int dia;
    System.out.println("Te vamos a decir tu signo del zodiaco.");
    System.out.println("Introduce el numero del mes en el que has nacido: ");
    mes = s.nextInt();
    System.out.println("Introduce el dia: ");
    dia = s.nextInt();
    
    if((mes >12 ) || (dia>31)){
      System.out.println("Lo siento, el mes que indica no existe");
    }else{
      
        switch(mes){
          case 1:
            if(dia<19){
              horoscopo = "capricornio";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "acuario";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          
          case 2:
            if(dia<18){
              horoscopo = "acuario";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "picis";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          
          case 3:
            if(dia<20){
              horoscopo = "picis";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "aries";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          case 4:
            if(dia<19){
              horoscopo = "aries";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "tauro";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          case 5:
            if(dia<21){
              horoscopo = "tauro";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "geminis";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          case 6:
            if(dia<20){
              horoscopo = "geminis";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "cancer";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          case 7:
            if(dia<22){
              horoscopo = "cancer";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "leo";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          case 8:
            if(dia<22){
              horoscopo = "leo";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "virgo";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          case 9:
            if(dia<22){
              horoscopo = "virgo";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "libra";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          case 10:
            if(dia<22){
              horoscopo = "libra";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "escorpio";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          case 11:
            if(dia<21){
              horoscopo = "escorpio";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "sagitario";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          case 12:
            if(dia<22){
              horoscopo = "sagitario";
              System.out.println("Su Horoscopo es: "+horoscopo);
            }else{
              horoscopo= "capricornio";
              System.out.println("Su Horoscopo es: "+horoscopo);
              }
              break;
          
        }
    }
	}
}

