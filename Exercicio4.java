package exercício5;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] compromisso = new String[31][24];
		
		int opcao;
		boolean sair = false;
		
		while(!sair) {
			System.out.println("Digite 1 para entrar com um novo compromisso;");
			System.out.println("Digite 2 para verificar compromisso;");
			System.out.println("Digite 0 para sair;");
			
			opcao = scan.nextInt();
			
			if(opcao == 1){ // adicionar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				
				while(!diaValido) {
				
					System.out.println("Entre com o dia do mês: ");
					dia = scan.nextInt();
					
					if(dia > 0 && dia <=31) {
						diaValido = true;
						
					}else {
						System.out.println("Insira um dia válido");
						
					}
				}
				
				boolean horas = false;
				int hora = 0;
				
				while(!horas) {
			
					System.out.println("Entre com a hora: ");
					hora = scan.nextInt();
					
					if(hora > 0 && hora <= 24 ) {
						horas = true;
					
					}else {
						System.out.println("Insira uma hora válida");
					}
				}
				
				dia--; // para retirar um dia
				System.out.println("Entre com o compromisso: ");
				compromisso[dia][hora] = scan.next();
				
			}else if (opcao == 2) {
				
				boolean diaValido = false;
				int dia = 0;
				
				while(!diaValido) {
				
					System.out.println("Entre com o dia do mês: ");
					dia = scan.nextInt();
					
					if(dia > 0 && dia <=31) {
						diaValido = true;
						
					}else {
						System.out.println("Insira um dia válido");
						
					}
				}
				
				boolean horas = false;
				int hora = 0;
				
				while(!horas) {
			
					System.out.println("Entre com a hora: ");
					hora = scan.nextInt();
					
					if(hora > 0 && hora <= 24 ) {
						horas = true;
					
					}else {
						System.out.println("Insira uma hora válida");
					}
				}
				
				dia--;
				System.out.println("Compromisso no dia: ");
				System.out.println(compromisso[dia][hora]);
				
			}else if (opcao == 0) {
				sair = true;
			
			}else {
				System.out.println("Opção inválida, digite novamente.");
			}
		}
		
		scan.close();
	}

}
