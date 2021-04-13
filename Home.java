package Sistema_Gerinciamento;

import java.util.Scanner;
import java.io.IOException;


public class Home {
	
	static Obras geObras = new Obras();
	
	static Scanner in = new Scanner(System.in);
	
	
	
	public static void input() {
		
		System.out.print("ID:");
		geObras.id = in.nextInt();
		Obras.clearBuffer(in);
		
		System.out.print("Nome:");
		geObras.titulo = in.nextLine();
		//clearBuffer(in);
		
		System.out.print("Editora:");
		geObras.editora = in.nextLine();
		//clearBuffer(in);
		
		System.out.print("Foto:");
		geObras.foto = in.nextLine();
		//clearBuffer(in);
		
		System.out.print("Autor:");
		geObras.autores = in.nextLine();
		//clearBuffer(in);
		
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int op = 10;
		
		
		System.out.println("Bem Vindo ao sistema da Biblioteca GothBoiClque!\n");
		
		
		do {
			System.out.print("0 - Sair."
					+ "\n1 - Cadastrar livros."
					+ "\n2 - Listar os livros."
					+ "\n3 - Atualizar o cadastro."
					+ "\n4 - Deletar livros."
					+ "\n\nEscolha alguma opção:");
			op = in.nextInt();
			geObras.quebraLinha();
			
			switch (op) {
			case 1:
				input();
				geObras.postLivros(geObras.id, geObras.titulo, geObras.editora, geObras.foto, geObras.autores);
				break;
			case 2:
				geObras.getLIvros();
				break;
				
			case 3:
				input();
				geObras.putLivros(geObras.id, geObras.titulo, geObras.editora, geObras.foto, geObras.autores);
				break;
			case 4:
				System.out.print("Informe o ID do livro:");
				geObras.id = in.nextInt();
				geObras.deleteLivros(geObras.id);
				break;	
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
				

			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
			
		} while (op != 0);
		

	}
	
	

}
