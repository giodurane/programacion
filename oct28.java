/*
 * oct28.java
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

/*importante, buscar y entender como funciona el bucle FOR
 * WHILE	al llegar al bucle while, si es verdadera se ejecuta lo de dentro. Cuando se cumpla que es falsa, salta al siguiente bucle)
 *
 * DO-WHILE	absolutamente, hagas lo que hagas, das al menos una pasada el cuerpo de la sentencia del bucle.
 * 		repeat until
 * 		i=1;
 * 		repeat {
 *			System.out.println(i);
 *			i++;
 *			} until (i>=11);
 *			  until (i<10);
 * */
public class oct28 {

	public static void main (String[] args) {
	int numeroIntroducido = 0;
	int cuentaNumeros = 0;
	int suma = 0;

		while (numeroIntroducido>=0){
			numeroIntroducido = Integer.parseInt(System.console().readline());
			cuentaNumeros++;
			suma +=numeroIntroducido;
		}


	}
}

