package exercício5;

import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[][] M = new int[4][4];
		
		Random numRandom = new Random(); 
		
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				M[i][j] = numRandom.nextInt(10);
			}
		}
		
		int maior = 0;
		int linha = 0;
		int coluna = 0;
	

		for(int i = 0; i < M.length; i++) {	
			for(int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j] + "|");
			}
			System.out.println();
		}
		
		for(int i = 0; i < M.length; i++) {	
			for(int j = 0; j < M[i].length; j++) {
				if(M[i][j] > maior) {
					maior = M[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		System.out.println("Maior número " + maior + " Linha " + linha + " Coluna " + coluna);
	}

}
