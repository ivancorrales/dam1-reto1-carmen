import java.util.Scanner;

public class ClasificadorCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca tu nota: ");
        double nota = sc.nextDouble();

        if (nota<0 || nota>10){
            System.out.println("Nota no válida");
        }else{
            if(nota== 0 && nota<=4.9){
                System.out.println("Suspenso");
            }
            if(nota>=5 && nota<=6.9){
                System.out.println("Aprobado");
            }
            if(nota>=7 && nota<=8.9){
                System.out.println("Notable");
            }
            if(nota>=9 && nota<=10){
                System.out.println("Sobresaliente");
                if(nota>=9.5){
                    System.out.println("Matricula de honor");
                }
            }
        }
        
        sc.close();
    }

}
