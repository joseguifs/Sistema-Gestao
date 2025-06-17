package livro;

import java.time.LocalDate;

import autor.Autor;

public class Livro {
	public int Id;
	public String Titulo;
	public 	Autor Autor; 
	public boolean Disponivel = true;
	public LocalDate DataCadastro = LocalDate.now();
	public LocalDate DataAtualizacao = null;
	
	public Livro(int id, String titulo, Autor autor) {
		Id = id;
		Titulo = titulo;
		Autor = autor;
	}
}
