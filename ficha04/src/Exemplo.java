import java.util.Iterator;

public class Exemplo {
    public <T> boolean procura (Iterable<T> m, T c) {
        Iterator<T> it = m.iterator();

        while (it.hasNext()) {  // percorre a estrutura de dados
            if (it.next() == c) // compara referencia, nao conteudo
                return true;
        }

        return false;
    }
}
