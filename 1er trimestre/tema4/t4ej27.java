/*
 * t4ej27.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre
 * <mario.duran.alu@iescampanillas.com>
 * 
 * Una pastelería nos ha pedido realizar un programa que haga
 * presupuestos de tartas. El programa preguntará primero de qué sabor 
 * quiere el usuario la tarta:
 * manzana, fresa o chocolate. 
 * La tarta de manzana vale 18 euros y la de fresa 16. 
 * En caso de seleccionar la tarta de chocolate, el programa debe
 * preguntar si el chocolate es negro o blanco; 
 * La primera opción vale 14 euros y la segunda 15. 
 * 
 * Por último se pregunta si se añade nata y si se personaliza 
 * con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 * 
 */

import java.util.Scanner;
public class t4ej27 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    
    int saborTarta, colorChocolate, custom;
    double nata=0, personaliza=1, precioTotal=0;
    String tipoChocolate = "";
    
    //elijo la tarta
    System.out.print("Elija el sabor de su tarta \n(1) manzana (2) fresa (3) chocolate:  ");
    saborTarta = s.nextInt();
    switch (saborTarta){
      case 1:
        System.out.println("Tarta de manzana");
        saborTarta = 18;
        break;
      case 2:
        System.out.println("Tarta de manzana");
        saborTarta = 16;
        break;
      case 3:
        System.out.println("que chocolate desea? ((1)negro o (2)blanco): ");
        colorChocolate = s.nextInt();
        if(colorChocolate==1){
          saborTarta= 14;
          System.out.println("ha seleccionado Tarta de chocolate negro");
          } if(colorChocolate==2){
          saborTarta= 16;
          System.out.println("ha seleccionado Tarta de chocolate blanco");
          }
      break;
    }
    //opcion nata
    System.out.print("Desea agregar nata?:(1)si (2)no : ");
    int conNata = s.nextInt();
    if(conNata==1){
      nata= 2.5;
    } if (conNata==2){
      nata= 0;
      }
    //opcion nombre
    System.out.print("Desea personalizar?:(1)si (2)no : ");
    custom = s.nextInt();
    if(custom==1){
      personaliza = 2.75;
    } if (custom==2){
      personaliza= 0;
      }
    //operaciones  
    precioTotal = saborTarta+nata+personaliza;
      
    //detalle del pedido
    System.out.println("El sabor de tarta elegido es el: "+saborTarta);
    System.out.println("plus por nata: "+nata);
    System.out.println("plus por personalizar: "+personaliza);
    System.out.println("El precio de la tarta elegida es: "+precioTotal+ "Euros");
           
           
}}

