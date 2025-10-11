import java.util.Scanner;

public class ClasificadorCalificaciones {

    //
    // comprobaciones innecesarias: Esto no lo sabéis aún pero con tu código piensa cuantas "comprobaciones" se hacen
    // si la nota es  menor que 1
    // Error si la nota es menor que 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca tu nota: ");
        double nota = sc.nextDouble();

        if (nota<0 || nota>10){
            System.out.println("Nota no válida");
            System.exit(1);
        }else{
            if(nota < 5){
                System.out.println("Suspenso");
            } else if(nota < 7){
                System.out.println("Aprobado");
            } else if(nota < 9){
                System.out.println("Notable");
            } else{
                System.out.println("Sobresaliente");
                if(nota>=9.5){
                    System.out.println("Matricula de honor");
                }
            }
        }
        
        sc.close();
    }

}
