import java.util.Scanner;

public class Ejercicio01 {
    static String [] distritos = {"Lince", "Ate", "San Luis", "Comas", "SMP", "La Molina", "Surco"};
    static int [] edad        = {15,16,10,67,40,15,13};
    static String [] nombres  = {"Roxana","Mariana","Daphne","Jennifer","Lilia","Valeria","Susan"};

    public static void main(String[] args)
    {
        String nombre_buscado;
        int indice, indice_mayor;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre de la persona buscada");
        nombre_buscado = sc.nextLine();

        indice = buscar_persona(nombre_buscado);
        indice_mayor = mayor();

        System.out.println("La edad de " + nombre_buscado + " es " + edad[indice] + " aÃ±os y vive en " + distritos[indice]);
        System.out.println(nombres[indice_mayor] + " es la persona de mas edad con " + edad[indice_mayor] + " aÃ±os y vive en " + distritos[indice_mayor]);
    }

    static int buscar_persona(String nombre)
    {
        int indice = 0;

        for(int i=0; i<nombres.length; i++)
        {
            if(nombres[i].equals(nombre))
                indice = i;
        }

        return  indice;
    }

    static int mayor()
    {
        int mayor = 0, indice = 0;

        for(int i=0; i<edad.length; i++)
        {
            if(edad[i]>mayor) {
                mayor = edad[i];
                indice = i;
            }
        }

        return indice;
    }
}
