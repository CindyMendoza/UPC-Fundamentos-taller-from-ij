import java.util.Arrays;

public class ejercicio5 {
    static String [] listas = {"1", "2", "3", "B", "N"};
    static int [] votos     = {40, 46, 6, 5, 3};

    public static void main(String[] args)
    {
        int nro_votantes;
        double [] blanco_nulo = new double[2];
        String [] lista_ganadora = new String[2];
        String [] dos_listas_ganadoras = new String[4];

        nro_votantes = contar_votos();
        blanco_nulo = contar_blanco_nulo(nro_votantes);
        lista_ganadora = hallar_ganador(nro_votantes);
        dos_listas_ganadoras = hallar_listas_ganadoras(lista_ganadora, nro_votantes);

        System.out.println("\nLa cantidad de votos es: " + nro_votantes);
        System.out.println("La cantidad y porcentaje de votos blancos y nulos es: " + Arrays.toString(blanco_nulo));
        System.out.println("La cantidad y porcentaje de la lista ganadora es: " + Arrays.toString(lista_ganadora));
        System.out.println("La cantidad y porcentaje de las listas ganadoras es: " + Arrays.toString(dos_listas_ganadoras));
    }

    static int contar_votos()
    {
        int votantes= 0;

        for(int i = 0; i < votos.length; i++)
        {
            votantes += votos[i];
        }

        return votantes;
    }

    static double[] contar_blanco_nulo(int votantes)
    {
        double[] resultado = new double[2];
        int cant_votos_NB;

        cant_votos_NB = votos[3] + votos[4];

        resultado[0] = cant_votos_NB;
        resultado[1] = ((double) cant_votos_NB/votantes)*100;

        return resultado;
    }

    static String[] hallar_ganador(int votantes)
    {
        String[] resultado = new String[2];
        int maximo = 0;
        int indice = 0;

        maximo = votos[0];

        for(int i = 0; i < votos.length; i++)
        {
            if(votos[i] > maximo)
            {
                maximo = votos[i];
                indice = i;
            }
        }

        resultado[0] = listas[indice];
        resultado[1] = String.valueOf(((double) maximo/votantes)*100);

        return resultado;
    }

    static String[] hallar_listas_ganadoras(String [] ganador, int votantes)
    {
        String[] resultado = new String[4];
        int maximo = 0;
        int maximo_2 = 0;
        int indice_2 = 0;
        int votantes_sin_NB = 0;

        for(int i = 0; i < votos.length; i++)
        {
            if(listas[i].equals(ganador[0]))
                maximo = votos[i];
        }

        for(int i = 0; i < votos.length; i++)
        {
            if(votos[i] > maximo_2 && votos[i]!= maximo)
            {
                maximo_2 = votos[i];
                indice_2 = i;
            }
        }

        votantes_sin_NB = votantes - votos[3] - votos[4];

        // TOP 1
        resultado[0] = ganador[0];
        resultado[1] = String.valueOf(Math.round(((double) maximo/votantes_sin_NB)*100)*100/100);

        // TOP 2
        resultado[2] = listas[indice_2];
        resultado[3] = String.format("%.3f",((double) maximo_2/votantes_sin_NB)*100);

        return resultado;
    }
}
