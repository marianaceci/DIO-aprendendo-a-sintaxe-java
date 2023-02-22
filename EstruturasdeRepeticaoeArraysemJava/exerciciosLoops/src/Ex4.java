import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n;
    int pares = 0;
    int impares = 0;

    System.out.println("Digite um número: ");
    n = scan.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0){
        pares++;
      } else {
        impares++;
      }
    }
      System.out.println("Pares: " + pares);
      System.out.println("Impares: " + impares);
  }
}
