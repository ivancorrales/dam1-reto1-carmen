import java.util.Scanner;

public class EdadRestante{
    public static int Hasta100(int edad){
        return 100-edad;
    }
    public static int Desde100(int edad){
        return edad-100;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        int resultado = Hasta100(edad);
        if(edad<0){
            System.out.println("Edad no válida");
        }else{
            if(edad>=100){
                int pasado100 = Desde100(edad);
                System.out.printf("Ya has llegado a los 100 años, tienes %d años más de 100", pasado100);
            }else{
                System.out.printf("Te faltan %d años para llegar a los 100.", resultado);
            }
        }
        sc.close();
    }
}