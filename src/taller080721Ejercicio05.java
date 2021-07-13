import java.util.Scanner;

public class taller080721Ejercicio05 {
    static String [] codigos = {"LAN345236D18:15",
            "AVI645235P16:00",
            "LAN863984C19:45",
            "LAN643345D19:01",
            "COP573894D06:20"};

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero_vuelo, vuelos_retrasados, vuelos_18_19;
        String estado_vuelo, aerolinea;

        /*System.out.println("Ingrese el numero de vuelo buscado");
        numero_vuelo = sc.nextInt();

        estado_vuelo = hallar_estado(numero_vuelo);
        System.out.println("\nEl estado del vuelo " + numero_vuelo + " es: " + estado_vuelo);*/

        /*System.out.println("Ingrese el nombre de la aerolinea (todo en mayuscula)");
        aerolinea = sc.nextLine();

        vuelos_retrasados = hallar_retrasos(aerolinea);

        if(vuelos_retrasados == -1)
            System.out.println("\nLa aerolinea no existe");
        else
            System.out.println("\nLa cantidad de vueltos retrasados de '" + aerolinea + "' es: " + vuelos_retrasados);*/

        vuelos_18_19 = hallar_vuelos_18_19();
        System.out.println("\nSe tienen " + vuelos_18_19 + " vuelos entre las 18 y 19 horas");
    }

    static String hallar_estado(int vuelo)
    {
        String estado = "";
        String vuelo_actual;

        for(int i=0; i < codigos.length; i++)
        {
            vuelo_actual = codigos[i].substring(3,9);

            if (vuelo == Integer.parseInt(vuelo_actual))
            {
                estado = codigos[i].substring(9, 10);
                i = codigos.length;
            }
        }

        switch(estado)
        {
            case "D": estado = "Retrasado"; break;
            case "P": estado = "Paralizado"; break;
            case "C": estado = "En curso"; break;
            default: estado = "Sin estado"; break;
        }

        return estado;
    }

    static int hallar_retrasos(String aerolinea)
    {
        int vuelos_retrasados = 0;
        String siglas_aerolinea;

        switch (aerolinea)
        {
            case "LAN": siglas_aerolinea = "LAN"; break;
            case "COPA AIRLINES": siglas_aerolinea = "COP"; break;
            case "AVIANCA": siglas_aerolinea = "AVI"; break;
            default: siglas_aerolinea = ""; break;
        }

        if(!siglas_aerolinea.equals(""))

            for(int i=0; i < codigos.length; i++)
            {
                if(siglas_aerolinea.equals(codigos[i].substring(0,3)))
                    if(codigos[i].substring(9, 10).equals("D"))
                        vuelos_retrasados++;
            }

        else
            vuelos_retrasados = -1;

        return vuelos_retrasados;
    }

    static int hallar_vuelos_18_19()
    {
        int cantidad = 0;
        String hora_vuelo;

        for(int i=0; i < codigos.length; i++)
        {
            hora_vuelo = codigos[i].substring(10,12);

            if (Integer.parseInt(hora_vuelo) == 18)
                cantidad++;
        }

        return cantidad;
    }
}
