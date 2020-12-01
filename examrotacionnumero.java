/*
 * Colores.java
 *
 * Copyright 2020 Mario Giovanny Duran Eyzaguirre
 * gd@giodurane.com>
 *
 *
 */


public class examrotacionnumero {

	public static void main (String[] args) {
		int numero;
    int desplazamiento;

    System.out.print("Introduzca número: ");
    numero = Integer.parseInt(system.console().readline());

    System.out.print("Introduzca el número de posiciones a rotar a la derecha");
    desplazamiento  = Integer.parseInt(System.console().readline());
    // longitud del número
    int aux = numero;
    while (aux > 0){
      longitudNumero++;
      aux = aux / 10;
    }//este buble me devuelve el numero de cifras que tiene el número
    for (int i = 0; i<desplazamiento; i++) { //cuento el numero de desplazamientos de la unidad
        aux = numero % 10;
        numero = numero / 10;
        for (int j=0; j<longitudNumero-1; j++){
            aux = aux*10;
        }
        numero = aux + numero;
      }
  System.out.print("resulta"+numero);
  }
}

