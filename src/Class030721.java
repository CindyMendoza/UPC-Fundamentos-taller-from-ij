public class Class030721 {



    static String[] codigosDeProductos = {"AR000101", "PE125610", "CH452315", "CH452315",
            "BR521317", "BR123620", "PE752124", "AR124511", "PE562405", "BR452102", "BR521317",
            "AR455210", "PE562405"};
    static String nacionalidad="BR";

    public static void main(String[] args) {

        String palabra= "Murcielago";
        String[] nombres ={"Carlos","Pedro","Felipe"};
        String[] codigos ={"u201724635","u202116648","u202117960"};

       /* System.out.println(palabra.substring(3,7));
        System.out.println(nombres[0].substring(0,1));
        System.out.println(nombres[0].substring(0,1));*/

       /* for (int i=0;i<nombres.length;i++){
            System.out.println(nombres[i].substring(0,1));
        }*/
        /*for (int i=0;i<codigos.length;i++){

            if(codigos[i].substring(1,5).equals("2021")){
                System.out.println(codigos[i].substring(1,5));
            }
        }*/
        ObtenerCantidadProductosPorNacionalidad(codigosDeProductos,nacionalidad);
//        System.out.println(ObtenerCantidadProductos(codigosDeProductos,nacionalidad));

    }

    private static int getLengthOfArray(String[] codigos){
        return codigos.length;
    }
    private static int ObtenerCantidadProductosPorNacionalidad(String[] codigos,String nacionalidad){
        int contador =0;
        for (int i=0;i<codigos.length;i++){
            if(codigos[i].substring(0,2).equals(nacionalidad)){
                contador++;
            }
        }
        return contador;
    }
    private static int ObtenerMaximoCorrelativoPorNacionalidad(String[] codigos,String nacionalidad){
        int contador =0;
        for (int i=0;i<codigos.length;i++){
            if(codigos[i].substring(2,6).equals(nacionalidad)){
                contador++;
            }
        }
        return contador;
    }
}
