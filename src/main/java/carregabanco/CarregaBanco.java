package carregabanco;

import java.util.Scanner;

import carregabanco.model.AlunoModel;
import carregabanco.repository.AlunoDao;
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
						excluir(scanner);
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
		System.out.println("Digite o Campus: ");
		String campus = scanner.nextLine();
		System.out.println("Digite o Email Institucional: ");
		String email_institucional = scanner.nextLine();
		System.out.println("Digite a Idade: ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Digite o Polo: ");
		String polo = scanner.nextLine();
		System.out.println("Digite o Sexo: ");
		String sexo = scanner.nextLine();
		System.out.println("Situação do Aluno: ");
		String sit = scanner.nextLine();
		System.out.println("Período de Entrada: ");
		String ano = scanner.nextLine();
		
		
		AlunoDao alunodao = AlunoDao.getInstance();
		AlunoModel aluno = new AlunoModel(campus, polo, email_institucional, idade, sexo, nome, coord, curso, sit, ano);
		alunodao.persist(aluno);	
		
	}
	
	
		public static void excluir(Scanner scanner) {
		
		System.out.println("######################### Excluir Aluno #########################");

		System.out.println("Digite o  ID do Aluno que deseja Excluir:");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		
		AlunoDao alunodao = AlunoDao.getInstance();
		//AlunoModel aluno = new AlunoModel();
		alunodao.removeById(id);;	
		
	}
	
	
	
		
		    
}	

