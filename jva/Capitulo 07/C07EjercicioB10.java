public class C07EjercicioB10{
  public static void main (String [] args){
    final int ROWS = 3;
    final int COLUMNS = 3;
    String[][] arr = new String[ROWS][COLUMNS];
    for(int i=0;i<ROWS;i++){
        for(int j=0;j<COLUMNS;j++){
          arr[i][j] = " ";
        }
      }
    boolean winner = false;
    int counter = 0;
    int rowInput = 0;
    int columnInput = 0;
    int winnerCheckX = 0;
    int winnerCheckO = 0;
    do{
      //Table print + userInput
      System.out.print("┌─┬─┬─┐\n");
      for(int i=0;i<ROWS;i++){
        for(int j=0;j<COLUMNS;j++){
          System.out.print("|" + arr[i][j]);
        }
        System.out.print("|");
        if(i!=2){
          System.out.print("\n├─┼─┼─┤");
        }else{
          System.out.print("\n└─┴─┴─┘");
        }
        System.out.println();
      }
      if( counter % 2 == 0){
        System.out.print("Introduzca la fila donde quiere colocar ficha: ");
        rowInput = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la columna donde quiere colocar ficha: ");
        columnInput = Integer.parseInt(System.console().readLine());
        arr[rowInput][columnInput] = "X";
      }else{
        //PC
        int fila = 0;
        int columna = 0;
        //Respuesta PC
        do{
          fila = (int)(Math.random()* 3);
          columna = (int)(Math.random()* 3);
        }while(arr[fila][columna] == "X" || arr[fila][columna] == "O");
        arr[fila][columna] = "O";
      }
      //Winner checking horizontal
      for(int i=0;i<ROWS;i++){
        winnerCheckX = 0;
        winnerCheckO = 0;
        for(int j=0;j<COLUMNS;j++){
          if(arr[i][j] == "X"){
            winnerCheckX++;
          }else if(arr[i][j] == "O"){
            winnerCheckO++;
          }
        }
        if(winnerCheckX == 3){
          System.out.println("Has ganado, enhorabuena.");
          winner = true;
        }else if(winnerCheckO == 3){
          System.out.println("El ordenador ha ganado.");
          winner = true;
        }
      }//Fin bloque horizontal
      
      //Check bloque vertical
      for(int i=0;i<ROWS;i++){
        winnerCheckX = 0;
        winnerCheckO = 0;
        for(int j=0;j<COLUMNS;j++){
          if(arr[j][i] == "X"){
            winnerCheckX++;
          }else if(arr[j][i] == "O"){
            winnerCheckO++;
          }
        }
        if(winnerCheckX == 3){
          System.out.println("Has ganado, enhorabuena.");
          winner = true;
        }else if(winnerCheckO == 3){
          System.out.println("El ordenador ha ganado.");
          winner = true;
        }
      }//Fin bloque vertical
      
      //Check bloque diagonal
      if((arr[0][0] == "X" && arr[1][1] == "X" && arr[2][2] == "X") || (arr[0][2] == "X" && arr[1][1] == "X" && arr[2][0] == "X")){
        System.out.println("Has ganado, enhorabuena.");
        winner = true;
      }else if((arr[0][0] == "O" && arr[1][1] == "O" && arr[2][2] == "O") || (arr[0][2] == "O" && arr[1][1] == "O" && arr[2][0] == "O")){
        System.out.println("Has ganado, enhorabuena.");
        winner = true;
      } 
      //Fin bloque diagonal
      counter++;
    }while(!winner && counter <9);
    
    System.out.print("┌─┬─┬─┐\n");
      for(int i=0;i<ROWS;i++){
        for(int j=0;j<COLUMNS;j++){
          System.out.print("|" + arr[i][j]);
        }
        System.out.print("|");
        if(i!=2){
          System.out.print("\n├─┼─┼─┤");
        }else{
          System.out.print("\n└─┴─┴─┘");
        }
        
        System.out.println();
      }
  }
}
