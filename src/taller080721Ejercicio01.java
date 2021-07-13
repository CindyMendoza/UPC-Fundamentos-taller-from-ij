import java.util.Scanner;

public class taller080721Ejercicio01 {
    static String codigos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args)
    {
        String letra_buscada = "UN TEXTO";
        String resultado_final = "";
        int posicion_avance = 3;

        for(int i=0; i < letra_buscada.length(); i++)
        {
            resultado_final += buscar_letra(letra_buscada.substring(i,i+1), posicion_avance);
        }

        System.out.println("'" + resultado_final + "'");
    }

    static String buscar_letra(String letra_buscada, int posicion_avance)
    {
        String resultado = "";
        int posicion_adicional;

        for(int i=0; i < codigos.length(); i++)
        {
            if (codigos.substring(i, i + 1).equals(letra_buscada))
            {
                if(i+posicion_avance >= codigos.length())
                {
                    posicion_adicional = i + posicion_avance - codigos.length();
                    resultado = codigos.substring(posicion_adicional, posicion_adicional + 1);
                }
                else
                    resultado = codigos.substring(i + posicion_avance, i + 1 + posicion_avance);
            }
        }

        if(resultado.equals(""))
            resultado = letra_buscada;

        return resultado;
    }
}
