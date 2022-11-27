import java.util.Iterator;

public class Texto implements Iterable<Character>{
    char [] caracteres;
    int tamanho;
    int ultimoIndice = -1;

    public Texto(int tamanho) {
        this.caracteres = new char[tamanho];
        this.tamanho = tamanho;
    }

    public char get(int indice) {
        if (indice < 0 || indice >= tamanho)
            throw new RuntimeException("Indice invalido");
        return caracteres[indice];
    }

    public void add(char novoCaracter) {
        if (ultimoIndice >= tamanho-1)
            throw new RuntimeException("Tamanho excedido");
        caracteres[++ultimoIndice] = novoCaracter;
    }

    public void set(char novoCaracter, int indice) {
        if (indice < 0 || indice >= tamanho)
            throw new RuntimeException("Indice invalido");
        caracteres[indice] = novoCaracter;
        if (indice > ultimoIndice)
            ultimoIndice++;
    }

    public void remove(int indice) {
        if (indice < 0 || indice >= tamanho)
            throw new RuntimeException("Indice invalido");
        for (int i = 0; i < ultimoIndice; i++) {
            
        }
    }

    @Override
    public Iterator<Character> iterator() {
        return new ItTexto(this);
    }
}
