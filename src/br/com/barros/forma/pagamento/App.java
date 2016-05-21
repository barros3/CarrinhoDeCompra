package br.com.barros.forma.pagamento;

public class App {
	
	public static void main(String[] args) {
		
		Carrinho carrinho = new Carrinho();
		
		Item item = new Item("mouse", 120);
		carrinho.inserirNoCarrinho(item);
		
		item = new Item("teclado", 200);
		carrinho.inserirNoCarrinho(item);
		
		carrinho.formaDePagamento(new Cartao("visa", "Sabrina", "123123123", "25/12/3000"));
		
		carrinho.formaDePagamento(new PayPal("sabrina@gmail.com", "123"));
	
	}

}
