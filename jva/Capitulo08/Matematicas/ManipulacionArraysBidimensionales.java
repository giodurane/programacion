package Matematicas;
import Matematicas.ManipulacionArraysUnidimensionales;
public class ManipulacionArraysBidimensionales{
  /*  
   * Crea un Array bidimensional de las filas y columnas deseadas, además de 
   * rellenarla con números aleatorios dentro del mínimo y máximo valor introducido
   * por el usuario.
   * @param rows            Columnas que tendrá el Array bidi
   * @param columns         Filas que tendrá el Array bidi
   * @param minInterval     Valor máximo que contendrá el Array bidi
   * @param maxInterval     Valor mínimo que contendrá el Array bidi
   * @return                int[][] con el size y valores establecidos por el usuario
  */
  public static int[][] generaArrayBiInt(int rows, int columns, int minInterval, int maxInterval){
    int[][] arr = new int[rows][columns];
    for(int i=0; i<rows; i++){
      for(int j=0; j<columns; j++){
        arr[i][j] = (int)(Math.random() * (maxInterval + 1 - minInterval) + minInterval);
      }
    }
    return arr;
  }
  
  /*  
   * Devuelve la fila que se indica del Array bidi como parámetro
   * @param int[][]         Array bidimensional que introduce el usuario
   * @param rowDeseada      Fila que se desea obtener del Array bidi
   * @return                int[] con la fila deseada por el usuario 
  */
  public static int[] filaDeArrayBiInt(int[][] arr, int rowDeseada){
    int[] arrResult = new int[arr[0].length];
    for(int i=0; i<arr[0].length; i++){
      arrResult[i] = arr[rowDeseada][i];
    }
    return arrResult;
  }
  
  /*  
   * Devuelve la columna que se indica del Array bidi como parámetro
   * @param int[][]         Array bidimensional que introduce el usuario
   * @param columnDeseada   Columna que se desea obtener del Array bidi
   * @return                int[] con la columna deseada por el usuario 
  */
  public static int[] columnaDeArrayBiInt(int[][] arr, int columnDeseada){
    int[] arrResult = new int[arr.length];
    for(int i=0; i<arr.length; i++){
      arrResult[i] = arr[i][columnDeseada];
    }
    return arrResult;
  }
  
  /*  
   * Devuelve la posición de el número indicado dentro de un array bidi
   * si el número no es encontrado se devuelve {-1,-1}
   * @param int[][]         Array bidimensional que introduce el usuario
   * @param numDeseado      Número introducido a buscar dentro del array bidi
   * @return                Array unidimensional con la posición del número, si no se encuentra {-1,-1} 
  */
  public static int[] coordenadasEnArrayBiInt(int[][] arr, int numeroDeseado){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        if(arr[i][j] == numeroDeseado){
          int[] pos = {i,j};
            return pos;
          }  
        //return "{" + i + "," + j + "}";
      }
    }
    int[] pos = {-1, -1};
    return pos;
  }
  
  /*  
   * Devuelve true si el número introducido es mínimo en su fila y máximo
   * en su columna(punto de silla).
   * @param int[][]         Array bidimensional que introduce el usuario
   * @param filaNumero      Indica la fila del número seleccionado
   * @param columnaNumero   Indica la columna del número seleccionado
   * @return                Boolean indicando si el número es punto de silla o no 
  */
  public static boolean esPuntoDeSilla(int[][] arr, int filaNumero, int columnaNumero){
    int[] row = Matematicas.ManipulacionArraysBidimensionales.filaDeArrayBiInt(arr, filaNumero);
    int[] column = Matematicas.ManipulacionArraysBidimensionales.columnaDeArrayBiInt(arr, columnaNumero);
    return ((Matematicas.ManipulacionArraysUnidimensionales.minimoArrayInt(row) == arr[filaNumero][columnaNumero]) &&
            (Matematicas.ManipulacionArraysUnidimensionales.maximoArrayInt(column) == arr[filaNumero][columnaNumero]));
            
  }
  
  /*  
   * Devuelve un Array con una de las diagonales del Array bidi introducido, 
   * partiendo desde la columna y fila indicada por el usuario y 
   * el input dirección que puede ser nose(noroeste hasta sureste) o neso
   * (noreste hasta suroeste)
   * @param int[][]         Array bidimensional que introduce el usuario
   * @param filaNumero      Indica la fila del número seleccionado
   * @param columnaNumero   Indica la columna del número seleccionado
   * @param direccion       Indica la dirección de la diagonal
   * @return                Array con la diagonal seleccionada 
  */
  public static int[] diagonal(int[][] arr, int filaNumero, int columnaNumero, String direccion){
    int counter = 0;
    int maxArraySize = arr.length; 
    if(arr[0].length < arr.length){
      maxArraySize = arr[0].length;
    }else if(arr[0].length > arr.length){
      maxArraySize = arr.length;
    }
    
    int[] aux = new int[maxArraySize];
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        if((filaNumero - i == columnaNumero - j && direccion.equals("nose")) ||
        (i - filaNumero == columnaNumero - j && direccion.equals("neso"))){
          aux[counter++] = arr[i][j];
        }
      }
    }
    int[] result = new int[counter];
    for(int i=0; i<counter; i++){
      result[i] = aux[i];
    }
    return result;
  }
  
  /*
   * Esta función nos devuelve el número correspondiente a la posición del Array
   * bidi que introduzcamos(introducimos la posición como si de un Array uni-
   * dimensional)
   * 
   * @param n                 Array como input
   * @param posicion          Posición que deseamos del Array bidi
   * @return                  Número del Array que contiene la posición indicada.
  */
  public static int nEsimo(int[][] n, int posicion){
    if(posicion < (n[0].length + n.length)){
      return n[posicion/(n[0].length)][posicion%(n[0].length)];
    }else{
      return -1;
    }
  }
}
