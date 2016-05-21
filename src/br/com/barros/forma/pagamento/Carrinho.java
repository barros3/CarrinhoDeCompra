package br.com.barros.forma.pagamento;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	List<Item> items;
	
	public Carrinho() {
		this.items = new ArrayList<Item>();
	}
		
	public void inserirNoCarrinho(Item item){
		this.items.add(item);
	}
	
	public void removerDoCarrinho(Item item){
		this.items.remove(item);
	}
	
	public int valorDaCompra(){
		int valorTotal = 0;
		for(Item item: this.items){
			valorTotal += item.getPreco();
		}
		return valorTotal;
	}
	
	public void formaDePagamento(Pagamento pagamento){
		int total = valorDaCompra();
		pagamento.pague(total);
	}
}
