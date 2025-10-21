import java.util.Scanner;

public class AnalisisNombre {

    static boolean empiezaConVocal(String palabra) {
        return palabra != null && palabra.matches("^(?i)[aeiouáéíóúü].*");
    }
    public static void analizar(String palabra){
        palabra = palabra.trim();
        int longitud = palabra.length();
        System.out.printf("La palabra introducida tiene %d caracteres.%n", longitud);
        System.out.println("La primera letra de la palabra introducida es: "+ palabra.charAt(0));
        System.out.println("La última letra de la palabra introducida es: " + palabra.charAt(longitud-1));
        palabra = palabra.toLowerCase();
        if(empiezaConVocal(palabra)){
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
