package listaencadeada_pizza;

public class Principal {
    public static void main(String[] args) {
		CarrinhoCompras sacola = new CarrinhoCompras();
		
		Pizza p1 = new Pizza("Palmito");				// 50.0
		Pizza p2 = new Pizza("Frango com catupiry");	// 40.0
		Pizza p3 = new Pizza("Peperoni");				// 50.0
		Pizza p4 = new Pizza("Forneiro");				// 60.5
 
		p1.adicionaIngrediente("palmito");
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("azeitona");

		p2.adicionaIngrediente("frango");
		p2.adicionaIngrediente("catupiry");

		p3.adicionaIngrediente("molho de tomate");
		p3.adicionaIngrediente("queijo");
		p3.adicionaIngrediente("peperoni");
		p3.adicionaIngrediente("cebola");
		
		p4.adicionaIngrediente("carne moida");
		p4.adicionaIngrediente("limao");
		p4.adicionaIngrediente("mussarela");
		p4.adicionaIngrediente("azeitonas");
		p4.adicionaIngrediente("molho de tomate");
		p4.adicionaIngrediente("oregano");

		sacola.adicionarItem(p1);
		sacola.adicionarItem(p2);
		
		System.out.printf("\n Quantidade de itens na sacola : %d", sacola.getQtde_itens());
		System.out.printf("\n Total a pagar pela sacola : %.2f", sacola.getTotal_pagar());
	}
}
