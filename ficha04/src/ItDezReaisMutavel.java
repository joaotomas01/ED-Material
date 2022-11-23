import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ItDezReaisMutavel implements Iterator<Double> {
    DezReaisMutavel dezReaisMutavel;
    int posUltimo = -1; //indice ultimo valor devolvido
    boolean podeRemover = false;
    int itModificacoes = 0;

    public ItDezReaisMutavel(DezReaisMutavel dezReaisMutavel) {
        this.dezReaisMutavel = dezReaisMutavel;
        itModificacoes = dezReaisMutavel.getModificacoes();
    }

    public void verificaModificao() {
        if (itModificacoes != dezReaisMutavel.getModificacoes())
            throw new ConcurrentModificationException();
    }

    @Override
    public boolean hasNext() {
        verificaModificao();
        return posUltimo+1 < dezReaisMutavel.size();
    }

    @Override
    public Double next() {
        verificaModificao();
        if (!hasNext()) throw new NoSuchElementException("End of array");
        podeRemover = true; // torna-o possível remover
        return dezReaisMutavel.get(++posUltimo);
    }

    @Override
    public void remove() {
        //Iterator.super.remove();
        if (!podeRemover) throw new IllegalStateException();
        podeRemover = false; // apos remover o valor, nao e possivel remover outra vez
        dezReaisMutavel.remove(posUltimo);
        posUltimo--;
        itModificacoes++;
    }


}
