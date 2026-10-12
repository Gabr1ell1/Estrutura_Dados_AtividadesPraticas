package ativi;


import ativi.Grafo;


public class Main {
    public static void main(String[] args) throws Exception  {
        
        int[][] matriz = Matriz.lerMatriz("exeMatriz.txt");
        Grafo grafo = new Grafo(matriz);

        //a
        System.out.println("======  ARESTAS DO GRAFO ====== ");
        grafo.mostrarArestas();
        //b
        System.out.println("\nO grafo é dígrafo? \n" + grafo.eDigrafo());
        //c
        System.out.println("\n======  GRAU DE CADA VÉRTICE ====== ");
        grafo.mostrarGraus();
        //d
        System.out.println("\nO grafo é conexo? \n" + grafo.eConexo());
        //e
        System.out.println("\nO grafo possui ciclo? \n" + grafo.eciclo());
        //f
        System.out.println("\n====== LISTA DE ADJACENCIA ====== ");
        grafo.listaAdj();
        //g
        System.out.println("\nO grafo é completo? \n" + grafo.eCompleto());
                
        //h
        System.out.println("\nExiste algum vértice pendente ou isolado? \n" + grafo.verificacao());
        //i
        System.out.println("\nQual o número de compenentes conexos do grafo? \n" + grafo.components());
        //j
        System.out.println("\nO grafo é bipartido? \n" +grafo.eBipartido());
    }
}
