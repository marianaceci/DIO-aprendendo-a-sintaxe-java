package edu.mari.segundasemana;
public class MinhaClasse {
  public static void main(String[] args) {

    //System.out.print("Oiiiiiii");

    //VARIÁVEIS:
    /*     
    String meuNome = "Mari";
    int anoNasc = 1989;
    boolean verdade = true;
    boolean falso = false;
    anoNasc = 1990;
    */

    //MÉTODOS:
    String nomeCompleto = nomeCompleto("Mariana", "Schmidt");
    System.out.print(nomeCompleto);
  }
  
  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    //return primeiroNome.concat(" ").concat(segundoNome);
    return primeiroNome + " " + segundoNome;
  }
}
