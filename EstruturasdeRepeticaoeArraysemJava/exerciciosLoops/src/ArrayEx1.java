/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class ArrayEx1 {
  public static void main(String[] args) {
    int[] vetor = { -1, 5, -7, 10, 15, 2 };

    System.out.print("Vetor: ");
    int count = 0;
    while (count < vetor.length) {
      System.out.print(vetor[count] + " ");
      count++;
    }

    System.out.print("\nVetor: ");
    for (int i = (vetor.length-1); i >= 0; i--) {
      System.out.print(vetor[i] + " ");

    }
  }
}
