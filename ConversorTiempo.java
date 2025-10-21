public class ConversorTiempo {

    private static void mostrarHorasYMinutos(int input, int horas, int minutos) {
        String textHoras = "hora";
        if (horas!=1) {
            textHoras = "horas";
        }
        String textMinuto = "minuto";
        if (minutos!=1) {
            textMinuto = "minutos";
        }
        System.out.printf("%d minutos equivalen a %d %s y %d %s.%n", input, horas, textHoras, minutos, textMinuto);
    }

    public static void conversor(int minutos) {
        conversor(0,minutos);
    }

    public static void conversor(int horas, int minutos) {
        int conversion = minutos / 60;
        int resultadoMinutos = minutos % 60;
        horas = horas + conversion;
        mostrarHorasYMinutos(minutos, horas, resultadoMinutos);
    }

    public static void main(String[] args) {
        conversor(2);
        conversor(62);
        conversor(1, 70);
        conversor(0, 61);

    }

}
