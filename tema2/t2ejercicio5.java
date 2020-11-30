/*
 * t2ejercicio6.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 6
 * -----------
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se
 * quiere convertir deberá estar almacenada en una variable.

 */


public class t2ejercicio5 {

  public static void main(String[] args) {
  double pesetas = 1600000;
  int euros = (int) ( pesetas / 166.386 );
  System.out.print(pesetas + " pesetas son " + euros  + " euros.");
  }
}


