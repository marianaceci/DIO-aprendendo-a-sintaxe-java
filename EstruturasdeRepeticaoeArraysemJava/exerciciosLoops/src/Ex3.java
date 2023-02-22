import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;
    int maiorNota = 0;
    int soma = 0;
    int notas = 5;

    do {
      System.out.println("Digite a nota: ");
      nota = scan.nextInt();
      soma += nota;

      if(nota > maiorNota) maiorNota = nota;

      notas--;
    } while(notas > 0);

    System.out.println("Maior nota: " + maiorNota);
    System.out.println("Média: " + (soma/5));
  }
}
