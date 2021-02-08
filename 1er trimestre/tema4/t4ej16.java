/*
 * t4ej16.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * 
 */

import java.util.Scanner;

public class t4ej16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int respuesta;
    int verdadero = 0;
    int falso = 0;

    System.out.println("Test de Fidelidad. PREGUNTAS");
    System.out.println(" ");
    System.out.println("A. Tu pareja parece estar mas inquieta de lo normal sin motivo aparente?");
    System.out.println("responde con (1) Verdadero o (2)falso");
    respuesta = s.nextInt();
    if ((respuesta == 1) || (respuesta == 2)) {
      if (respuesta == 1) {
        verdadero += +3;
        falso++;
      }
    } else {
      System.out.println("lo siento, no es una respuesta correcta.");
    }

    System.out.println("\n ");
    System.out.println("B. Tu pareja ha aumentado su gasto en vestuario?");
    System.out.println("responde con (1) Verdadero o (2)falso");
    respuesta = s.nextInt();
    if ((respuesta == 1) || (respuesta == 2)) {
      if (respuesta == 1) {
        verdadero += +3;
      } else {
        falso++;
      }
    } else {
      System.out.println("lo siento, no es una respuesta correcta.");
    }
    System.out.println("\n ");
    System.out.println("C. Ha perdido el interés que mostraba anteriormente por ti?");
    System.out.println("responde con (1) Verdadero o (2)falso");
    respuesta = s.nextInt();
    if ((respuesta == 1) || (respuesta == 2)) {
      if (respuesta == 1) {
        verdadero += +3;
      } else {
        falso++;
      }
    } else {
      System.out.println("lo siento, no es una respuesta correcta.");
    }
    System.out.println("\n ");
    System.out.println(
        "D. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    System.out.println("responde con (1) Verdadero o (2)falso");
    respuesta = s.nextInt();
    if ((respuesta == 1) || (respuesta == 2)) {
      if (respuesta == 1) {
        verdadero += +3;
      } else {
        falso++;
      }
    } else {
      System.out.println("lo siento, no es una respuesta correcta.");
    }

    System.out.println("\n ");
    System.out.println("E. No te deja que mires la agenda de su teléfono móvil");
    System.out.println("responde con (1) Verdadero o (2)falso");
    respuesta = s.nextInt();
    if ((respuesta == 1) || (respuesta == 2)) {
      if (respuesta == 1) {
        verdadero += +3;
      } else {
        falso++;
      }
    } else {
      System.out.println("lo siento, no es una respuesta correcta.");
    }
    System.out.println("\n ");
    System.out.println("F. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    System.out.println("responde con (1) Verdadero o (2)falso");
    respuesta = s.nextInt();
    if ((respuesta == 1) || (respuesta == 2)) {
      if (respuesta == 1) {
        verdadero += +3;
      } else {
        falso++;
      }
    } else {
      System.out.println("lo siento, no es una respuesta correcta.");
    }
    System.out.println("\n ");
    System.out.println("G. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    System.out.println("responde con (1) Verdadero o (2)falso");
    respuesta = s.nextInt();
    if ((respuesta == 1) || (respuesta == 2)) {
      if (respuesta == 1) {
        verdadero += +3;
      } else {
        falso++;
      }
    } else {
      System.out.println("lo siento, no es una respuesta correcta.");
    }
    System.out.println("\n ");
    System.out.println("H. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
    System.out.println("responde con (1) Verdadero o (2)falso");
    respuesta = s.nextInt();
    if ((respuesta == 1) || (respuesta == 2)) {
      if (respuesta == 1) {
        verdadero += +3;
      } else {
        falso++;
      }
    } else {
      System.out.println("lo siento, no es una respuesta correcta.");
    }
    System.out.println("\n ");
    System.out.println("I. Has notado que últimamente se perfuma más");
    System.out.println("responde con (1) Verdadero o (2)falso");
    respuesta = s.nextInt();
    if ((respuesta == 1) || (respuesta == 2)) {
      if (respuesta == 1) {
        verdadero += +3;
      } else {
        falso++;
      }
    } else {
      System.out.println("lo siento, no es una respuesta correcta.");
    }
    System.out.println("\n ");
    System.out.println("J. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.println("responde con (1) Verdadero o (2)falso");
    respuesta = s.nextInt();
    if ((respuesta == 1) || (respuesta == 2)) {
      if (respuesta == 1) {
        verdadero += +3;
      } else {
        falso++;
      }
    } else {
      System.out.println("lo siento, no es una respuesta correcta.");
    }

    System.out.println("\nHa sumado " + verdadero + " respuestas verdaderas, y " + falso + " respuestas falsas\n");

  if ((verdadero>=0)&&(verdadero<=10)){
  System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel."); 
  } if ((verdadero>10) && (verdadero<=22)){ 
    System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");     
    } if ((verdadero>21) && (verdadero<=30)){ 
    System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
  }
}
