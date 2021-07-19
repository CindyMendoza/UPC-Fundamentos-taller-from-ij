import java.util.Locale;

public class balotarioCadena1 {


    private static String evaluarTextoCifrado(String texto, int numeroSalto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            int decimalDelCaracter = texto.charAt(i);
            if (decimalDelCaracter == 32) {
                decimalDelCaracter = (decimalDelCaracter + 0);
            } else {
                decimalDelCaracter = (decimalDelCaracter + numeroSalto);
            }
            if (Character.isLowerCase(texto.charAt(i))) {
                if (decimalDelCaracter == 32) {
                    decimalDelCaracter = (decimalDelCaracter);
                } else if (decimalDelCaracter >= 122) {
                    decimalDelCaracter = (decimalDelCaracter - 26);

                } else if (decimalDelCaracter <= 97) {
                    decimalDelCaracter = (decimalDelCaracter + 26);
                }
            } else {
                if (decimalDelCaracter == 32) {
                    decimalDelCaracter = (decimalDelCaracter);
                } else if (decimalDelCaracter >= 90) {
                    decimalDelCaracter = (decimalDelCaracter - 26);

                } else if (decimalDelCaracter <= 65) {
                    decimalDelCaracter = (decimalDelCaracter + 26);
                }
            }
            resultado = resultado + (char) decimalDelCaracter;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(evaluarTextoCifrado("A", 3));
        System.out.println(evaluarTextoCifrado("UN TEXTO", 3));
    }
}
