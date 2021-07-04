public class Pregunta03
{

    public static void main(String[] args)
    {
        String perfil = "U";
        int español = 10, ingles = 15;


        //Para probar método costo_individual
        //double costoU = costo_plan_unico(español, ingles);
        //System.out.printf("\nEl costo por su perfil Unico es: %.2f\n", costoU);

        //Para probar método costo_familiar
        //double costoG = costo_plan_grupal(español, ingles);
        //System.out.printf("\nEl costo por su perfil Grupal es: %.2f\n", costoG);

        //Para probar método costo_total
        double total = costo_total(perfil, español, ingles);
        System.out.printf("\nEl importe a pagar en este mes es de: %.2f\n", total);
    }

    static double costo_plan_unico(int español, int ingles)
    {
        double costo = 30.0;

        for (int i=1; i<=español; i++)
        {
            if (i<=10)
                costo += 2.00;
            else
                costo += 1.00;
        }

        for (int i=1; i<=ingles; i++)
        {
            if (i<=10)
                costo += 3.00;
            else
                costo += 1.50;
        }

        return costo;
    }

    static double costo_plan_grupal(int español, int ingles)
    {
        double costo = 70.0;

        for (int i=1; i<=español; i++)
        {
            if (i<=15)
                costo += 1.50;
            else
                costo += 0.50;
        }

        for (int i=1; i<=ingles; i++)
        {
            if (i<=15)
                costo += 2.50;
            else
                costo += 1.00;
        }

        return costo;
    }

    static double costo_total(String perfil, int español, int ingles)
    {
        double costo = 0.0;

        if (perfil.equals("U"))
            costo = costo_plan_unico(español, ingles);
        else if (perfil.equals("G"))
            costo = costo_plan_grupal(español, ingles);

        return costo;
    }
}