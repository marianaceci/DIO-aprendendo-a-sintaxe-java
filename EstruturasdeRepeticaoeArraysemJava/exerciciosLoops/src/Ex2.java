import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;

    System.out.println("Insira um nota: ");
    nota = scan.nextInt();
    
    while(nota < 0 | nota > 10) {      
      System.out.println("Nota inválida, tente novamente: ");
      nota = scan.nextInt();
    }
    System.out.println("Programa finalizado");
  }
}
