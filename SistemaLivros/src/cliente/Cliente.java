package cliente;

import livro.Livro;

public class Cliente {
	private int Id;
	private String Nome;
	private int Idade;
	private Livro LivroPego = null;
	
	public Cliente(int id, String nome, int idade) {
		Id = id;
		Nome = nome;
		Idade = idade;
		
	}

	public String getNome() {
		return Nome;
	}

	public void setLivroPego(Livro livroPego) {
		LivroPego = livroPego;
	}
}


