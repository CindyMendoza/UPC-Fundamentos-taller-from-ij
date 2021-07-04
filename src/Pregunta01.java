public class Pregunta01
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        int meses = 5;
        double inversion_inicial = 100;
        double propuesta_1, propuesta_2;
        String propuesta_maxima;

        //Calculos
        propuesta_1  = calcula_propuesta_1(meses, inversion_inicial);
        propuesta_2  = calcula_propuesta_2(meses, inversion_inicial);
        propuesta_maxima = mejor_propuesta(propuesta_1, propuesta_2);

        //Mostrar resultados
        System.out.printf("\nGanancia con la propuesta 1: %.2f\n", propuesta_1);
        System.out.printf("Ganancia con la propuesta 2: %.2f\n", propuesta_2);
        System.out.println("La mejor propuesta es: " + propuesta_maxima);
    }

    static double calcula_propuesta_1(int mes, double inversion_inicial)
    {
        double capital, ganancia = 0;

        capital = inversion_inicial;

        for(int i=1; i <= mes; i++)
        {
            ganancia = ganancia + capital * 0.02;
            //capital = capital * 1.02;
            capital = capital + capital * 0.02;
        }

        return ganancia;
    }

    static double calcula_propuesta_2(int mes, double inversion_inicial)
    {
        double ganancia = 0;

        for(int i=1; i <= mes; i++)
        {
            if((ganancia <= inversion_inicial * 0.1) && (i%2 == 0))
            {
                ganancia += inversion_inicial * 0.04;
            }
            else
            {
                ganancia += inversion_inicial * 0.01;
            }
        }

        return ganancia;
    }

    static String mejor_propuesta(double propuesta1, double propuesta2)
    {
        String propuesta;

        if(propuesta1 > propuesta2)
            propuesta = "Propuesta 1";
        else if (propuesta1 < propuesta2)
            propuesta = "Propuesta 2";
        else
            propuesta = "Son Iguales";

        return propuesta;
    }
}
