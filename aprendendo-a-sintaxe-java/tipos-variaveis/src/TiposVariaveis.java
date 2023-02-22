public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //VAR vs. CONST
        int numero = 5;
        numero = 10;
        System.out.print(numero); //10

        final double VALOR_DE_PI = 3.14; //final não pode ser alterado		
        //VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
    
        //ver tipos primitivos
    }
}
