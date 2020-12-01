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


public class t4ej2 {

	public static void main (String[] args) {
		String linea;
  System.out.print("Por favor, introduzca un número: ");
  linea = System.console().readLine();
  int hora;
  hora = Integer.parseInt(linea);

  if ((hora >= 6) && (hora <= 13)){
    System.out.println("Buenas días");
  }
    if ((hora >= 13) && (hora <= 21)){
      System.out.println("Buenas tardes");
    }
      if (hora >= 21){
        System.out.println("Buenas noches");
      }
  }
}
