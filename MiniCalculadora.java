import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("Introduce un número entero: ");
        int a = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Introduce otro número entero: ");
        int b = sc.nextInt(); 
        sc.nextLine();
        int suma = a+b;
        sb.append(String.format("Suma: %d%n", suma));
        int resta = a-b;
        sb.append(String.format("Resta: %d%n", resta));
        int multiplicacion = a*b;
        sb.append(String.format("Multiplicacion: %d%n", multiplicacion));
        // Diviendo algo entre 0 daría un error
        if (b!=0){
            int division = a/b;
            sb.append(String.format("Division entera: %d%n", division));
            int resto = a%b;
            sb.append(String.format("Resto: %d%n", resto));
        }

        System.out.println(sb);
        sc.close();
    }

}
