/*
 * diciembre2.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio:
 * Escribir un programa que rellene aleatoriamente las posiciones de un array.
 * los valores aleatorios deben pertenecer a un rango, cuyo valores mínimo y
 * máximo deben ser introducidos por el usuario. En las posiciones impares
 * han de ubicarse los valores pares, y en las posiciones pares han de ubicarse
 * valores impares. Puede haber valores repetidos.
 *
 * Cada alumno decide si lo hace sobre una matriz unidimensional o bidimensional.
 * El tamañode la matriz también debe ser introducido por el usuario.
 *
 * En el caso de matrices bidimensionales, una posición será par o impar según
 * lo seala suma de las coordenadas fila y columna.
 *
 * el 13, 14 y 16 18
 *
 * 16
 * Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.
*
* 18
* Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor... Cuando se acaben los menores o los mayores, se completará con los
números que queden.


 */


public class diciembre2 {

	public static void main (String[] args) {
  //int[] n = new int[20];
  String linea;
  System.out.print("Por favor, introduzca un número: ");
  linea = System.console().readLine();
  int primerNumero;
  primerNumero = Integer.parseInt(linea);

  System.out.println("Por favor, introduce un segundo número: ");
  linea = System.console().readLine();
  int segNumero;
  segNumero = Integer.parseInt(linea);


  System.out.println("Hola, tu 1er número es el: " + primerNumero + " tu 2do número es el: " + segNumero);



  for (int i = primerValor; i < segundoValor; i++) {
    n[i] = (int)(Math.random() * 381) + 20;
    System.out.print(n[i] + " ");
  }
  System.out.print("\n\n¿Qué números quiere resaltar? ");
  System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
  int opcion = Integer.parseInt(System.console().readLine());

  int multiplo = (opcion == 1) ? 5 : 7;

  // Muestra el resultado.
  for (int elemento : n) {
    if (elemento % multiplo == 0) {
      System.out.print("[" + elemento + "] ");
    } else {
      System.out.print(elemento + " ");
    }
  }
  }
}
**/

