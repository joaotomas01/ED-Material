import java.util.Iterator;
import java.util.NoSuchElementException;

public class ItDezReais implements Iterator<Double> {
    DezReais dezReais;
    int posUltimo = -1; //indice ultimo valor devolvido

    public ItDezReais(DezReais dezReais) {
        this.dezReais = dezReais;
    }

    @Override
    public boolean hasNext() {
        return posUltimo+1 < dezReais.size();
    }

    @Override
    public Double next() {
        if (!hasNext()) throw new NoSuchElementException("End of array");
        return dezReais.get(++posUltimo);
    }
}
