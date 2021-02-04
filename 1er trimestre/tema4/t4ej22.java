/*
 * t4ej22.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * Tema 4: Ejercicio 22
 * 
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 * 
 */

import java.util.Scanner;
public class t4ej22 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    int dia, hora, min;
    int mintotal;
    int minactual;
    System.out.println("¿Qué día es hoy?");
    System.out.println("0 lunes");
    System.out.println("1 martes");
    System.out.println("2 miercoles");
    System.out.println("3 jueves");
    System.out.println("4 viernes");
    dia = s.nextInt();
    
    System.out.println("Indique la hora (formato 24hs): ");
    hora = s.nextInt();
    
    System.out.print("Indique los minutos: ");
    min = s.nextInt();
    
    int esViernesEnMinutos= 4*24*60+(15*60);
    int minActual = (dia * 24* 60) + (hora*60)+ min;
    
    System.out.println("faltan "+(esViernesEnMinutos-minActual)+"minutos para las 15hs del viernes");   
	}
}

