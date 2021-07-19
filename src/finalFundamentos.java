import java.util.Arrays;

public class finalFundamentos {
    private static String restaurantes[] = {"restaurante1", "restaurante2", "restaurante3",
            "restaurante4", "restaurante5"};
    private static int capacidadPersonal[] = {10, 1, 7, 2, 8};

    //    Un método que obtenga el total del nuevo número de personal, dado un arreglo de restaurantes y su número de personal.
    private static int[] calcularNuevoTotal(int[] cantidadPersonal) {
        int[] newArrayPersonal = new int[cantidadPersonal.length];
        for (int i = 0; i < cantidadPersonal.length; i++) {
            if (cantidadPersonal[i]>5){
                newArrayPersonal[i]=cantidadPersonal[i]-2;
            }else{
                newArrayPersonal[i]=cantidadPersonal[i];
            }

        }
        return newArrayPersonal;
    }


    //    Un método que obtenga la cantidad de restaurantes que no pueden atender con el total de su personal, dado un arreglo de restaurantes y su número de personal.
    private static int calcularCantidadRestauranteSinAtencion(int[] cantidadPersonal) {
        int contadorRestauranteSinAtencion = 0;
        for (int i = 0; i < cantidadPersonal.length; i++) {

            if (cantidadPersonal[i] > 5) {
                contadorRestauranteSinAtencion++;
            }
        }
        return contadorRestauranteSinAtencion;
    }

//    //    Un método que obtenga la cantidad de restaurantes que tengan igual o más de 5 personas como nuevo número de personal, dado un arreglo de restaurantes y su número de personal.
    private static int calcularCantidadRestauranteNuevoPersonal(int[] cantidadPersonal) {
        int contadorRestauranteNuevoPersonal = 0;
        for (int i = 0; i < cantidadPersonal.length; i++) {
            if (cantidadPersonal[i] >= 5) {
                contadorRestauranteNuevoPersonal++;
            }
        }
        return contadorRestauranteNuevoPersonal;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(calcularNuevoTotal(capacidadPersonal)));
        System.out.println(calcularCantidadRestauranteSinAtencion( capacidadPersonal));
        System.out.println(calcularCantidadRestauranteNuevoPersonal(calcularNuevoTotal(capacidadPersonal)));
    }
}
