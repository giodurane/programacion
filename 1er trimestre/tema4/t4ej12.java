/*
 * t4ej12.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * 4. Sentencia Condicional
 *
 * 12. Realiza un minicuestionario con 3 preguntas tipo test sobre las
 * asignaturas que se imparten en el curso. Cada pregunta acertada
 * sumará un punto. El programa mostrará al final la califcación
 * obtenida. Pásale el minicuestionario a tus compañeros y pídeles
 * que lo hagan para ver qué tal andan de conocimientos en las
 * diferentes asignaturas del curso.
 * 
 */

import java.util.Scanner;
public class t4ej12 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int puntos = 0;
    int calificacion;
    int respuesta;
    System.out.println("JUEGO:");
    System.out.println("");
    System.out.println("1pto por cada respuesta correcta.");
    System.out.println("Las respuestas correctas tienen premio.");
    System.out.println("");
    System.out.println("A: ¿Cual fue la temporada del EUROMalaga en Champions?");
    System.out.println("1) ano 1932");
    System.out.println("2) temporada2012/2013");
    System.out.println("3) No te acuerdas ni tu Hulio...");
    System.out.print("respuesta: ");
    respuesta = s.nextInt();
    
    if (respuesta == 2){
      System.out.println("Correcto!");
      puntos++;
    } else {
          System.out.println("La respuesta es incorrecta");
      }
    System.out.println("B: ¿cuando consiguio el Unicaja Baloncesto el titulo de campeon de liga?");
    System.out.println("");
    System.out.println("1) temporada 2005/2006");
    System.out.println("2) temporada 2016/2017");
    System.out.println("3) No te acuerdas ni tu Hulio...");
    System.out.print("respuesta: ");
    respuesta = s.nextInt();
    
    if (respuesta == 1){
      System.out.println("Correcto!");
      puntos++;
    } else {
          System.out.println("La respuesta es incorrecta");
      }
    System.out.println("Has sumado "+puntos+" puntos.");
    System.out.println("");
    System.out.print("Enhorabuena!");
	}
}

