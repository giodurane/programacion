/*
 * t4ej23.java
 * 
 * Copyright 2021 Mario Giovanny Duran Eyzaguirre <mario.duran.alu@iescampanillas.com>
 * 
 * T4 ejercicio 23
 * 
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. 
 * 
 * Los tipos de IVA:
 * - general 21%
 * - reducido 10%
 * - superreducido 4%
 
 * Los códigos promocionales pueden ser:
 * nopro: no se aplica promoción
 * mitad: el precio se reduce a la mitad
 * meno5: se descuentan 5 euros
 * por5: se descuenta el 5%. 
 * 
 * El ejercicio se da por bueno si se muestran los valores correctos, 
 * aunque los números no estén tabulados.
 * 
 */

import java.util.Scanner;
public class t4ej23 {
	
	public static void main (String[] args) {
  Scanner s = new Scanner(System.in);
  double precioBase, desel=0, precioFinal=0,precioConIva=0;
  int iva, descuento;
  System.out.print("Introduce el precio base del producto: ");
  precioBase = s.nextDouble();
  System.out.print("\nIVA correspondiente \n(1) 21% (2) 10% (3) 4% \n\nSELECCIONE:");
  iva = s.nextInt();
  switch (iva){
    case 1:
      iva = 21;
      break;
    case 2:
      iva = 10;
      break;
    case 3:
      iva = 4;
    }
    precioConIva= precioBase + (precioBase* iva/100);
  System.out.print("\nSeleccione el descuento: \n(1) no se aplica promocion\n(2) El precio se reduce a la mitad \n(3) Se descuentan 5 euros \n(4) Se descuenta el 5% \n\nSELECCIONE:  ");
  descuento = s.nextInt();
    switch (descuento){
    case 1:
      break;
    case 2:
      desel= precioBase/2;
      break;
    case 3:
      desel = 5;
      break;
    case 4:
      desel = precioBase*5/100;
    }
  precioFinal= precioConIva-desel;
  System.out.println("\nBase imponible:     "+precioBase);
  System.out.println("IVA:                 "+iva +"%");
  System.out.println("Precio con IVA:     "+precioConIva);
  System.out.println("Cod. promocional:    "+descuento);
  System.out.println("descontado:          "+desel);
  System.out.println("TOTAL:              "+precioFinal);
  }
}























