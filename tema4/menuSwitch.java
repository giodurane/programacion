/*
 * menuSwitch.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 *
 */

import java.util.Scanner;
public class menuSwitch {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);

  System.out.println("CÁLCULO DE ÁREAS");
  System.out.println("1. Cuadrado");
  System.out.println("2. Rectángulo");
  System.out.println("3. Triángulo");
  System.out.print("Elija una opción: ");

  int opcion = s.nextInt();

    switch (opcion){
      case 1:
        System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
        double lado = s.nextDouble();
        System.out.print("el lado introducido es: "+lado+"cm; el área del cuadrado es: "+lado*lado+"cm2");
        break;
      case 2:
        System.out.print("Introduzca el valor Y del rectángulo en cm: ");
        double y = s.nextDouble();
        System.out.print("Introduzca el valor X del rectángulo en cm: ");
        double x = s.nextDouble();
        double frec = y * x ;
        System.out.print("el lado y vale: " + y + "cm, el lado x vale" + x + "cm; el área del rectángulo es: " + frec + "cm2");
        break;
      case 3:
        System.out.print("Introduzca el valor \nY del triángulo en cm: ");
        double a = s.nextDouble();
        System.out.print("Introduzca el valor \nX del triángulo en cm: ");
        double b = s.nextDouble();
        double funcion = a*b/2;
        System.out.println("el lado \nY vale: " + a + "cm, el lado \nX vale" + b + "cm; el área del rectángulo es: " + funcion + "cm2") ;
        break;
    }
	}
}

