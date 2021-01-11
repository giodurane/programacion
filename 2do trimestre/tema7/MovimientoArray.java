public class MovimientoArray {
	
	public static void main (String[] args) {
    final int FILAS =5;
    final int COLUMNAS =6;
    final int MINIMO =23;
    final int MAXIMO =78;
  	int [][] original = new int [FILAS][COLUMNAS];
    
    for (int i=0; i<FILAS; i++){
      for (int j=0; j<COLUMNAS; j++){
        original[i][j] = (int)(Math.random()*(MAXIMO-MINIMO+1))+MINIMO;
      }
    }
    
    System.out.println();
    for (int i=0; i<FILAS; i++){
      for (int j=0; j<COLUMNAS; j++){
        System.out.printf("%3d", original[i][j]);
      }
      System.out.println();
    }
    //rotación por filas
    int [][] auxiliar1 = new int [FILAS][COLUMNAS];
    for (int i=0; i<FILAS; i++){
      for (int j=0; j<COLUMNAS-1;j++){
        auxiliar1[i][0] = original[i][COLUMNAS-1];
      }
    
    System.out.println();
    for (int i=0; i=FILAS; i++){
      for (int j=0; j<COLUMNAS; j++){
        System.out.printf("%3d", auxiliar1[i][j]);
      }
      System.out.println();
    }
    
    }
    rotación por columnas
    int [][] auxiliar2 = new int [FILAS][COLUMNAS];
    for (int i=0; i<COLUMNAS-1; i++){
      for (int j=0; j<FILAS;j++){
        auxiliar2[j][i+1] = original[j][i];
      }
    }    
    for (int i=0; i=FILAS; i++){
      auxiliar2[i][0] = original [i][COLUMNAS-1];
    }
    
    System.out.println();
    for (int i=0; i<FILAS; i++){
      for (int j=0; j<COLUMNAS;j++){
        System.out.printf("%3d", auxiliar2[i][j]);
      }
      System.out.println();
    }
    
    }
  }



