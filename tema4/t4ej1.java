/*
 * t4ej1.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * Ejercicio 1:
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 */

import java.util.Scanner;
public class t4ej1 {

	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);

  System.out.print("Por favor, indique un día de la semana y le diré que asignatura le toca ese día a primera hora ");
  int dia = s.nextInt();

  System.out.print("holaa"+dia);

  switch (dia){

    case lunes:
      System.out.print("Le toca PROG");
      break;

    case martes:
      System.out.print("Le toca SINF");
      break;

    case miercoles:
      System.out.print("Le toca BBDD");
      break;

    case jueves:
      System.out.print("Le toca LGMK");
      break;

    case viernes:
      System.out.print("Le toca ENTD");
      break;

    case sabado:
      System.out.print("Es festivo, disfrute de lo bailao");
      break;

    case domingo:
      System.out.print("Es festivo, no olvide preparar la semana próxima");
      break;


    default:
      break;
    }

  }
}

