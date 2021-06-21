package exercício5;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		int[][] M = new int[10][10];
		
		Random numRandom = new Random(); 
		
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				M[i][j] = numRandom.nextInt(10);
			}
		}
		
		for(int i = 0; i < M.length; i++) {	
			for(int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j] + "|");
			}
			System.out.println();
		}
		
		int maiorl5 = 0;
		int menorl5 = Integer.MAX_VALUE;
		int linha5 = 5;
		
		for(int i = 0; i < M[linha5].length; i++) {	//hard coded [5] se colocasse apenas o número
		
				if(M[linha5][i] > maiorl5) {
					maiorl5 = M[linha5][i];
			}
				if (M[linha5][i] < maiorl5 ) {
					menorl5 = M[linha5][i];
				}
		}
		
		System.out.println("Maior valor linha 5 = " + maiorl5);
		System.out.println("Menor valor linha 5 = " + menorl5);
		
		int maiorc7 = 0;
		int menorc7 = Integer.MAX_VALUE;
		int col7 = 7;
		
		for(int i = 0; i < M.length; i++) {
			if(M[i][col7] > maiorc7) {
				maiorc7 = M[i][col7];
			}
			if(M[i][col7] < menorc7) {
				menorc7 = M[i][col7];
			}
		}
		
		System.out.println("Maior valor linha 7 = " + maiorc7);
		System.out.println("Menor valor linha 7 = " + menorc7);
		
	}

}
