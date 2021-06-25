import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args)
    {
        //01.Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        int cant_meses;
        double capital_inicial, interes_inicial, capital_final, interes_final, interes_total, importe_total;

        //02.Captura de datos
        System.out.println("Ingrese la cantidad de meses: ");
        cant_meses = sc.nextInt();

        System.out.println("Ingrese el capital inicial: ");
        capital_inicial = sc.nextDouble();

        System.out.println("Ingrese el interes inicial: ");
        interes_inicial = sc.nextDouble();

        //03.Operaciones
        interes_final = calcular_interes_final(cant_meses, capital_inicial, interes_inicial);
        interes_total = calcular_interes_total(cant_meses, capital_inicial, interes_inicial);
        importe_total = calcular_importe_total(cant_meses, capital_inicial, interes_inicial);

        //04.Mostrar resultados
        System.out.printf("\nEl interes final es: %.2f\n", interes_final);
        System.out.printf("El interes total es: %.2f\n", interes_total);
        System.out.printf("El importe total es: %.2f\n", importe_total);
    }

    static double calcular_interes_final(int meses, double capital, double interes)
    {
        double capital_actual, interes_actual;

        //inicializamos
        interes_actual = interes;
        capital_actual = capital;

        for(int i=1; i<=meses; i++)
        {
            if( (i-1)%3 == 0 && i!=1)
            {
                interes_actual ++;
            }

            capital_actual *= (1+(interes_actual/100));

        }

        return interes_actual;
    }

    static double calcular_interes_total(int meses, double capital_inicial, double interes_inicial)
    {
        double interes_total = 0;
        double nuevo_capital, interes_actual;

        //inicializamos
        interes_actual = interes_inicial;
        nuevo_capital = capital_inicial;

        for(int i=1; i<=meses; i++)
        {
            if( (i-1)%3 == 0 && i!=1)
            {
                interes_actual ++;
            }

            nuevo_capital *= (1+(interes_actual/100));
        }

        interes_total = ((nuevo_capital / capital_inicial) - 1) * 100;

        return interes_total;
    }

    static double calcular_importe_total(int meses, double capital_inicial, double interes_inicial)
    {
        double nuevo_capital, interes_actual;
        int contador = 1;

        //inicializamos
        interes_actual = interes_inicial;
        nuevo_capital = capital_inicial;

        while(contador <= meses)
        {
            if( (contador-1)%3 == 0 && contador!=1)
                interes_actual ++;

            nuevo_capital *= (1+(interes_actual/100));

            contador++;
        }

        return nuevo_capital;
    }

}
