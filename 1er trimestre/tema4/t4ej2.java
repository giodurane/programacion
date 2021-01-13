/*
 * t4ej2.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
 * de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta
 * las horas, los minutos no se deben introducir por teclado.
 *
 */

import java.util.Scanner;
public class t4ej2 {

	public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
  String linea;
  System.out.print("Por favor, introduzca un numero: ");
  linea = s.nextLine();
  int hora;
  hora = Integer.parseInt(linea);

    if ((hora >= 6) && (hora <= 13)){
      System.out.println("Buenas dias");
    }
      if ((hora >= 13) && (hora <= 18)){
        System.out.println("Buenas tardes");
      }
        if ((hora >= 19) && (hora <=24)){
          System.out.println("Buenas noches");
        }
          if (hora > 25){
            System.out.println("Esa hora no es de este planeta, busca otro programa para resolver tu problema ;-)");
          }
  }
}
