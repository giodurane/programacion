public class C06Ejercicio13 {
  public static void main (String [] args){
    int dado1 = 0;
    int dado2 = 0;
    do {
      dado1 = (int)((Math.random() * 6) + 1);
      dado2 = (int)((Math.random() * 6) + 1);
    }while ( dado1 != dado2 );
    System.out.println(dado1);
    System.out.println(dado2);
  }
}
