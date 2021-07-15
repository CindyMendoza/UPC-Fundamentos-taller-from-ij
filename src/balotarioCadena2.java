public class balotarioCadena2 {

    private static String nombres[] = {
            "Higinio Sevilla", "Higinio Sevilla", "Higinio Sevilla","Javi Herranz","Fabiola Domingo","Eloy Ribas","Ali " +
            "Cano","Alberto Villegas","Luis Cifuentes","Gertrudis Torrejon"};
    private static int edad[] = {
            28,30, 16,50,35,25,18,51,32,60};
    private static String sexo[] = {"F","M","F","F","M","F","F","M","F","M"};
    private static int documento[] = {
            10428569,25616830,45681524,54876001,65632305,48787845,87154158,10241545,43564168};

    private static int determinarHombresMayores40(String[] sexo, int[] edad) {
        int contadorHombresMayores40=0;
        for (int i = 0; i < sexo.length; i++) {
            if(sexo[i].equals("M")&& edad[i]>40){

                contadorHombresMayores40++;
            }
        }
        return contadorHombresMayores40;
    }
    private static String obtenerNombre(int numeroDocumento) {
        String nombreEncontrado = "No existe registro";
        for (int i = 0; i < documento.length; i++) {
            if(documento[i] == numeroDocumento){
                nombreEncontrado = nombres[i];
            }
        }
        return nombreEncontrado;
    }
    private static int obtenerHomonimos(String nombre) {
        int cantidadHomonimo = 0;
        for (int i = 0; i < nombres.length; i++) {
            if(nombres[i].equals(nombre)){
                cantidadHomonimo++;
            }
        }
        return cantidadHomonimo;
    }
    private static int determinarCoincidenciaEdadEnDocumento() {
        int cantidadCoincidenciaEdadEnDocumento = 0;
        for (int i = 0; i < documento.length; i++) {
            if(Integer.toString(documento[i]).contains(Integer.toString(edad[i]))){
                cantidadCoincidenciaEdadEnDocumento++;
            }
        }
        return cantidadCoincidenciaEdadEnDocumento;
    }
    public static void main(String[] args) {
        System.out.println(determinarHombresMayores40(sexo,edad));
        System.out.println(obtenerNombre(10478569));
        System.out.println(obtenerHomonimos("Higinio Sevilla"));
        System.out.println(determinarCoincidenciaEdadEnDocumento());
    }
}
