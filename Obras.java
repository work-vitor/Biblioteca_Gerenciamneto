package Sistema_Gerinciamento;

import java.util.Scanner;

public class Obras {
		
		final static int CO = 5;
		String[][] livros = new String[CO][CO];
		int id;
		String titulo;
		String editora;
		String foto;
		String autores;
		
		public Obras() {
			for (int i = 0; i < livros.length; i++) {
				
				for (int j = 0; j < livros.length; j++) {
					livros[i][j] = "-";
				}
			}
		}
		
		//Adicionar o livro ao sistema -  Create
		public void postLivros(int id, String titulo, String editora, String foto, String autores) {
			
			if(id>CO){
				quebraLinha();
				System.out.println("Erro!! ID maior que a capacidade do banco!!");
			}
			else if(this.livros[id-1][0].contentEquals(Integer.toString(id))) {
				quebraLinha();
				System.out.println("Erro!! ID já cadastrado!");
			}
			else {
			
				this.livros[id-1][0] = Integer.toString(id);
				this.livros[id-1][1] = titulo;
				this.livros[id-1][2] = editora;
				this.livros[id-1][3] = foto;
				this.livros[id-1][4] = autores;
				
				System.out.println("Livro cadastrado com sucesso!");
				quebraLinha();
				getLIvros();
				quebraLinha();
			}
		}
		
		//Listara todos os livros - Read
		public void getLIvros() {
			
			quebraLinha();
			System.out.println("Livros cadastrados:");
			quebraLinha();
			System.out.println("ID | Titulo | Editora | Foto | Autor");
			
			for (int i = 0; i < livros.length; i++) {
				
				for (int j = 0; j < livros.length; j++) {
					System.out.print(livros[i][j]+"|");
				}
				
				quebraLinha();
			}
			
			quebraLinha();
			
		}
		
		//Atualizara os dados cadastrados - update
		public void putLivros(int id, String titulo, String editora, String foto, String autores) {
			
			if(this.livros[id-1][0].contentEquals("-") || id>CO) {
				quebraLinha();
				System.out.println("Erro!! Esse ID não possui cadastro!");
				System.out.println("Realize o cadastro do livro antes de atualizar!");
				quebraLinha();
			}
			else {
			
				this.livros[id-1][0] = Integer.toString(id);
				this.livros[id-1][1] = titulo;
				this.livros[id-1][2] = editora;
				this.livros[id-1][3] = foto;
				this.livros[id-1][4] = autores;
				quebraLinha();
				System.out.println("Livro atualizado com sucesso!");
				quebraLinha();
				getLIvros();
				quebraLinha();
			}
		}
		
		//Deletara os dados - delete
		public void deleteLivros(int id) {
			
			if(this.livros[id-1][0].contentEquals("-") || id>CO) {
				quebraLinha();
				System.out.println("Erro!! Esse ID não possui cadastro!");
				System.out.println("Realize o cadastro do livro antes de tentar deletar!");
			}
			else {
				for (int j = 0; j < livros.length; j++) {
					livros[id-1][j] = "-";
				}
				quebraLinha();
				System.out.println("Livro deletado com sucesso!\n");
				quebraLinha();
				getLIvros();
				quebraLinha();
			}
			
			
		}
		
		
		//Metodo para limpar o buffer
		 public static void clearBuffer(Scanner scanner) {
		        if (scanner.hasNextLine()) {
		            scanner.nextLine();
		        }
		    }
		 
		 //Metodo para quebra de linha
		 public  void quebraLinha() {
				System.out.println();
			}
		
		
		
}
