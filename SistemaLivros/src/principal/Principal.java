package principal;

import java.util.Scanner;

import autor.Autor;
import biblioteca.Biblioteca;
import livro.Livro;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 5;
		Autor autor = new Autor(1554, "Maquiavel", "18/03/2005");
		Livro livro = new Livro(1555,"PRINCIPE",autor);
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.AdiconarLivro(livro);
		System.out.println("Bem vindo a biblioteca --APRENDER NUNCA É DEMAIS--");
		
		do {

			System.out.println("Digite uma opcao:");
			System.out.println("1 - Sair do sistema");
			System.out.println("2 - Pegar livro emprestado");
			System.out.println("3 - Listar livros");
			System.out.println("4 - Criar conta");
			
			opc = sc.nextInt();
			switch (opc) {
				case 1: {
					break;
				}
				case 2: {
					System.out.println(biblioteca.emprestarLivro());
					break;
				}
				case 3: {
					biblioteca.ListarLivros();
					break;
				
				}
				case 4: {
					Biblioteca.cadastrarCliente();
					break;
					
				}
				default: {
					System.out.println("Opçao inválida");
					break;
				}
			}
		} while(opc != 1);
		System.out.println("Programa encerrado");
	}

}
