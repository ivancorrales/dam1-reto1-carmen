import java.util.Scanner;

public class EdadRestante{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        if(edad<0){
            System.out.println("Edad no válida");
            System.exit(1);
        }
        int tiempo = Math.abs(100-edad);
        if(edad>=100){
            System.out.printf("Ya has llegado a los 100 años, tienes %d años más de 100.%n", tiempo);
        }else{
            System.out.printf("Te faltan %d años para llegar a los 100.%n", tiempo);
        }
        sc.close();
    }
}