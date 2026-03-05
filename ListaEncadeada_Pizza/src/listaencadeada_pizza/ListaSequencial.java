package listaencadeada_pizza;

public class ListaSequencial {
    private Object[] vetor = new Object[10];
	private int totalDeObjetos = 0;
	
	public void adiciona(Object elemento) {
		garantaEspaco();
		vetor[totalDeObjetos] = elemento;
		totalDeObjetos++;
	}
	
	private void garantaEspaco() {
		if(totalDeObjetos == vetor.length) {
			Object[] novo_vetor = new Object[vetor.length*2];
			for(int i=0; i<vetor.length; i++) {
				novo_vetor[i] = vetor[i];
			}
			vetor = novo_vetor;
		}
	}

	private boolean posicaoEhValida(int posicao) {
		return ((posicao>=0) && (posicao<totalDeObjetos));
	}
	
	public void adiciona(Object elemento, int posicao) {
		garantaEspaco();
		if(!posicaoEhValida(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida!!!");
		}
		for(int i=totalDeObjetos-1; i>=posicao;i--) {
			vetor[i+1]=vetor[i];
		}
		vetor[posicao]=elemento;
		totalDeObjetos++;
	}

	public int tamanho() {
		return totalDeObjetos;
	}
	
	public void remove(int posicao) {
		if(!posicaoEhValida(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida!!!");
		}
		for(int i=posicao; i<totalDeObjetos; i++) {
			vetor[i]=vetor[i+1];
		}
		totalDeObjetos--;
	}

	public boolean contem(Object elemento) {
		boolean resposta = false;
		for(int i=0; i<totalDeObjetos; i++) {
			if(elemento.equals(vetor[i])) {
				resposta = true;
				i=totalDeObjetos;
			}
		}
		return resposta;
	}
}
