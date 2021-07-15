import java.util.Arrays;

public class balotarioArray6 {

    private static int arr[] = {80, 500, 120, 1000, 100, 1000, 230, 50, 300, 4};

//    //    private static int arr2[] = {};
//    static int[] retornaArray(int[] arr, int length) {
//
//        return arr;
//    }
//    static int[] retornaArray(int[] arr, int length) {
//
//        return arr;
//    }
    static String determinarPartidario(int[] arr) {
        String esPartidario = "No es partidario";
        boolean estado = false;
        int[] par = new int[arr.length];
        int[] inpar = new int[arr.length];
        int contadorPar = 0;
        String acumuladorPar="";
        int contadorInpar = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 ) {
//                contadorPar++;
//                int[] par = new int[contadorPar];
                par[i] = arr[i];
//                acumuladorPar+=Integer.toString(arr[i])+";";
//                System.out.println(Arrays.toString(par));
//                System.out.println(acumuladorPar);
            } else {
//                contadorInpar++;
//                int[] inpar = new int[contadorInpar];
                inpar[i] = arr[i];
//                System.out.println(Arrays.toString(inpar));
            }
        }
        arrFunction(par);
        arrFunction(inpar);
        System.out.println(Arrays.toString(arrFunction(par)));
        System.out.println(Arrays.toString(arrFunction(inpar)));

        int[] newPar = arrFunction(par);
        int[] newInpar = arrFunction(inpar);
        System.out.println(Arrays.toString(newPar));
        System.out.println(Arrays.toString(newInpar));
        for (int i = 0; i < par.length; i++) {
//            for (int j = 0; j < inpar.length; j++) {
//            System.out.println(Arrays.toString(inpar));
//            System.out.println(Arrays.toString(par));
            if (newPar[i] > newInpar[i]) {
                System.out.println(newPar[i]);
                System.out.println(newInpar[i]);
//                System.out.println(inpar[i]);
                estado = true;
            } else {
                estado = false;
            }
//            }

        }
//        if (estado = true){
//            esPartidario="Es partidario";
//        }
        return esPartidario;
    }
    private static int[] arrFunction(int[] array){
        int targetIndex = 0;
        for( int sourceIndex = 0;  sourceIndex < array.length;  sourceIndex++ )
        {
            if( array[sourceIndex] != 0 )
                array[targetIndex++] = array[sourceIndex];
        }
        int[] newArray = new int[targetIndex];
        System.arraycopy( array, 0, newArray, 0, targetIndex );
        return newArray;
    }
    public static void main(String[] args) {

        System.out.println(determinarPartidario(arr));
//        int targetIndex = 0;
//        for( int sourceIndex = 0;  sourceIndex < array.length;  sourceIndex++ )
//        {
//            if( array[sourceIndex] != 0 )
//                array[targetIndex++] = array[sourceIndex];
//        }
//        int[] newArray = new int[targetIndex];
//        System.arraycopy( array, 0, newArray, 0, targetIndex );
//        return newArray;

//        System.out.println("arrFunction:"+Arrays.toString(arrFunction(arr)));
//        System.out.println("oldItems"+Arrays.toString(oldItems));
//        System.out.println(determinarPartidario(arr2));
    }
}
