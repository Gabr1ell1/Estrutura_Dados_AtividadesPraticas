# Estrutura Dados

*Listas (simplesmente) Encadeada*

A flexibilidade da lista é importante.
Complexo em nível de programação, possui conceitos de ponteiros e referências.
Podem ser implementadas em vetor.

Importante entender o que acontece com os ponteiros:
Em linguagens como C, chama-se ponteiro. Em Java, referência.
Mas possuem a mesma ideia: É algo que aponta para outro objeto.

Exemplo visto no código:
	Pessoa p1 = new Pessoa("Ana");
p1 não é a Ana.
p1 é a referência para o objeto Ana.

*Métodos Destrutores (importante estudar)*
- Métodos que removem elementos
- Ajustam as ligações da lista
- Oposto da inserção


*Lista Circular*
Quando o primeiro aponta para o último e vice-versa (também pode ser duplamente encadeada).
- Não termina em null

*Duplamente Encadeada*
Cada elemento sabe quem é o próximo e quem é o anterior.
- Dá pra percorrer pra frente e pra trás

Fila - Os elementos são adicionados ao final da ordem. (Conceito normal de uma fila)
- Adiciona no final
- Remove só da frente
- FIFO → Primeiro que entra, primeiro que sai


📌Orientação:
Estude os códigos de lista juntamente com os métodos da classe. Procure entender o que está acontecendo em cada parte e qual é o propósito de cada trecho do código.
