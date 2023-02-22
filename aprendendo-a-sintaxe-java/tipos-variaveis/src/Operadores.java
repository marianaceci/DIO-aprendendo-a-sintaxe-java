public class Operadores {
  public static void main(String[] args) {
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.print(nomeCompleto);

    
    String concatenacao ="?"; 

    concatenacao = 1 + 1 + 1 + "1";
    System.out.print(concatenacao); //31
    
    concatenacao = 1+"1"+1+1;
    System.out.print(concatenacao); //1111
    
    concatenacao = 1+"1"+1+"1";
    System.out.print(concatenacao); //1111
    
    concatenacao = "1"+1+1+1;
    System.out.print(concatenacao); //1111
    
    concatenacao = "1"+(1+1+1);
    System.out.print(concatenacao); //13

  }
}
