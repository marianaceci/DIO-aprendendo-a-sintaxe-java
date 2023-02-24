import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    System.out.println("Digite um numero: ");
    numero = scan.nextInt();

    int mult = 1;

    for (int i = 1; i <= numero; i++) {
      mult = mult * i;
    }
    System.out.println(numero + "! = " + mult);
  }
}
