public class actividad3 {
    private static String nivelSatisfaccion[] = {"Totalmente insatisfecho", "Insatisfecho", "Poco satisfecho",
            "Ni satisfecho ni insatisfecho", "Satisfecho", "Muy satisfecho"};
    private static int respuestaEncuestaVentanilla01[] = {0, 1, 2, 3, 4, 5, 0, 1};
    private static int respuestaEncuestaVentanilla02[] = {2, 5, 5, 0, 1, 2, 3, 4};
    private static int respuestaEncuestaVentanilla03[] = {4, 5, 1, 1, 2, 2, 5, 5};
    private static int respuestaEncuestaVentanilla04[] = {0, 1, 2, 3, 4, 5, 0, 1};
    private static int respuestaEncuestaVentanilla05[] = {0, 1, 2, 3, 4, 5, 1, 1};
    private static String asistentes[] = {"Elena Chaves",
            "Rosalia Wu",
            "Marta Godoy",
            "Paloma Jaramillo",
            "Sagrario Carrascosa"
    };

    //a)Un método para conocer la cantidad de pacientes que contestaron la encuesta.

    private static int cantidadPacientesContestaronEncuesta(int[] array1, int[] array2, int[] array3, int[] array4,
                                                            int[] array5) {
        int sumaTotal = array1.length + array2.length + array3.length + array4.length + array5.length;

        return sumaTotal;
    }

    //    b)	Un método para hallar el nivel de satisfacción de toda el área de recepción.
    //    nivel de satisfacción que es el porcentaje de los pacientes que contestaron “4” o “5”.
    private static int totalNivelSatisfaccionPorArray(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4 || array[i] == 5) {

                contador++;
            }
        }
        return contador;
    }

    private static double nivelSatisfaccionTodaAreaRecepcion(int[] array1, int[] array2, int[] array3, int[] array4,
                                                             int[] array5) {
        int sumaSatisfaccion =
                totalNivelSatisfaccionPorArray(array1) + totalNivelSatisfaccionPorArray(array2) + totalNivelSatisfaccionPorArray(array3)
                        + totalNivelSatisfaccionPorArray(array4) + totalNivelSatisfaccionPorArray(array5);
        int totalencuestados = cantidadPacientesContestaronEncuesta(array1, array2, array3, array4, array5);
        double porcentajeSatisfaccion = 0;

        porcentajeSatisfaccion = (double) sumaSatisfaccion / totalencuestados * 100;
        return porcentajeSatisfaccion;
    }


    public static void main(String[] args) {
        System.out.println("cantidadPacientesContestaronEncuesta: " + cantidadPacientesContestaronEncuesta(respuestaEncuestaVentanilla01,
                respuestaEncuestaVentanilla02, respuestaEncuestaVentanilla03, respuestaEncuestaVentanilla04,
                respuestaEncuestaVentanilla05));

        System.out.println("nivelSatisfaccionTodaAreaRecepcion: " + nivelSatisfaccionTodaAreaRecepcion(respuestaEncuestaVentanilla01,
                respuestaEncuestaVentanilla02, respuestaEncuestaVentanilla03, respuestaEncuestaVentanilla04,
                respuestaEncuestaVentanilla05));

    }
}
