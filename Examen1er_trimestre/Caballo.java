/*
 * Caballo.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 */
public class Caballo {

	public static void main (String[] args) {
  String entrada;
  boolean endadaOK;

  do{
    entradaOK = false;
    System.out.print("Introduzca la posición del caballo: ");
    entrada = System.console().readLine();

    if ((entrada.leght() == 3) && (entrada.charAt(0)>='a') && (entrada.charAt(0)<='h') && (entrada.charAt(1) =='-')&& (entrada.charAt(2)>=1) && (entrada.charAt(2)<='8')){
      endadaOK = true;
    }
    else{
      System.out.println("Lo siento, el formato no es correcto.");
      }

    } while (entradaOK == false);

    columna = (int) (entrada.charAt(0)) - (int)'a';
    fila =  (int) (entrada.charAt(2)) - (int)'1';

    for(int i=7; i>=0; i--){
      for (int j=0; j<8; j++){
        boolean posValida=false;
        if ((j==columna-2) && (i==(fila+1)|| i==(fila-1))){
          posValida = true;
          }else if ((j==(columna+2)) && (i==(fila+1)|| i==(fila-1))){
            posValida = true;
          } else if ((j==(columna-1)) && (i==(fila+2) || i==(fila-2))){
            posValida = true;
          } else if ((j==(columna+1)) && (i==(fila+2)|| i==(fila-2))){
            posValida = true;
          }
        System.out.println((char)(j+'a')+"-"+(i+1));
        }
      }
      System.out.println();
	}
}

