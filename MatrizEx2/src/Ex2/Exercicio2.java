package Ex2;

import java.util.Scanner;

public class Exercicio2 {
	public static void limpaTela() {
		for (int z = 0; z < 50; z++) {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual a ordem da matriz? (linha primeiro)");
		int linha = scanner.nextInt();
		System.out.println("Qual o número de colunas?");
		int coluna = scanner.nextInt();
		int matrizA[][] = new int[linha][coluna];
		
		System.out.println("Qual a ordem da matriz? (linha primeiro)");
		int linha2 = scanner.nextInt();
		System.out.println("Qual o número de colunas?");
		int coluna2 = scanner.nextInt();
		int matrizB[][] = new int[linha2][coluna2];
		
		if(coluna == linha2) {
			System.out.println("Digite os valores da primeira matriz: ");
			for(int l = 0; l < linha; l++) {
				for(int c = 0; c < coluna; c++) {
					System.out.println("Digite o número da linha " + (l+1) + " coluna " + (c+1) );
					matrizA[l][c] = scanner.nextInt();
				}
			}
			limpaTela();
			System.out.println("Digite os valores da segunda matriz: ");
			for(int l = 0; l < linha2; l++) {
				for(int c = 0; c < coluna2; c++) {
					System.out.println("Digite o número da linha " + (l+1) + " coluna " + (c+1) );
					matrizB[l][c] = scanner.nextInt();
				}
			}
			
			int matrizResultado[][] = new int[linha][coluna2];
			
			for(int l = 0; l < linha; l++) {
				for(int c = 0; c < coluna2; c++) {
					for (int r = 0; r < 3; r++) {
						matrizResultado[l][c] += matrizA[l][r] * matrizB[r][c];
					}
				}
			}
			limpaTela();
			System.out.println("A matriz ficou assim: ");
			for (int l = 0; l < linha; l++) {
				for(int c = 0; c < coluna2; c++) {
					if(c==0) {
					System.out.print("[ " + matrizResultado[l][c] + ", ");
					} else {
						System.out.println(matrizResultado[l][c] + " ]");
					}
				}
			}
		} else {
			System.out.println("Impossível multiplicar essas duas matrizes.");
		}
		scanner.close();
	}
}