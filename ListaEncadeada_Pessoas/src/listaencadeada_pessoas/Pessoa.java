package listaencadeada_pessoas;

/*
 * ==========================================================
 * CLASSE PESSOA
 * ==========================================================
 * 
 * IMPORTÂNCIA:
 * Essa classe representa um NÓ da lista encadeada.
 * 
 * O que é um nó?
 * É cada elemento individual da lista.
 * 
 * Cada objeto Pessoa guarda:
 *   - Um dado (nome)
 *   - Uma referência para a próxima Pessoa da lista
 * 
 * Visualmente funciona assim:
 * 
 * [Nome | referência para próxima Pessoa]
 * 
 * Exemplo:
 * Ana → Maria → João → null
 * 
 * Ou seja:
 * Cada Pessoa sabe quem vem depois dela.
 * 
 * A classe ListaEncadeada apenas controla o início da lista.
 * Mas quem forma a corrente são os objetos Pessoa.
 * 
 * ==========================================================
 */

public class Pessoa {
    
    // DADO armazenado no nó
    private String nome;
    
    // REFERÊNCIA para o próximo nó da lista
    private Pessoa proxima;
    
    
    // Construtor: cria uma pessoa com nome
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    
    // ======================
    // SETTERS
    // ======================
    
    // Define quem será o próximo da lista
    public void setProximo(Pessoa proxima) {
        this.proxima = proxima;
    }
    
    
    // Método de validação (ainda não implementado de verdade)
    private boolean ehValido(String nome){
        return true;
    }
    
    
    public void setNome(String nome) {
        if(this.ehValido(nome)) 
             this.nome = nome;
    }
    
    
    // ======================
    // GETTERS
    // ======================
    
    // Retorna quem é o próximo
    public Pessoa getProxima() {
        return proxima;
    }
    
    
    // Retorna o nome
    public String getNome(){
        return nome;
    }
    
    
    // Define como o objeto aparece no print
    public String toString() {
        return nome;
    }    
}