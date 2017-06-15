package estruturas.grafo;

/**
 * Created by gustavo on 14/06/2017.
 */
public class Aresta {
     // Para implementações futuras.. por enquanto apenas um construtor e se é um.
    // Para ser usado na matriz de adjacencia..
    boolean loop;
    public Aresta(){
        loop = false;
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
