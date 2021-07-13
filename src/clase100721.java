import java.util.Arrays;

public class clase100721 {

    static String[] tipos = {"Camion", "Auto", "Auto", "Bus", "Camion"};
    static String[] placas = {"APE311", "BVF240", "EPS495", "WSD588","APC221","APC227","BVF249"};
    private static String[] obtenerStickerPalcas(){
        int contadorVerde=0;
        int contadorRojo=0;
        String[] newArrayPlacas = new String[placas.length];
        for(int i=0; i<placas.length; i++){
            System.out.println(placas[i].substring(5,6).equals("7"));
            if ( placas[i].substring(5,6).equals("7") || placas[i].substring(5,6).equals("8")){
                contadorVerde++;
                newArrayPlacas[i] = placas[i];
            }else if ( placas[i].substring(5,6).equals("9") || placas[i].substring(5,6).equals("0")){
                contadorRojo++;
                newArrayPlacas[i] = placas[i];
            }
        }

        return newArrayPlacas;
    }
    public static void main(String[] args) {
//        int[] ar = {1, 2, 2, 1, 1, 3, 5, 1, 2};
//        // ARRAY ORDENADO
//        Arrays.sort(ar);
//        Arrays.sort(tipos);
////        System.out.println(Arrays.toString(tipos));
//        // ARRAY DE NUMERO DE ELEMENTOS
//        int[] arNumElementos = encontrarElementosRepetidos(ar);
////        int[] arNumElementos2 = encontrarElementosRepetidos(tipos);
//        // ARRAY DE NUMEROS NO REPETIDOS ORDENADOS
//        int[] arNoDuplicates = eliminarDuplicados(ar);
////        int[] arNoDuplicates2 = eliminarDuplicados(tipos);
//        // CONTAR NUMERO DE ELEMENTOS PARA EL ARRAY BIDIMENSIONAL
//        int contadorOnly = 0;
//        for (
//                int elemento : arNoDuplicates) {
//            if (elemento != 0)
//                contadorOnly++;
//        }
//
//        // ARRAY BIDIMENSIONAL CON EL ELEMENTO Y NUMERO DE ELEMENTOS
//        int[][] arRepetidos = new int[contadorOnly][2];
//
//        for (
//                int x = 0;
//                x < arRepetidos.length; x++)
//            for (
//                    int y = 0;
//                    y < arRepetidos[x].length; y++)
//                if (y == 0)
//                    arRepetidos[x][y] = arNoDuplicates[x];
//                else
//                    arRepetidos[x][y] = arNumElementos[x];
//
//        // IMPRIMIR ARRAY BIDIMENSIONAL
//        for (
//                int x = 0;
//                x < arRepetidos.length; x++) {
//            System.out.print("{ ");
//            for (int y = 0; y < arRepetidos[x].length; y++)
//                System.out.print("" + arRepetidos[x][y] + " ");
//            System.out.print("},");
//        }
        int contadorVerde=0;
        int contadorRojo=0;
        String[] newArrayPlacas = new String[placas.length];
        for(int i=0; i<placas.length; i++){
            System.out.println(placas[i].substring(5,6).equals("7"));
            if ( placas[i].substring(5,6).equals("7") || placas[i].substring(5,6).equals("8")){
                contadorVerde++;
                newArrayPlacas[i] = placas[i];
            }else if ( placas[i].substring(5,6).equals("9") || placas[i].substring(5,6).equals("0")){
                contadorRojo++;
                newArrayPlacas[i] = placas[i];
            }
        }
        System.out.println(Arrays.toString(obtenerStickerPalcas()));
//        return contadorVerde;
    }


    private static int[] eliminarDuplicados(int[] arOriginal) {
        int[] tempArray = new int[arOriginal.length];

        int indexJ = 0;
        for (int i = 0; i < arOriginal.length - 1; i++) {
            int elemento = arOriginal[i];
            if (elemento != arOriginal[i + 1]) {
                tempArray[indexJ++] = elemento;
            }
        }

        tempArray[indexJ++] = arOriginal[arOriginal.length - 1];

        return tempArray;
    }

    private static int[] encontrarElementosRepetidos(int[] arOriginal) {
        // ARRAY ORDENADO
        Arrays.sort(arOriginal);

        // ARRAY DE NUMERO DE ELEMENTOS
        int[] arNumElementos = new int[arOriginal.length];
        int contador = 0;
        int aux = arOriginal[0];
        int iterador = 0;
        for (int i = 0; i < arOriginal.length; i++) {
            if (aux == arOriginal[i]) {
                contador++;
            } else {
                arNumElementos[iterador] = contador;
                contador = 1;
                aux = arOriginal[i];
                iterador++;
            }

        }
        arNumElementos[iterador] = contador;
        return arNumElementos;
    }
}
