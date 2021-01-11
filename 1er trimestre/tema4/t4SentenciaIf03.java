/*
 * t4SentenciaIf03.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 *
 */

import java.util.Scanner;
public class t4SentenciaIf03 {

  public static void main (String[] args) { Scanner s = new Scanner(System.in);
  System.out.print("¿Qué nota has sacado?"); double nota = s.nextDouble();

  if (nota >=5){
    System.out.println("Enhorabuena, ¡has aprobado!");
	} else{
      System.out.println("Lo siento, has suspendido :-(");
    }
  }
}
