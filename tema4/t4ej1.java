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


public class t4ej1 {

	public static void main (String[] args) {

  String dia;

  System.out.print("Por favor, indique un día de la semana y le diré que asignatura le toca ese día a primera hora ");

  dia = (System.console().readLine());
  dia.toLowerCase();

    switch (dia) {
      case "lunes" :
        System.out.println("tienes Programación a primera hora");
        break;

      case "martes" :
        System.out.println("tienes Sistemas Informáticos a primera hora");
        break;

      case "miercoles" :
        System.out.println("tienes Base de datos a primera hora");
        break;

      case "jueves" :
        System.out.println("tienes Fol a primera hora");
        break;

      case "viernes" :
        System.out.println("tienes BBDD a primera hora");
        break;

      case "sabado" :
        System.out.println("No hay clase, pero puedes ponerte a programar");
        break;

      case "domingo" :
        System.out.println("No hay clase, pero puedes ponerte a programar");
        break;

    }
  }
}

