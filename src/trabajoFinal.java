public class trabajoFinal {

    // Calcul                                              ar impuesto predial
// Para el calculo del Impuesto Predial usaremos los datos de la Municipalidad de Villa El Salvador publicada en su
// sitio web
// Determinacion y calculo del impuesto predial:
// http://www.munives.gob.pe/WebSite/Transparencia/TributosMunicipales/Formularios/DETERMINACION%20%20Y%20CALCULO%20DEL%20IMPUESTO%20PREDIAL.pdf
// Tablas de depreciación por antigüedad y estado de conservación:
// http://www.munives.gob.pe/WebSite/Transparencia/TributosMunicipales/Depreciacion/CyED.pdf
// Valores arancelarios de terrenos y valores unitarios oficiales de edificación vigentes:
// https://busquedas.elperuano.pe/normaslegales/aprueban-los-valores-unitarios-oficiales-de-edificacion-para-resolucion-ministerial-n-270-2020-vivienda-1898559-1/
//    impuestoPredial
    //    Calcular arbitrios
    private static double UIT2021 = 4400;
    private static double hasta15UIT = UIT2021 * 15;
    private static double hasta60UIT = UIT2021 * 60;
    private static double alicuota = 0;

    static double calcularValorDepreciado(String tipoPredio) {
        double valorDepreciado = 0;
        if (tipoPredio.equals("Domestico A")) {
            valorDepreciado = 6219;
        } else if (tipoPredio.equals("Domestico B")) {
            valorDepreciado = 5119;

        } else if (tipoPredio.equals("Domestico C")) {
            valorDepreciado = 4019;
        } else if (tipoPredio.equals("Comercial A")) {
            valorDepreciado = 7919;
        } else if (tipoPredio.equals("Comercial B")) {
            valorDepreciado = 6819;
        } else if (tipoPredio.equals("Comercial C")) {
            valorDepreciado = 5819;
        } else if (tipoPredio.equals("Institucional A")) {
            valorDepreciado = 9819;
        } else if (tipoPredio.equals("Institucional B")) {
            valorDepreciado = 8819;
        } else if (tipoPredio.equals("Institucional C")) {
            valorDepreciado = 7819;
        } else {
            valorDepreciado = 0;
        }
        return (double) valorDepreciado;
    }

    static double calcularValorTerreno(double m2terreno, double precioPorMetro2) {
        double valorTerreno = 0;
        valorTerreno = m2terreno * precioPorMetro2;
        return (double) valorTerreno;
    }

    static double calcularAreaConstruida(double m2terreno) {
        double areaConstruida = 0;
        areaConstruida = Math.pow(m2terreno, 2) - (Math.pow(m2terreno, 2) * 0.2);
        return (double) areaConstruida;
    }

    static double calcularValorContruccion(double valorDepreciado, double areaConstruida) {
        double valorContruccion = 0;
        valorContruccion = valorDepreciado * areaConstruida;
        return (double) valorContruccion;
    }

    static double calcularValorPredio(double valorTerreno, double valorConstrucion) {
        double ValorPredio = 0;
        ValorPredio = valorTerreno + valorConstrucion;
        return (double) ValorPredio;
    }

    static double calcularImpuestoPredial(double valorPredio) {
        double impuestoPredial = 0;
        if (valorPredio <= hasta15UIT) {
            alicuota = (double)0.2/100;
            impuestoPredial=(double)valorPredio*alicuota;
        } else if (valorPredio > hasta15UIT && valorPredio < hasta60UIT) {
            alicuota = (double)0.6/100;
            impuestoPredial=(double)valorPredio*alicuota;
        } else if (valorPredio >= hasta60UIT) {
            alicuota = (double)1/100;
            impuestoPredial=(double)valorPredio*alicuota;
        }
        return (double)impuestoPredial;
    }


    public static void main(String[] args) {
        String distrito = "La VICTORIA";
        System.out.println(UIT2021 * 15);
        System.out.println(UIT2021 * 60);
//        alicuota = 10;

        double vartest = 164000;
        if (vartest <= hasta15UIT) {
            alicuota = 0.2;
            System.out.println(alicuota);
        } else if (vartest > hasta15UIT && vartest < hasta60UIT) {
            alicuota = 0.6;
            System.out.println(alicuota);
        } else if (vartest >= hasta60UIT) {
            alicuota = 1;
            System.out.println(alicuota);
        }
        System.out.println(1/100);
    }
}
