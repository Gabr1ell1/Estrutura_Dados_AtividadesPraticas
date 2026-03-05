package listaencadeada_pessoas;

public class Principal {

    public static void main(String[] args) {
        
        // Criação de uma lista encadeada vazia
        ListaEncadeada l1 = new ListaEncadeada();
        
        // Criando objetos do tipo Pessoa
        Pessoa p1 = new Pessoa("João");
        Pessoa p2 = new Pessoa("Maria");
        Pessoa p3 = new Pessoa("Ana");
        Pessoa p4 = new Pessoa("Pedro");
        Pessoa p5 = new Pessoa("Bia");
        Pessoa p6 = new Pessoa("Paulo");
        
        // Adiciona João no final da lista
        l1.adicionarElementoNoFimDaLista(p1);
        
        // Esta linha está comentada (não executa)
        // Se estivesse ativa, adicionaria João no início da lista
        // l1.adicionarElementoNoInicioDaLista(p1);
        
        // Adiciona Maria no início da lista
        l1.adicionarElementoNoInicioDaLista(p2);
        
        // Adiciona Ana no início da lista
        l1.adicionarElementoNoInicioDaLista(p3);

        // Adiciona Pedro na posição 1 da lista
        // (posição começa geralmente do 0)
        l1.adicionarElementoNoMeioDaLista(1, p4);
        
        // Adiciona Bia no final da lista
        l1.adicionarElementoNoFimDaLista(p5);
        
        System.out.println("Mostrando a lista após incluir 5 pessoas");
        
        // Mostra todas as pessoas da lista
        l1.listarTodasPessoasDaLista();    
        
        System.out.println("Mostrando a lista após adicionar o Paulo no início da lista");
        
        // Adiciona Paulo no início da lista
        l1.adicionarElementoNoInicioDaLista(p6);    
        
        // Mostra novamente a lista
        l1.listarTodasPessoasDaLista();

        System.out.println("  ");
        System.out.println("Mostra a lista após apagar p2 e p3");
        
        // Remove Maria da lista
        l1.removerPessoaDaLista(p2);
        
        // Remove Ana da lista
        l1.removerPessoaDaLista(p3);
        
        // Mostra a lista final após remoções
        l1.listarTodasPessoasDaLista();
    }
}