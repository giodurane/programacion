/*
 * t4ej21.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Ejercicio 20:
 * 
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 * se califica como apto o no apto, por tanto se debe preguntar al usuario
 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
 * resultado de la recuperación es apto, la nota será un 5; en caso
 * contrario, se mantiene la nota media anterior.
 *
 * Ejemplo 1:
 * Nota del primer control: 7
 * Nota del segundo control: 10
 * Tu nota de Programación es 8.5
 *
 * Ejemplo 2:
 * Nota del primer control: 6
 * Nota del segundo control: 3
 * ¿Cuál ha sido el resultado de laMA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class t4ej21 {
	
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    double x;
    double y;
    double media = 0;
    int recuperacion = 0;
		System.out.println("Calcularemos tu nota media de programacion: ");
    System.out.print("Dime la nota del control 1: ");
    x = s.nextDouble();
    System.out.print("Dime la nota del control 2: ");
    y = s.nextDouble();
    System.out.println("la nota 1 es: "+x+" la nota 2 es: "+x);
    media = (x + y) /2;
    
    if (media>=5){
        System.out.println("La nota de programacion es: "+media);
    } else {
        System.out.println("¿Cuál ha sido el resultado de la recuperación?");
        System.out.println("1 apto | 2 NO APTO");
        recuperacion = s.nextInt();
      } 
    if (recuperacion == 2){
      System.out.println("Lo siento, su media sigue siendo "+media);
    } if (recuperacion == 1){
      System.out.println("Enhorabuena, ha aprobado");
      }
	}
}

