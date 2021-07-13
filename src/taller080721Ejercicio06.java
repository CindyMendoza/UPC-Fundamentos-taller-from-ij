import java.util.Scanner;

public class taller080721Ejercicio06 {
    static String [] codigos = {"6002251RATRM001",
            "6204251SATRM00C",
            "7002251RATRM008",
            "8005251SATRM003",
            "9002251RATRM006"};

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String mes, paterno;
        int personas_mes, codigos_paterno, no_numero;

        /*System.out.println("Ingresar el mes buscado en formato de dos digitos (Ejemplo: 01):");
        mes = sc.nextLine();
        personas_mes = halla_cantidad_x_mes(mes);
        System.out.println("\nLa cantidad de personas nacidas en el mes " + mes + " es: " + personas_mes);*/

        /*System.out.println("Ingrese el Apellido Paterno buscado (todo en MayusculaS)");
        paterno = sc.nextLine();
        codigos_paterno = hallar_x_apellido(paterno);
        System.out.println("\nLa cantidad de personas cuyas siglas coinciden con el apellido " + paterno + " son: " + codigos_paterno);*/

        no_numero = buscar_no_numero();
        System.out.println("\nLa cantidad de codigos que no terminan en numero es: " + no_numero);
    }

    static int halla_cantidad_x_mes(String mes)
    {
        int cantidad = 0;
        String mes_actual;

        for(int i=0; i < codigos.length; i++)
        {
            mes_actual = codigos[i].substring(2,4);

            if (mes.equals(mes_actual))
                cantidad++;
        }

        return cantidad;
    }

    static int hallar_x_apellido(String apellido)
    {
        int cantidad = 0;
        String siglas_actual;
        String siglas_apellido = apellido.substring(0,1) + apellido.substring(3,4);

        for(int i=0; i < codigos.length; i++)
        {
            siglas_actual = codigos[i].substring(7,9);

            if (siglas_apellido.equals(siglas_actual))
                cantidad++;
        }

        return cantidad;
    }

    static int buscar_no_numero()
    {
        int numeros = 0, no_numeros = 0;
        String ultimo_caracter = "";

        for(int i=0; i < codigos.length; i++)
        {
            ultimo_caracter = codigos[i].substring(14,15);

            if (ultimo_caracter.equals("0") || ultimo_caracter.equals("1") || ultimo_caracter.equals("2") ||
                    ultimo_caracter.equals("3") || ultimo_caracter.equals("4") || ultimo_caracter.equals("5") ||
                    ultimo_caracter.equals("6") || ultimo_caracter.equals("7") || ultimo_caracter.equals("8") ||
                    ultimo_caracter.equals("9"))
                numeros++;
        }

        no_numeros = codigos.length - numeros;

        return no_numeros;
    }
}
