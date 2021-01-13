import java.util.Scanner;
public class t5ej36 {
public static void main(String[] args) {
Scanner s = new Scanner (System.in);
System.out.print("Por favor, introduzca un número entero positivo: ");
long numeroIntroducido = s.nextLong();

// Voltea el número introducido.
long numero = numeroIntroducido;
long volteado = 0;
while (numero > 0) {
volteado = (volteado * 10) + (numero % 10);
numero /= 10;
} // while
if (volteado == numeroIntroducido) {
System.out.println("El " + numeroIntroducido + " es capicúa");
} else {
System.out.println("El " + numeroIntroducido + " no es capicúa");
}
}
}
