package estruturas.grafo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Grafo graf = new Grafo();
        int valorInicial;
        int valorFinal;
        //Menu
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU\n"
        + "0 - Sair; \n"
        + "1 - Adicionar Vertice;\n"
        + "2 - Adicionar Aresta;\n"
        + "3 - Remover Vertice;\n"
        + "4 - Remover Aresta;\n"
        + "5 - Printar Grafo;\n"
        + "6 - Printar Grau de um Vertice;\n"
        + "7 - Caminho Euleriano;\n");
        
        System.out.print("Escolha uma Opção:\n");
        int opt = sc.nextInt();
        while(opt != 0){
            switch(opt){
                case 1://Adicionar Vertice
                    System.out.println("Escolha um valor inicial");
                    valorInicial = sc.nextInt();
                    graf.inserirVertice(valorInicial, 0);
                    System.out.println("Escolha uma nova opção:");
                    opt = sc.nextInt();
                    break;
                case 2://Adicionar Aresta
                    System.out.println("Escolha um valor inicial e final para adicionar");
                    valorInicial = sc.nextInt();
                    valorFinal = sc.nextInt();
                    graf.inserirAresta(valorInicial, valorFinal);
                    System.out.println("Escolha uma nova opção:");
                    opt = sc.nextInt();
                    break;
                case 3://Remover Vertice
                    System.out.println("Insira a chave do vertice a ser removido");
                    valorInicial = sc.nextInt();
                    graf.removerVertice(valorInicial);
                    System.out.println("Escolha uma nova opção:");
                    opt = sc.nextInt();
                    break;
                    
                case 4://Remover Aresta
                    System.out.println("Insira o valor inicial e final da aresta a ser removida");
                    valorInicial = sc.nextInt();
                    valorFinal = sc.nextInt();
                    graf.removerAresta(valorInicial, valorFinal);
                    System.out.println("Escolha uma nova opção:");
                    opt = sc.nextInt();
                    break;
                case 5:
                    graf.printGrafo();
                     System.out.println("Escolha uma nova opção:");
                     opt = sc.nextInt();
                     break;
                case 6:
                    System.out.println("Insira a chave do vertice:");
                    valorInicial = sc.nextInt();
                    System.out.println("\n\n Grau: " + graf.grau(valorInicial));
                    System.out.println("Escolha uma nova opção:");
                    opt = sc.nextInt();
                    break;
                case 7:
                    System.out.println("\n\n Caminho Euleriano: " + graf.caminhoEuleriano());
                    System.out.println("Escolha uma nova opção:");
                    opt = sc.nextInt();
                    break;
                case 8:
                    System.out.println("\n\n Ciclo Euleriano: " + graf.circuitoEuleriano());
                    System.out.println("Escolha uma nova opção:");
                    opt = sc.nextInt();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    System.out.println("Escolha uma nova opção:");
                    opt = sc.nextInt();
                    break;
            }
        }
        
//        graf.inserirVertice(10,3);
//        graf.inserirVertice(11,4);
//        graf.inserirVertice(12,4);
//        graf.removerVertice(10);
//        graf.inserirAresta(11,12);
//        graf.inserirAresta(11,12);
//        graf.removerAresta(11,12);
//        graf.inserirAresta(11,11);
//        System.out.println("\n\n Grau: " + graf.grau(11));
//        graf.printGrafo();

    }

}

