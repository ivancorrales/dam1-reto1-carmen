import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        if (a<0){
            System.out.println("Es negativo");
        }
        sc.close();
    }

}
