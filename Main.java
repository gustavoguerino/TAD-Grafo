package estruturas.grafo;

public class Main {

    public static void main(String[] args) {
        Grafo graf = new Grafo();
        graf.inserirVertice(10,3);
        graf.inserirVertice(11,4);
        graf.inserirVertice(12,4);
        graf.removerVertice(10);
        graf.inserirAresta(11,12);
        graf.inserirAresta(11,12);
        graf.removerAresta(11,12);
        graf.inserirAresta(11,11);
        System.out.println("\n\n Grau: " + graf.grau(11));
        graf.printGrafo();

    }

}
