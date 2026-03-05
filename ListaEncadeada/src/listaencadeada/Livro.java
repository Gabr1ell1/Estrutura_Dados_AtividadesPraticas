/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeada;

public class Livro{
    String nome;
    int ano;
    double preco;
    Livro Anterior;
    
    public Livro(String nome, int ano, double preco){
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }
    public Livro getAnterior(){
        return Anterior;
    }
    
    public void setAnterior(Livro anterior){
           this.Anterior = anterior;
    }
   
    
     @Override
    public String toString() {
	return "Nome: " + nome + " Ano: " + ano + " Preço: " + preco;
    }
}
