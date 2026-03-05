package listaencadeada_pizza;

public class Pizza {
private String sabor;
	private double preco;
	private static int qtde_pizzas=0;
	
	ListaSequencial ingredientes = new ListaSequencial();
	
	public Pizza(String sabor) {
		this.sabor = sabor;
	}
	
	public String getSabor() {
		return sabor;
	}
	
	public double getPreco() {
		if (ingredientes.tamanho()<3)
			preco = 40.0;
		else if (ingredientes.tamanho()>=3 && ingredientes.tamanho()<=5)
			preco = 50.0;
		else
			preco = 60.5;
		return preco;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void adicionaIngrediente(String nome) {
		ingredientes.adiciona(nome);
	}
    
    
}
