package carregabanco;

import java.util.Scanner;

import carregabanco.model.AlunoModel;
import carregabanco.view.CarregaBancoView;


public class CarregaBanco {
	public static void main(String[] args) {
		new CarregaBancoView();
		
			int opcao = 0;
			Scanner scanner = new Scanner(System.in);
			
			do {
				System.out.println("Digite:");
				System.out.println("1 - Cadastrar Aluno");
				System.out.println("2 - Excluir Aluno");
				System.out.println("3 - Buscar Aluno");
				System.out.println("4 - Lista de Alunos");
				
				opcao = Integer.parseInt( scanner.nextLine() );
				
				switch(opcao) {
					case 1: 
						cadastrar(scanner);
						break;
					case 2: 
						//excluir(scanner);
						break;
					case 3:
						//buscarAluno(scanner);
						break;
					case 4:
						//buscarTodosAlunos(scanner);
						break;
					default:
						System.out.println("Opção Inválida!!");
						break;
				}
				
			}while(opcao!=0);
		}

		
	public static void cadastrar(Scanner scanner) {
		
		System.out.println("######################### Cadastrar Aluno #########################");
		
		System.out.println("Digite nome do Aluno: ");
		String nome = scanner.nextLine();
		System.out.println("Digite a Coordenação: ");
		String coord = scanner.nextLine();
		System.out.println("Digite o Curso: ");
		String curso = scanner.nextLine();
		System.out.println("Situação do Aluno: ");
		String sit = scanner.nextLine();
		System.out.println("Período de Entrada: ");
		String ano = scanner.nextLine();
		
		AlunoModel aluno = new AlunoModel(nome, coord, curso, sit, ano);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		    
	}	

