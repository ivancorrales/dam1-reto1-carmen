import java.util.Scanner;

public class PermisoConducir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("¿Tienes carnet de conducir? ");
        String carnet = sc.nextLine();
        carnet = carnet.toLowerCase();

        if(edad<0 || edad>120 || !(carnet.equals("si") || carnet.equals("no"))){
            if (edad<0 || edad>120){
                System.out.println("Edad no válida");
            }
            if(!carnet.equals("si") || !carnet.equals("no")){
                System.out.println("Respuesta no válida");
            }
        }else{
            if(edad>=18 && carnet.equals("si")){
                System.out.println("Puedes conducir");
            }else{
                if(edad<18){
                    System.out.println("No puedes conducir porque eres menor de edad");
                }
                if(!carnet.equals("si")){
                    System.out.println("No puedes conducir porque no tienes carnet");
                }
            }
        }
        sc.close();
    }

}
