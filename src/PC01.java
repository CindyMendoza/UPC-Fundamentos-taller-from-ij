public class PC01 {
    /*Una emisora de radio apertura un nuevo servicio de música por streaming sin publicidad
    y lo contrata para desarrollar un programa que permita calcular el importe mensual a pagar de acuerdo con el perfil
    contratado y el número de canciones escuchadas.

    Existen dos tipos perfiles disponibles:

    El perfil “Único” (I), cuya tarifa mensual es s/.30.00.
    El cobro será según la categoría:
        Para canciones en “Español” un cobro de s/.2.00 por cada una de las 10 primeras canciones escuchadas y en caso de escuchar más se
      cobra s/.1.00 por cada canción adicional.
        Para canciones en “Inglés” para las primeras 10 canciones se cobra s/.3.00 por cada una y s/.1.50 por cada canción adicional.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    El perfil “Grupal” (F), cuya tarifa mensual es s/.70.00.
    El cobro será según la categoría:
    Para canciones en “Español” un cobro de s/.1.50 para cada una de las 15 primeras canciones escuchadas y en caso de escuchar más
    se cobra s/.0.50 por cada canción adicional.
    Para canciones en “Inglés” para las primeras 15 canciones se cobra s/.2.50 por cada una y s/.1.00 por cada canción adicional.

    Se pide lo siguiente:


    Construir un método que reciba el número de canciones escuchadas en inglés y el número de canciones escuchadas
    en español, y permita a un cliente con perfil “Único” calcular el total a pagar. (4 puntos)

    Construir un método que reciba el número de canciones escuchadas en inglés y el número de canciones escuchadas
    en español, y permita a un cliente con perfil “Grupal” calcular el total a pagar. (4 puntos)

    Construir un método que reciba el tipo de perfil contratado (U o G), el número de canciones escuchadas en
    inglés y el número de canciones escuchadas en español, retorne el total a pagar. (2 puntos)
     */

    public static double Calcular_pago_punico(int cant_cancion_ingles, int cant_cancion_espanol){

        double total_espanol=0;
        double total_ingles=0;
        double tarifa_mensual = 30;
        double cantidad_restante_cancion_ingles =cant_cancion_ingles - 10;
        double cantidad_restante_cancion_espanol =cant_cancion_espanol - 10;
        if (cantidad_restante_cancion_ingles>0){
            total_ingles=cantidad_restante_cancion_ingles*1.5+10*3;
        }else{
            total_ingles= cant_cancion_ingles*3;
        }
        if (cantidad_restante_cancion_espanol>0){
            total_espanol=cantidad_restante_cancion_espanol*1+10*2;
        }else{
            total_espanol= cant_cancion_espanol*2;
        }

        return total_ingles+total_espanol+tarifa_mensual;
    }
    public static double Calcular_pago_pgrupal(int cant_cancion_ingles, int cant_cancion_espanol){

        double total_espanol=0;
        double total_ingles=0;
        double tarifa_mensual = 70;
        double cantidad_restante_cancion_ingles =cant_cancion_ingles - 15;
        double cantidad_restante_cancion_espanol =cant_cancion_espanol - 15;
        if (cantidad_restante_cancion_ingles>0){
            total_ingles=cantidad_restante_cancion_ingles*1+15*2.5;
        }else{
            total_ingles= cant_cancion_ingles*2.5;
        }
        if (cantidad_restante_cancion_espanol>0){
            total_espanol=cantidad_restante_cancion_espanol*0.5+15*1.5;
        }else{
            total_espanol= cant_cancion_espanol*1.5;
        }

        return total_ingles+total_espanol+tarifa_mensual;
    }
    public static double Calcular_pago_perfil(String tipo_perfil,int cant_cancion_ingles, int cant_cancion_espanol){
        double pago_segun_perfil=0;
        switch(tipo_perfil) {
            case "u":
                // code block
                pago_segun_perfil=Calcular_pago_punico(cant_cancion_ingles,cant_cancion_espanol);
                break;
            case "g":
                // code block
                pago_segun_perfil=Calcular_pago_pgrupal(cant_cancion_ingles,cant_cancion_espanol);
                break;
            default:
                // code block
                System.out.println("Ingrese la letra u para perfil unico y g para perfil general");
        }
        return pago_segun_perfil;
    }
    public static void main(String[] args){
        int cant_cancion_ingles =15;
        int cant_cancion_espanol;
        double precio_espanol = 2;
        double precio_ingles = 0;
        double total_espanol=0;
        double total_ingles=0;
        int contador = 0;
        double restante_cantidad_cancion_ingles =cant_cancion_ingles - 10;
        System.out.println("Calcular_pago_punico "+Calcular_pago_punico(10,11));
        System.out.println("Calcular_pago_punico "+Calcular_pago_pgrupal(1,1));
        System.out.println("Calcular_pago_punico "+Calcular_pago_perfil("g",1,1));


    }
}
