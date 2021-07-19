import java.util.Arrays;

public class actividad170721 {
    static String[]autos={"Camion","Auto","Auto","Bus","Bus","Auto"};





    static int calcularOcurrencias(String vehiculo){
        int cont=0;
        for (int i=0;i<autos.length ;i++ ) {
            if(autos[i].equals(vehiculo))
                cont++;
        }return cont;
    }
    static String obtenerTiposMenosTransita3(){
        String menorTransitado=autos[0];
        for (int i=0;i<autos.length ;i++ ) {
            for (int j=1;j<autos.length ;j++ ) {
                if(calcularOcurrencias(menorTransitado)<calcularOcurrencias(autos[j]))
                    menorTransitado=autos[i];
            }
        }return menorTransitado;

    }




    public static void main(String[] args) {
//        int marca = "Subaru";
//        int dato = Integer.parseInt(marca);
//        int [] miarreglo = new int[5];
//
//        int[] miarreglo2 = {1,2,3,4,5};
//
//        int miarreglo3[] = new int[5];
//        System.out.println(dato);
//        int I =2, x = -1, s=0;
//        for( ; i<=4;i+=2){
//            x+=1
//            s = s + x;
//        }
//        System.out.println(s);

    }
}
