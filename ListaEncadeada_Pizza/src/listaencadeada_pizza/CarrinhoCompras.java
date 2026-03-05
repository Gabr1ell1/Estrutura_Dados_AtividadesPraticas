package listaencadeada_pizza;

public class CarrinhoCompras {
	private double total_pagar = 0;
	private int qtde_itens = 0;
	
	ListaSequencial carrinho = new ListaSequencial();
	
	public void adicionarItem(Pizza p) {
		carrinho.adiciona(p);
		total_pagar += p.getPreco();
		qtde_itens++;
	}

	public double getTotal_pagar() {
		return total_pagar;
	}

	public int getQtde_itens() {
		return qtde_itens;
	}
}

