/*
 * nmesNombre.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 *
 */

import java.util.Scanner;
public class nmesNombre {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);

  System.out.print("Por favor, introduzca un número del mes: ");
  int mes = s.nextInt();

  String nombreMes;

  switch (mes){
    case 1: nombreMes = "Enero";
      break;
    case 2: nombreMes = "Febrero";
      break;
    case 3: nombreMes = "Marzo";
      break;
    case 4: nombreMes = "Abril";
      break;
    case 5: nombreMes = "Mayo";
      break;
    case 6: nombreMes = "Junio";
      break;
    case 7: nombreMes = "Julio";
      break;
    case 8: nombreMes = "Agosto";
      break;
    case 9: nombreMes = "Septiembre";
      break;
    case 10: nombreMes = "Octubre";
      break;
    case 11: nombreMes = "Noviembre";
      break;
    case 12: nombreMes = "Diciembre";
      break;
    default: nombreMes = "no existe ese mes";
      break;
    }
    System.out.println("Mes " + mes + ": " + nombreMes);
	}
}

