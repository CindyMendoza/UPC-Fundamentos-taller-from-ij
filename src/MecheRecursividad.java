public class MecheRecursividad {
    private static int f(int a, int b) {
        int resultado=0;

        if(a<=0||b<=0){
            return resultado= 0;
        }else {
            if(a<b){

                return f(a+2,b-3)+4;
//            System.out.println(resultado);
            }else if(a>b){

                return  f(a-3,b+4)-2;
//            System.out.println(resultado);
            }else if (a==b){

                return  5;
//            System.out.println(resultado);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(f(10,2));
//        System.out.println(f(10,2));
//        System.out.println(f(20,20));
    }
}
