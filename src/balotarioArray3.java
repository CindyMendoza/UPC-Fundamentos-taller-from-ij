import java.lang.reflect.Array;
import java.util.Arrays;

public class balotarioArray3 {

    private static int rptaEncuestaV01[] = {0, 1, 2, 3, 4, 4, 0, 1};
    private static int rptaEncuestaV02[] = {2, 4, 4, 0, 1, 2, 3, 4};
    private static int rptaEncuestaV03[] = {4, 4, 1, 1, 2, 2, 4, 4};
    private static int rptaEncuestaV04[] = {0, 1, 2, 3, 4, 4, 0, 1};
    private static int rptaEncuestaV05[] = {0, 1, 2, 3, 4, 4, 1, 1};
    private static String asistentes[] = {"Elena Chaves",
            "Rosalia Wu",
            "Marta Godoy",
            "Paloma Jaramillo",
            "Sagrario Carrascosa"
    };

    //a)La cantidad de pacientes que contestaron la encuesta.

    private static int cantidadPacientesEncuestados(int[] array1, int[] array2, int[] array3, int[] array4, int[] array5) {
        int sumaTotal =
                array1.length + array2.length + array3.length + array4.length + array5.length;

        return sumaTotal;
    }

    //    b) El nivel de satisfacción de toda el área de recepción.
    private static int contadorNivelSatisfaccion(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3 || array[i] == 4) {

                contador++;
            }
        }
        return contador;
    }

    private static double nivelSatisfaccionTotal(int[] array1, int[] array2, int[] array3, int[] array4,
                                                 int[] array5) {
        int sumaSatisfaccion =
                contadorNivelSatisfaccion(array1) + contadorNivelSatisfaccion(array2) + contadorNivelSatisfaccion(array3)
                        + contadorNivelSatisfaccion(array4) + contadorNivelSatisfaccion(array5);
        int totalencuestados = cantidadPacientesEncuestados(array1, array2, array3, array4, array5);
        double porcentajeSatisfaccion = 0;

        porcentajeSatisfaccion = (double) sumaSatisfaccion / totalencuestados * 100;
        return porcentajeSatisfaccion;
    }

    //c) El asistente de recepción que obtuvo el mayor nivel de satisfacción. La respuesta se entregará en
    //un arreglo de la siguiente manera: [“María Quispe”, 70.00]. Hay que considerar que no hay
    //empate y que hay solo un ganador.

    private static String[] calcularAsistenteMayorNivel(String[] asistentes) {
        String[] asistenteMayorNivel = new String[2];
        double[] catidadTotalAsistentes = new double[asistentes.length];
        double mayor = 0;
        catidadTotalAsistentes[0] = (double)contadorNivelSatisfaccion(rptaEncuestaV01) / rptaEncuestaV01.length * 100;
        catidadTotalAsistentes[1] = (double)contadorNivelSatisfaccion(rptaEncuestaV02) / rptaEncuestaV02.length * 100;
        catidadTotalAsistentes[2] = (double)contadorNivelSatisfaccion(rptaEncuestaV03) / rptaEncuestaV03.length * 100;
        catidadTotalAsistentes[3] = (double)contadorNivelSatisfaccion(rptaEncuestaV04) / rptaEncuestaV04.length * 100;
        catidadTotalAsistentes[4] = (double)contadorNivelSatisfaccion(rptaEncuestaV05) / rptaEncuestaV05.length * 100;

        for (int i = 0; i < asistentes.length; i++) {
            System.out.println(catidadTotalAsistentes[i]);
            if (catidadTotalAsistentes[i] > mayor) {

                mayor = catidadTotalAsistentes[i];
                asistenteMayorNivel[0] = asistentes[i];
                asistenteMayorNivel[1] = Double.toString(mayor);
            }

        }
        return asistenteMayorNivel;
    }

    public static void main(String[] args) {
        System.out.println(cantidadPacientesEncuestados(rptaEncuestaV01,
                rptaEncuestaV02, rptaEncuestaV03, rptaEncuestaV04,
                rptaEncuestaV05));

        System.out.println(nivelSatisfaccionTotal(rptaEncuestaV01,
                rptaEncuestaV02, rptaEncuestaV03, rptaEncuestaV04,
                rptaEncuestaV05));
        System.out.println(Arrays.toString(calcularAsistenteMayorNivel(asistentes)));
    }
}
