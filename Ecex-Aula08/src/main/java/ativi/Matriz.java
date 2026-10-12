package ativi;

// leitura da Matriz adjacente  
// Matriz de adjacencia = 0 1 0 0 1 1
// 0 -> sem ligação
// 1 -> aresta tá ligada (tem relacionamento)
//
import java.io.BufferedReader;
import java.io.FileReader;

public class Matriz {
    public static int[][] lerMatriz(String nomeArquivo) throws Exception {
        //LENDO O ARQUIVO
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));

        //PEGA O TAMANHO DA MATRIZ
        int n = Integer.parseInt(br.readLine()); //a primeira linha do .txt
        // CRIA A MATRIZ
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            String linha = br.readLine(); // lê a linha inteira
            String[] partes = linha.trim().split("\\s+");            
            for (int j = 0; j < n; j++) {
                matriz[i][j] = Integer.parseInt(partes[j]); // converte cada número
            }
        }
        br.close();
        return matriz;
    }
}
