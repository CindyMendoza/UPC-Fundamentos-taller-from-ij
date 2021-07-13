import java.util.Arrays;

public class actividad4a3 {
    private static String etiquetadoProducto[] = {"PE219002", "PE219103", "PE219204",
            "PE219305", "PE219406", "PE219507","AR219002","AR219103","AR219204","AR219305","AR219406","AR219507",
            "CH219002","CH219103","CH219204","CH219305","CH219406","CH219507","BR219002","BR219103","BR219204",
            "BR219305","BR219406","BR219507"};
    private static int calcularCostoAlmacenamiento(String digito){
        int sumaTotalCosto=0;
        for(int i=0; i<etiquetadoProducto.length; i++){
            if ( etiquetadoProducto[i].substring(0,2).equals(digito)){
                sumaTotalCosto += Integer.parseInt(etiquetadoProducto[i].substring(6,8));
            }
        }
        return sumaTotalCosto;
    }
    public static void main(String[] args) {
        System.out.println(calcularCostoAlmacenamiento("PE"));
    }
}
