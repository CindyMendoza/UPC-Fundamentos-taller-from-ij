public class actividad4b2 {

    private static String codigoAlumnoParticipante[] = {
            "MO13072760320170013", "MO14082860420170013", "MO15092960520170013","MO16103060620170013",
            "MO17113160720170013","MO18123260820170013","SM10042460020170013", "SM11052560120170013",
            "SM12062660220170013",
            "SM13072760320170013", "SM14082860420170013", "SM15092960520170013","SM16103060620170013",
            "SM17113160720170013","SM18123260820170013","SI10042460020170013", "SI11052560120170013",
            "SI16103060620170013",
            "SI17113160720170013","SI18123260820170013", "VI11052560120170013",
            "VI12062660220170013",
            "VI13072760320170013", "VI14082860420170013", "VI15092960520170013","VI16103060620170013",
            "VI17113160720170013","VI18123260820170013"};

    static int calcularAlbumesPorSede(String[]codigosAlumnosParticipantes,String sede){
        int contadorAlbum=0;
        for (int i=0;i<codigosAlumnosParticipantes.length ;i++ ) {
            if(codigosAlumnosParticipantes[i].substring(0,2).equals(sede))
                contadorAlbum++;
        }return contadorAlbum;
    }
    public static void main(String[] args) {
        System.out.println(calcularAlbumesPorSede(codigoAlumnoParticipante,"MO"));


    }
}
