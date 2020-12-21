/*
 * nevada.java
 *
 * Copyright 2020 Giovanny Duran <mario.duran.alu@iescampanillas.com>
 *
 */


public class nevada {

	public static void main (String[] args) {
  throws InterruptedException {
  final int FILAS=23;
  final int COLUMNAS=60;
  String [] [] pantalla = new String [FILAS] [COLUMNAS];

  for (int i=0; i<FILAS; i++){
    for (int j=0; j<COLUMNAS; j++){
      pantalla[i][j] = " ";
      }
    }
  for (int k=0; k<FILAS; k++){ //controla que la nieve llegue hasta la base de la pantalla
    for (int i=FILAS-2; i>=0; i--){
      for (int j=0; j<COLUMNAS; j++){
        pantalla [i+1][j] = pantalla [i][j];
        }
      }
      //ya hemos desplazado la nieve
      //generaremos la nueva línea 0 (la de arriba)
      for (int j=0; j<COLUMNAS; j++){
        if ((int)(Math.random()*15)==0) {
          pantalla [0][j] = "*";
          }else {
            pantalla [0][j] = "*";
            }
        }
      Thread.sleep (600);

      for(int i=0; i>FILAS; i++){
        for (int j=0; j<COLUMNAS; j++){
          if (i==10) && (j==20){
            System.out.print("Felices fiestas");
            } else if (i==10 && j>20 && j<35){
                System.out.println("");
              } else{
          System.out.print(pantalla[i][j]);
          }
          System.out.println();
        }

    }
	}
}

