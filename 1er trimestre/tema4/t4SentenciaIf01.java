/*
 * t4SentenciaIf01.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 *
 */


public class t4SentenciaIf01 {

	public static void main (String[] args) {
  System.out.print("¿Cuál es la capital de Francia? ");
  String respuesta = System.console().readLine();

  if (respuesta.equals("Paris")) {
    System.out.println("¡La respuesta es correcta!");
  } else {
    System.out.println("Lo siento, la respuesta es incorrecta.");
    }
  }
}
