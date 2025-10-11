import java.util.Scanner;

public class NormalizadorTexto {
    public static void arreglaFrase(String frase){
        frase = frase.trim().toLowerCase();
        System.out.println(frase);
        //No entiendo muy bien el punto 3
    }
    public static void buscarPalabra(String frase, String palabra){
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();
        if(frase.contains(palabra)){
            System.out.printf("La frase introducida contiene '%s'", palabra);
        }else{
            System.out.printf("La frase introducida no contiene '%s'", palabra);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un frase para arreglar: ");
        String frase1 = sc.nextLine();
        arreglaFrase(frase1);

        System.out.print("introduce una frase: ");
        String frase2 = sc.nextLine();
        System.out.print("introduce una palabra para buscarla: ");
        String palabra = sc.nextLine();
        buscarPalabra(frase2, palabra);
        sc.close();
    }

}
