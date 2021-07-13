import java.util.Arrays;

public class actividad4b4 {

    private static String codigoAlumnoParticipante[] = {"MO10042460020170013", "MO11052560120170013",
            "MO12062660220170013",
            "MO13072760320170013", "MO14082860420170013", "MO15092960520170013","MO16103060620170013",
            "MO17113160720170013","MO18123260820170013"};
    private static int calcularAlbumesMenorA250(String[] codigoAlumnoParticipante){
        int[] newArrayAlbumes = new int[4];
        int contadorMenor250=0;
        for(int i=0; i<codigoAlumnoParticipante.length; i++){
            //Tipo especial
            newArrayAlbumes[0] += Integer.parseInt(codigoAlumnoParticipante[i].substring(2,4));
            //Tipo estadios
            newArrayAlbumes[1] += Integer.parseInt(codigoAlumnoParticipante[i].substring(4,6));
            //Tipo escudos
            newArrayAlbumes[2] += Integer.parseInt(codigoAlumnoParticipante[i].substring(6,8));
            //Tipo jugadores
            newArrayAlbumes[3] += Integer.parseInt(codigoAlumnoParticipante[i].substring(8,11));

        }
        for(int i=0; i<newArrayAlbumes.length; i++){
            if ( newArrayAlbumes[i]<250){
                contadorMenor250++;
            }
        }
        return contadorMenor250;
    }

    public static void main(String[] args) {

        System.out.println("Cantidad de albumes que tienen menos de 250 figuras en total: "+calcularAlbumesMenorA250(codigoAlumnoParticipante));
    }
}
