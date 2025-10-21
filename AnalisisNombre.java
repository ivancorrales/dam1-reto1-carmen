import java.util.Scanner;

public class AnalisisNombre {
    public static void analizar(String palabra){
        palabra = palabra.trim();
        int longitud = palabra.length();
        System.out.printf("La palabra introducida tiene %d caracteres.%n", longitud);
        System.out.println("La primera letra de la palabra introducida es: "+ palabra.charAt(0));
        System.out.println("La última letra de la palabra introducida es: " + palabra.charAt(longitud-1));
        palabra = palabra.toLowerCase();
        if(palabra.charAt(0) == 'a' || palabra.charAt(0) == 'e' || palabra.charAt(0) == 'i' || palabra.charAt(0) == 'o' || palabra.charAt(0) == 'u'){
            System.out.println("La palabra introducida empieza por vocal");
        }else{
            System.out.println("La palabra introducida no empieza por vocal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce una palabra: ");
        String palabra = sc.nextLine();
        analizar(palabra);

        sc.close();
    }

}
