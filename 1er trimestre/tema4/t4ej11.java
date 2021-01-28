/*
 * t4ej11.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * 4. Sentencia Condicional
 *
 * 11. Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 * 
 */

import java.util.Scanner;
public class t4ej11 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    
    int hora;
    int min;
    
    System.out.println("Te dire cuanto falta para la media noche. ");
    System.out.print("Dime la hora (formato 24hs): ");
    hora = s.nextInt();
    System.out.print("Dime los minutos: ");
    min = s.nextInt();
    System.out.println("Dime los minutos  "+hora+("  ")+min);
    
    if ((hora<0) || (hora>25)){
      System.out.println("Lo siento, esa hora no es de este planeta");
    } if ((min<0) || (min>60)){
        System.out.println("Lo siento, esos minutos no son de este planeta");
      } else {
        int nhora = 24-hora;
        int nmin = 60-min;
        int segundos = (nhora*60*60)+(nmin*60) ;
        System.out.println("faltan "+nhora+" horas y "+nmin+" minutos para media noche");
        System.out.println("en segundos son: "+segundos+". ¡Gracias!");  
        }
	}
}

