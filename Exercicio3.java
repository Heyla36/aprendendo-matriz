package exercício5;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] M = new int[3][3];
		
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++){
			System.out.println("Entre com o valor da posição [" + i + "," +  j + "]");
			M[i][j] = scan.nextInt(); 
			}
		}
		
		int qtdpar = 0;
		int qtdimpar = 0;
		
		for(int i = 0; i < M.length; i++ ) {
			for(int j = 0; j < M[i].length; j++){
				
				if(M[i][j] % 2 == 0) {
					qtdpar++;
				
			}else {
				qtdimpar++;
			}	// NÃO ACABOU
		}
	}		
		
		for(int i = 0; i < M.length; i++ ) {
			for(int j = 0; j < M[i].length; j++){
				System.out.print(M[i][j] + " ");
			
			}
		}
		
		System.out.println();
		
		System.out.println("Quantidade Pares: " + qtdpar);
		System.out.println("Quantidade Impares: " + qtdimpar);

		scan.close();
	}

}
