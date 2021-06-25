import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String tipo;
        double sueldo_inicial_g, sueldo_final_g, porcentaje_g;
        double sueldo_inicial_e, sueldo_final_e, porcentaje_e;
        double suma;
        int anio;

        System.out.println("Ingrese la cantidad de aÃ±os");
        anio = sc.nextInt();

        System.out.println("Ingrese la el sueldo inicial del Gerente:");
        tipo = "G";
        sueldo_inicial_g = sc.nextDouble();

        sueldo_final_g = calcular_sueldo(tipo, sueldo_inicial_g, anio);
        porcentaje_g = calcular_aumento(sueldo_inicial_g, sueldo_final_g);

        System.out.printf("\nEl sueldo final del Gerente es %.2f.\n", sueldo_final_g);
        System.out.printf("El porcentaje de aumento es %.2f.\n", porcentaje_g);

        System.out.println("\nIngrese el sueldo inicial del Empleado:");
        tipo = "E";
        sueldo_inicial_e = sc.nextDouble();

        sueldo_final_e = calcular_sueldo(tipo, sueldo_inicial_e, anio);
        porcentaje_e = calcular_aumento(sueldo_inicial_e, sueldo_final_e);

        System.out.printf("\nEl sueldo final del Empleado es %.2f.\n", sueldo_final_e);
        System.out.printf("El porcentaje de aumento es %.2f.\n", porcentaje_e);

        suma = sumar_sueldos(sueldo_final_g, sueldo_final_e);
        System.out.printf("\nLa suma de sueldos es %.2f.\n", suma);
    }

    static double calcular_sueldo(String tipo, double sueldo_inicial, int anio)
    {
        double sueldo_final = 0;

        sueldo_final = sueldo_inicial;
        if(tipo.equals("G"))
        {
            for(int i=0; i<anio; i++)
            {
                if(i != 0 && i%4 == 0)
                    sueldo_final = sueldo_final * (1 + 0.18);
                else
                    sueldo_final = sueldo_final * (1 + 0.14);
            }
        }
        else if(tipo.equals("E"))
        {
            for(int i=0; i<anio; i++)
            {
                if(i != 0 && i%4 == 0)
                    sueldo_final = sueldo_final * (1 + 0.12);
                else
                    sueldo_final = sueldo_final * (1 + 0.08);
            }
        }

        return sueldo_final;
    }

    static double calcular_aumento(double s_inicial, double s_final)
    {
        double porcentaje = 0;

        porcentaje = ((s_final / s_inicial) - 1) * 100;

        return porcentaje;
    }

    static double sumar_sueldos(double sueldo_gerente, double sueldo_empleado)
    {
        double suma = 0;
        suma = sueldo_gerente + sueldo_empleado;
        return suma;
    }
}
