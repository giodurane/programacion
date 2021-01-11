/*
 * PiedraPapelTijeraLagartoSpock.java
 *
 * Copyright 2020 Mario Giovanny Duran Eyzaguirre <gd@giodurane.com>
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


public class PiedraPapelTijeraLagartoSpock {

	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);

    String jugada1, jugada2;

    System.out.print("Jugador 1: ");
    jugada1 = s.nextline();

    System.out.print("Jugador 2: ");
    jugada2 = s.nextline();

    if (jugada1.equals(jugada2)) {
      System.out.println("Empate");
      } else {
        switch (jugada1) {
          case "piedra":
            switch (jugada2) {
              case "tijera":
              case "lagarto":
                System.out.println("Gana jugador 1");
              break;
              case "papel":
                  break;
              case "tijera":
                  break;
              case "lagarto":
                  break;
              case "spock":
                  break;

          }
        }
	}
}}

