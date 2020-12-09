/*
 * matrizCuadrada.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 */

import java.util.Scanner;
public class matrizCuadrada {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  int tamanio;
  String [][] matrizBid;

    do{ //primer bucle, no inicia si el número no es >=3
      System.put.print("Indique el tamaño de la matriz (>=3)");
    }while (tamanio<3);


    if (tamanio %2==0) {
      //Decapar
      int nCapas;
      System.out.print("Introduzca el número de capas a decapar");
      int nCapas = s.nextInt();

    }if (nCapas >(tamanio/2-1)){
      nCapas = tamanio/2-1;
    }
    //decapar filas superiores
    for (int i=0; i<nCapas; i++){
      for (int j=0; j<tamanio; j++){
        matrizBid[i][j] = "."}

      }



	}
}

