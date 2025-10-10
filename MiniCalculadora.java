import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int a = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Introduce otro número entero: ");
        int b = sc.nextInt(); 
        sc.nextLine();
        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;
        int division = a/b;
        int resto = a%b;
        System.out.printf("Suma: \t\t\t%d%nResta: \t\t\t%d%nMultiplicación: \t%d%nDivisión entera: \t%d%nResto: \t\t\t%d%n", suma, resta, multiplicacion, division, resto);
        sc.close();
    }

}
