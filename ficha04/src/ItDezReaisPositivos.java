import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ItDezReaisPositivos implements Iterator<Double> {
    int posUltimo = -1;
    boolean podeRemover=false;
    int modificacoesConhecidas;
    DezReaisMutavel dezReaisMutavel;

    public ItDezReaisPositivos(DezReaisMutavel dezReaisMutavel) {
        this.dezReaisMutavel = dezReaisMutavel;
        modificacoesConhecidas = dezReaisMutavel.getModificacoes();
    }

    public void verificaModificao() {
        if (modificacoesConhecidas != dezReaisMutavel.getModificacoes())
            throw new ConcurrentModificationException();
    }

    private int nextPositiveIndex (int from) {
        if (from >= dezReaisMutavel.size())
            return -1;
        while (dezReaisMutavel.get(from) < 0) {
            if (++from >= dezReaisMutavel.size())
                return -1;
        }
        return from;
    }

    @Override
    public Double next() {
        verificaModificao();
        posUltimo = nextPositiveIndex(++posUltimo);
        return dezReaisMutavel.get(posUltimo);
    }

    @Override
    public boolean hasNext() {
        verificaModificao();
        return nextPositiveIndex(posUltimo-1) >= 0;
    }

    @Override
    public void remove() {
        //Iterator.super.remove();
        if (!podeRemover) throw new IllegalStateException();
        podeRemover = false; // apos remover o valor, nao e possivel remover outra vez
        dezReaisMutavel.remove(posUltimo);
        posUltimo--;
        modificacoesConhecidas++;
    }
}
