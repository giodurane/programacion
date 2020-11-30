/*
 * 7arrayBi2.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 *
 *
 */


public class t7arrayBi2 {

public static void main(String[] args)
throws InterruptedException { // Se añade esta línea para poder usar sleep
  int fila, columna;
  int[][] n = {{20, 4}, {67, 33}, {0,7}};

  for(fila = 0; fila < 3; fila++) {
    System.out.print("Fila: " + fila);

    for(columna = 0; columna < 2; columna++) {
      System.out.printf("%10d ", n[fila][columna]);
      Thread.sleep(1000); // retardo de un segundo
    }
    System.out.println();
  }
}
}
