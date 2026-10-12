package ativi;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// MÉTODOS RESPONSÁVEIS POR RESPONDER AS PERGUNTWAS.
public class Grafo {

     int[][] matriz; // ONDE O GRAFO ESTÁ GUADARDA
     int n;

    public Grafo(int[][] matriz) {
        this.matriz = matriz; 
        this.n = matriz.length;
    }

    // a) MOSTRAR TODAS AS LIGAÇÕES
    public void mostrarArestas() {
        System.out.print("Arestas: ");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (matriz[i][j] != 0) {
                    System.out.print("(" + i + "," + j + ") ");
                }
            }
        }
        System.out.println();
    }

    // b) É DIGRAFO? 
    public boolean eDigrafo() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return true;
                }
            }
        }
        return false;
    }

    // c) QUANTAS CONEXÕES CADA VÉRTICE TEM
    public void mostrarGraus() {
        for (int i = 0; i < n; i++) {
            int grau = 0;
            for (int j = 0; j < n; j++) {
                grau += matriz[i][j];
            }
            System.out.println("V" + i + " = " + grau);
        }
    }

    // d) CONEXO? DÁ PARA CHEGAR EM TODOS OS VÉRTICES?
    public boolean eConexo() {
        boolean[] visitado = new boolean[n];
        dfs(0, visitado);

        for (boolean v : visitado) {
            if (!v) 
                return false;
        }
        return true;
    }

    private void dfs(int v, boolean[] visitado) {
        visitado[v] = true;

        for (int i = 0; i < n; i++) {
            if (matriz[v][i] != 0 && !visitado[i]) {
                dfs(i, visitado);
            }
        }
    }
    //==================================
     public boolean eciclo() {
        boolean[] visitado = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visitado[i]) {
                if (dfsCiclo(i, visitado, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
     
    private boolean dfsCiclo(int v, boolean[] visitado, int pai) {
        visitado[v] = true;

        for (int i = 0; i < n; i++) {
            if (matriz[v][i] != 0) {

                if (!visitado[i]) {
                    if (dfsCiclo(i, visitado, v)) {
                        return true;
                    }
                }
                else if (i != pai) {
                    return true;
                }
            }
        }
        return false;
    }

    public void listaAdj() {
        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    // g) TODO MUNDO É LIGADO COM TODO MUNDO?
    public boolean eCompleto() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matriz[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // h) ISOLADO = 0 / PENDENTE = 1
   public String verificacao() {
       String resultado = "";
    for (int i = 0; i < n; i++) {
                int grau = 0;

                for (int j = 0; j < n; j++) {
                    grau += matriz[i][j];
                }

                if (grau == 0)
                    System.out.println("V" + i + " é isolado");
                else if (grau == 1)
                    System.out.println("V" + i + " é pendente");
            }   
    return resultado.isEmpty() ? "Não, nenhum vértice especial" : resultado;
   }
    
    // I) QUANTOS GRUPOS SEPARADOS EXISTEM
    public int components() {
        boolean[] visitado = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visitado[i]) {
                dfs(i, visitado);
                count++;
            }
        }

        return count;
    }
     public boolean eBipartido() {
        int[] cor = new int[n];
        Arrays.fill(cor, -1);

        for (int i = 0; i < n; i++) {
            if (cor[i] == -1) {

                Queue<Integer> fila = new LinkedList<>();
                fila.add(i);
                cor[i] = 0;

                while (!fila.isEmpty()) {
                    int u = fila.poll();

                    for (int v = 0; v < n; v++) {
                        if (matriz[u][v] != 0) {

                            if (cor[v] == -1) {
                                cor[v] = 1 - cor[u];
                                fila.add(v);
                            }
                            else if (cor[v] == cor[u]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
}
