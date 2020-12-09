/*
 * Ex08MGDE2.java
 *5/11/2020
 * Copyright 2020 Mario Giovanny Duran Eyzaguirre  <mario.duran.alu@iescampanillas.com>
 *
 *Implemente un programa que solicite al usuario un número entero largo y positivo. Dicho programa obtendrá dos enteros largos a partir de él, y los presentará por pantalla. Uno de ellos contendrá los dígitos pares en el mismo orden en el que aparecen en el número de partida, y el otro contendrá los dígitos impares en orden inverso al que aparecen en el número de partida.
 */


public class Ex08MGDE2 {
  public static void main (String[] args) {
  String linea;

  System.out.print("Por favor, introduzca un número entero largo y positivo: ");
  linea = System.console().readLine();
  int num1;
  num1 = Integer.parseInt( linea );
    if (num1.equals("num1/2=0""))
    System.out.print("las cifras pares del número son: "+num1);//numero par num1/2=0
    System.out.print("las cifras pares del número son: "+num1);//num impar num1/2==0
  }
}
