package br.com.barros.forma.pagamento;


public class Item {

	String nome;
	int preco;
	
	public Item(String nome, int preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
}
