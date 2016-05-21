package br.com.barros.forma.pagamento;

public class PayPal implements Pagamento {

	String email;
	String senha;
	
	public PayPal(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	@Override
	public void pague(int valor) {
		System.out.println(valor + "Pago no PayPal na conta de : " + this.email);
	}
}
