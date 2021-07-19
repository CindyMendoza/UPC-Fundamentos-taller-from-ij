import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //01.Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        double primera_cuota, importe, importe_calculado;
        int cant_meses, cant_meses_calculado;

        //02.Captura de datos
        System.out.println("Ingrese el monto de la primera cuota (cambiado para Git): ");
        primera_cuota = sc.nextDouble();

        System.out.println("Ingrese la cantidad de meses para la primera forma: ");
        cant_meses = sc.nextInt();

        System.out.println("Ingrese el importe total para la segunda forma: ");
        importe = sc.nextDouble();

        //03.Operaciones
        importe_calculado = calcular_importe(primera_cuota, cant_meses);
        cant_meses_calculado = calcular_meses(primera_cuota, importe);

        //04.Mostrar resultados
        System.out.printf("\nEl total a pagar es: %.2f\n", importe_calculado);
        System.out.println("La cantidad de meses de pago es: " + cant_meses_calculado);
    }

    static double calcular_importe(double cuota_nro1, int meses) {
        double acumulado = 0, cuota;

        cuota = cuota_nro1;
        for (int i = 1; i <= meses; i++) {
            acumulado += cuota; // total = total + cuota;
            cuota *= 2;     // cuota = cuota * 2;
        }

        return acumulado;
    }

    static int calcular_meses(double primera_cuota, double importe) {
        int meses = 0;
        double acumulado = 0, cuota_mes_actual;

        cuota_mes_actual = primera_cuota;
        do {
            acumulado += cuota_mes_actual;      // acumulado = acumulado + cuota_mes_actual;
            cuota_mes_actual *= 2;              // cuota_mes_actual = cuota_mes_actual * 2;
            meses++;                            // meses = meses + 1;
        } while (acumulado <= importe);

        return meses;
    }

}
