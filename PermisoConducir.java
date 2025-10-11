import java.util.Scanner;

public class PermisoConducir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        boolean edadValida = edad >= 0 && edad < 120;
        if (!edadValida){
            System.out.println("Edad no válida");
            // Esto hace que el programa termine
            // 0 -> Exito
            // 1 o cualer otro número se usa para indicar un error
            System.exit(1);
        }
        sc.nextLine();
        System.out.print("¿Tienes carnet de conducir? ");
        String carnet = sc.nextLine();
        carnet = carnet.toLowerCase();
        boolean carnetValido = carnet.equals("si")
                || carnet.equals("no") ;
        if (!carnetValido){
            System.out.println("Respuesta no válida");
            System.exit(2);
        }
        boolean tieneCarnet = carnet.equals("si");
        if (edad<18){
            System.out.println("No puedes conducir porque eres menor de edad");

        }else  if (!tieneCarnet){
            System.out.println("No puedes conducir porque no tienes carnet");
        } else {
            System.out.println("Puedes conducir");
        }

        sc.close();
    }

}
