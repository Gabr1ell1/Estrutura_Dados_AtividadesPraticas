package listaencadeada_pessoas;

/*
 * ==========================================================
 * CLASSE LISTA ENCADEADA
 * ==========================================================
 *
 * IMPORTÂNCIA:
 * Essa classe é responsável por CONTROLAR a lista encadeada.
 *
 * Ela não é um nó.
 * Quem é o nó é a classe Pessoa.
 *
 * A ListaEncadeada apenas guarda:
 *   - A primeira pessoa da lista (cabeça)
 *   - A última pessoa da lista (cauda)
 *   - O total de elementos
 *
 * Visualmente:
 *
 * cabeca → Pessoa → Pessoa → Pessoa → null
 *                                ↑
 *                              cauda
 *
 * Ou seja:
 * A lista começa na cabeça.
 * A cauda aponta para o último elemento.
 *
 * ==========================================================
 */

public class ListaEncadeada {

    // Primeiro elemento da lista
    private Pessoa cabeca = null;

    // Último elemento da lista
    private Pessoa cauda = null;

    // Quantidade de elementos
    private int total = 0;

    
    // ==================================================
    // ADICIONAR NO FIM
    // ==================================================
    public void adicionarElementoNoFimDaLista(Pessoa p) {

        // Se a lista estiver vazia
        if(cabeca == null) {
            cabeca = p;
            cauda = p;
        }
        // Se já existir elemento
        else if(cauda.getProxima() == null) {
            cauda.setProximo(p); // antigo último aponta para o novo
            cauda = p;           // atualiza a cauda
        }

        total++;
    }


    // ==================================================
    // ADICIONAR NO INÍCIO
    // ==================================================
    public void adicionarElementoNoInicioDaLista(Pessoa p) {

        // Novo elemento aponta para a antiga cabeça
        p.setProximo(cabeca);

        // Cabeça passa a ser o novo elemento
        cabeca = p;
    }


    // ==================================================
    // ADICIONAR NO MEIO
    // ==================================================
    public void adicionarElementoNoMeioDaLista(int posicao, Pessoa p) {

        Pessoa aux = this.cabeca;

        for(int i = 0; i <= posicao; i++) {

            if(i >= posicao) {

                // Novo aponta para o próximo do atual
                p.setProximo(aux.getProxima());

                // Atual aponta para o novo
                aux.setProximo(p);
            }

            aux = aux.getProxima();
        }

        total++;
    }


    // ==================================================
    // REMOVER ELEMENTO
    // ==================================================
    public void removerPessoaDaLista(Pessoa p) {

        Pessoa aux = this.cabeca;

        while(aux != null) {

            // Se o próximo for o elemento que queremos remover
            if(aux.getProxima() == p) {

                Pessoa proxima = aux.getProxima();

                // Pula o elemento removido
                aux.setProximo(proxima.getProxima());
            }

            // Caso seja o primeiro elemento
            else if(aux == p) {
                cabeca = p.getProxima();
            }

            aux = aux.getProxima();
        }
    }


    // ==================================================
    // MOSTRAR PRIMEIRA
    // ==================================================
    public String mostrarPrimeiraPessoaDaLista() {
        return cabeca.getNome();
    }


    // ==================================================
    // MOSTRAR ÚLTIMA
    // ==================================================
    public String mostrarUltimaPessoaDaLista() {
        return cauda.getNome();
    }


    // ==================================================
    // LISTAR TODOS
    // ==================================================
    public void listarTodasPessoasDaLista() {

        Pessoa aux = cabeca;

        while (aux != null) {
            System.out.println(aux.getNome());
            aux = aux.getProxima();
        }
    }
}

/*
 * Orientação:
 * Estudar o código da lista junto com os métodos da classe,
 * buscando compreender o que está acontecendo em cada parte
 * e qual é o propósito de cada método implementado.
 */