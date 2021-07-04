public class Pregunta02 {
    public static void main(String[] args) {
        //Declaracion de Variables
        int horas_trabajadas = 5;
        String codigo_area = "A";

        //Metodos
        //pago_del_dia = CalcularPagoCodigoA(horas_trabajadas);
        //pago_del_dia = CalcularPagoCodigoC(horas_trabajadas);
        int pago_del_dia = CalcularPago(horas_trabajadas, codigo_area);

        //Mostrar resultados
        System.out.println("\nEl trabajador debe recibir un pado de " + pago_del_dia + " soles");
    }

    static int CalcularPagoCodigoA(int horas)
    {
        int pago_total = 0;
        for(int i=1; i<=horas; i++)
        {
            if(i<=3)
                pago_total += 10;
            else if(i<=8)
                pago_total += 15;
            else if(i>=9)
                pago_total += 20;
            else
                pago_total += 0;
        }
        return pago_total;
    }


    static int CalcularPagoCodigoC(int horas)
    {
        int pago_total = 0;
        for(int i=1; i<=horas; i++)
        {
            if(i<=3)
                pago_total += 15;
            else if(i<=8)
                pago_total += 20;
            else if(i>=9)
                pago_total += 30;
            else
                pago_total += 0;
        }
        return pago_total;
    }

    static int CalcularPago(int horas, String area)
    {
        int monto_pago = 0;
        switch(area)
        {
            case "A": monto_pago = CalcularPagoCodigoA(horas); break;
            case "C": monto_pago = CalcularPagoCodigoC(horas); break;
            default: monto_pago = 0; break;
        }
        return monto_pago;
    }
}
