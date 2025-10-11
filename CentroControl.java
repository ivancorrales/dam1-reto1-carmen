import java.util.Scanner;

public class CentroControl {
    static Scanner sc = new Scanner(System.in);
    public static void mostrarSaludo(){
        System.out.print("Introduce tu nombre/apodo: ");
        String nombre = sc.nextLine();
        System.out.printf("Hola, bienvenid@ %s", nombre);
    }
    public static void calcularDescuento(){
        final double DESCUENTO = 0.1;
        System.out.print("Introduce el precio de un producto: ");
        double precio = sc.nextDouble();
        double precioDescontado = precio * (1 - DESCUENTO);
        System.out.printf("El precio descontado es: %.2f €", precioDescontado);
    }
    public static void evaluarTemperatura(){
        System.out.print("¿Qué temperatura hace? ");
        double temperatura = sc.nextDouble();
        if(temperatura<=15){
            System.out.println("Frío");
        } else if (temperatura<25){
            System.out.println("Templado");
        }else{
            System.out.println("Calor");
        }
    }
    public static void main(String[] args) {
        System.out.printf("=== CENTRO DE CONTROL ===%n1. Mostrar saludo%n2. Calcular descuento%n3. Evaluar temperatura%nElige una opción (1-3): ");
        int opcion = sc.nextInt();
        sc.nextLine();
        if (opcion == 1){
            mostrarSaludo();
        }else if(opcion ==2){
            calcularDescuento();
        }else  if(opcion == 3){
            evaluarTemperatura();
        }else{
            System.out.println("Opción no válida");
        }
    }
}
