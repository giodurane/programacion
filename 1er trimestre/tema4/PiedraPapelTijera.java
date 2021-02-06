/*
 * PiedraPapelTijeraLagartoSpock.java
 *
 * Copyright 2020 Mario Giovanny Duran Eyzaguirre <gd@giodurane.com>
 *
 * (1) piedra
 * (2) papel
 * (3) tijera
 *
 *
 */

import java.util.Scanner;
public class PiedraPapelTijera {

	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);

    int j1, j2;

    System.out.print("Jugador 1: \n(1) piedra (2) papel (3) tijera: ");
    j1 = s.nextInt();

    System.out.print("Jugador 2: \n(1) piedra (2) papel (3) tijera: ");
    j2 = s.nextInt();

    if (j1==j2) {
      System.out.println("Empate");
      } 
    if((j1== 1) && (j2==2)){
      System.out.println("Gana jugador 2");
      }
    if ((j1==1)&&(j2==3)){
      System.out.println("Gana jugador 1");
      }
    if((j1== 2) && (j2==1)){
      System.out.println("Gana jugador 1");
      }
    if ((j1==2)&&(j2==3)){
      System.out.println("Gana jugador 2");
      }
    if((j1== 3) && (j2==1)){
      System.out.println("Gana jugador 1");
      }
    if ((j1==3)&&(j2==2)){
      System.out.println("Gana jugador 1");
      }
      
  }
}


