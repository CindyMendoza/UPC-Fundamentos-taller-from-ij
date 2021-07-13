import java.util.Arrays;

public class tallerejercicio4 {
    static String [] territorios = {"Territorio Centro", "Territorio Lima", "Territorio Norte", "Territorio Sur"};

    static String [] regiones_1 = {"Lima", "Ica", "Tumbes", "Tacna"};
    static String [] territorio_x_region = {"Territorio Lima", "Territorio Sur", "Territorio Norte", "Territorio Sur"};

    static String [] regiones_2 = {"Lima", "Ica", "Tumbes", "Tacna"};
    static int [] ventas   = {1000, 1000, 400, 600};

    public static void main(String[] args)
    {
        int venta_mes;
        int cuota_minima = 500;
        double porcentaje_cuota_minima;
        String[] regiones_mas_venta = new String[regiones_1.length];
        String[] ventas_x_territorio = new String[territorios.length*2];

        venta_mes = sumar_ventas();
        porcentaje_cuota_minima = hallar_regiones_CM(cuota_minima);
        regiones_mas_venta = hallar_regiones_mas_ventas();
        ventas_x_territorio = hallar_venta_x_territorio();

        System.out.println("\nLa cantidad de ventas del mes es: " + venta_mes);
        System.out.println("El porcentaje de regiones que superaron la cuota minima es: " + String.format("%.2f",porcentaje_cuota_minima) + "%");
        System.out.println("Las regiones con la mayor venta son: " + Arrays.toString(regiones_mas_venta));
        System.out.println("Las ventas por territorio son: " + Arrays.toString(ventas_x_territorio));
    }

    static int sumar_ventas()
    {
        int total_ventas= 0;

        for(int i = 0; i < ventas.length; i++)
        {
            total_ventas += ventas[i];
        }

        return total_ventas;
    }

    static double hallar_regiones_CM(int cuota)
    {
        double porcentaje = 0;
        int cantidad = 0;

        for(int i = 0; i < ventas.length; i++)
        {
            if(ventas[i]>cuota)
                cantidad++;
        }

        porcentaje = ((double) cantidad / ventas.length) * 100;

        return porcentaje;
    }

    static String[] hallar_regiones_mas_ventas()
    {
        int maximo = 0, j = 0;
        String[] regiones_mas_venta = new String[regiones_1.length];

        for(int i = 0; i < ventas.length; i++)
        {
            if(ventas[i]>maximo)
                maximo = ventas[i];
        }

        for(int i = 0; i < ventas.length; i++)
        {
            if(ventas[i] == maximo)
            {
                regiones_mas_venta[j] = regiones_1[i];
                j++;
            }
        }

        return regiones_mas_venta;
    }

    static String[] hallar_venta_x_territorio()
    {
        String[] venta_x_territorio = new String[territorios.length*2];
        int nro_ventas;
        int k = 0;

        for(int i = 0; i < territorios.length; i++)
        {
            nro_ventas = 0;
            venta_x_territorio[k] = territorios[i];

            for(int j = 0; j < ventas.length; j++)
            {
                if(territorio_x_region[j].equals(territorios[i]))
                {
                    nro_ventas += ventas[j];
                }
            }

            venta_x_territorio[k + 1] = String.valueOf(nro_ventas);
            k = k +2;
        }

        return venta_x_territorio;
    }
}
