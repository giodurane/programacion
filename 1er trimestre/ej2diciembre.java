/*
 * t3numero.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 */


public class ej2diciembre {

	public static void main (String[] args) {
  String linea;

  System.out.print("Por favor, introduzca un valor mínimo: ");
  linea = System.console().readLine();
  int primerNumero;
  primerNumero = Integer.parseInt(linea);

  System.out.println("Por favor, introduce un valor máximo: ");
  linea = System.console().readLine();
  int segNumero;
  segNumero = Integer.parseInt(linea);

  //System.out.println("Hola, tu 1er número es el: " + primerNumero + " tu 2do número es el: " + segNumero);

  for (int i = primerNumero; i < segNumero; i++) {
    n[i] = (int)(Math.random() * segNumero) + 20;
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

