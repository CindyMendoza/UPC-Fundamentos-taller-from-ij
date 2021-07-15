public class balotarioArray2 {

    private static String codigosPromocion[] = {
            "DISCNOR150", "DISCSIL200", "DISCGOL300", "DISCNOR010", "DISCSIL020", "DISCGOL030", "DISCNOR010",
            "DISCSIL020", "DISCGOL030", "DISCNOR010", "DISCSIL020", "DISCGOL030"};

    private static int evaluarMontoPagar(String tipoEntrada) {
        int montoPago = 0;
        if (tipoEntrada.equals("Normal")) {
            montoPago = 700;
        } else if (tipoEntrada.equals("Silver")) {
            montoPago = 1700;
        } else if (tipoEntrada.equals("Gold")) {
            montoPago = 2700;
        }
        return montoPago;
    }

    private static String validarCodigoPromocion(String codigoPromocional) {
        String estado = "Codigo incorrecto";
        for (int i = 0; i < codigosPromocion.length; i++) {
            if (codigosPromocion[i].equals(codigoPromocional) && codigoPromocional.length() == 10) {
                estado = "Codigo correcto";
            }
        }

        return estado;
    }

    private static String calcularDescuento(String codigoPromocional) {
        String descuento = "No hay descuento";
        for (int i = 0; i < codigosPromocion.length; i++) {

            if (codigosPromocion[i].equals(codigoPromocional)) {
                descuento = codigosPromocion[i].substring(7, 10);
            }
        }

        return descuento;
    }

    private static double calcularPago(String codigoPromocional) {

        double respuesta = 0;
        double descuento = 0;
        for (int i = 0; i < codigosPromocion.length; i++) {

            if (codigosPromocion[i].equals(codigoPromocional)) {

                if (codigosPromocion[i].substring(4, 7).equals("NOR")) {
                    descuento =((Integer.parseInt(codigosPromocion[i].substring(7, 10)) * 700) / 100);

                    if(descuento>700){
                        respuesta=0;
                    }else {
                        respuesta =
                                700 - descuento;
                    }
                }else if(codigosPromocion[i].substring(4, 7).equals("SIL")){
                    descuento= ((Integer.parseInt(codigosPromocion[i].substring(7, 10)) * 1700) / 100);

                    if(descuento>1700){
                        respuesta=0;
                    }else {
                        respuesta =
                                1700 - descuento;
                    }
                }else if(codigosPromocion[i].substring(4, 7).equals("GOL")){
                    descuento=((Integer.parseInt(codigosPromocion[i].substring(7, 10)) * 2700) / 100);

                    if(descuento>2700){
                        respuesta=0;
                    }else {
                        respuesta =
                                2700 - descuento;
                    }
                }
            }
        }

        return (double) respuesta;
    }

    public static void main(String[] args) {
        System.out.println(evaluarMontoPagar("Silver"));
        System.out.println(validarCodigoPromocion("DISCOUN010"));
        System.out.println(calcularDescuento("DISCNOR150"));
        System.out.println(calcularPago("DISCNOR010"));
        System.out.println(calcularPago("DISCNOR150"));
    }
}
