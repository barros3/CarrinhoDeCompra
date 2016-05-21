package br.com.barros.forma.pagamento;

public class Cartao implements Pagamento {

	String bandeira;
	String nome;
	String numeroDoCartao;
	String dataVencimento;
	
	public Cartao(String bandeira, String nome, String numeroDoCartao, String dataVencimento) {
		this.bandeira = bandeira;
		this.nome = nome;
		this.numeroDoCartao = numeroDoCartao;
		this.dataVencimento = dataVencimento;
	}
	
	@Override
	public void pague(int valor) {
		System.out.println(valor + "Pago no cartão de: " + this.nome);
	}
}
