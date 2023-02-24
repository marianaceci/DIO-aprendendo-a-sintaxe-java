import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class ArrayEx4 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[4][4]; //[4]linhas e [4]colunas

    for (int i = 0; i < matriz.length; i++) { //linha
      for (int j = 0; j < matriz[i].length; j++) { //coluna dentro de cada linha
        matriz[i][j] = random.nextInt(9);
      }
    }

    System.out.println("Matriz: ");
    for (int[] linha : matriz) { //cada linha dentro da matriz é um array
      for (int coluna : linha) { //cada coluna dentro de cada linha é um inteiro
        System.out.print(coluna + " ");
      }
      System.out.println();
    }
  }
}
