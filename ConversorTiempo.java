public class ConversorTiempo {
    public static void conversor(int minutos){
        int resultadoHoras = minutos/60;
        int resultadoMinutos = minutos%60;
        if(resultadoHoras == 1){
            if(resultadoMinutos == 1){
                System.out.printf("%d minutos equivalen a %d hora y %d minuto", minutos, resultadoHoras, resultadoMinutos);
            }else{
                System.out.printf("%d minutos equivalen a %d hora y %d minutos", minutos, resultadoHoras, resultadoMinutos);
            }
        }else{
            if(resultadoMinutos == 1){
                System.out.printf("%d minutos equivalen a %d horas y %d minuto", minutos, resultadoHoras, resultadoMinutos);
            }else{
                System.out.printf("%d minutos equivalen a %d horas y %d minutos%n", minutos, resultadoHoras, resultadoMinutos);
            }
        }
    }
    public static void conversor(int horas, int minutos){
        if(minutos > 59){
            int conversion = minutos/60;
            int resultadoMinutos = minutos%60;
            horas = horas + conversion;
            System.out.printf("El resultado normalizado de %d horas y %d minutos es %d horas y %d minutos", (horas - conversion), minutos, horas, resultadoMinutos);
        }else{
            System.out.println("No se puede normalizar ya que los hay menos de 59 minutos");
        }
    }
    public static void main(String[] args) {
        conversor(2);
        conversor(1, 70);
    }

}
