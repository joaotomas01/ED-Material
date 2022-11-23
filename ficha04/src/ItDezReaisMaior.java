import java.util.Iterator;

public class ItDezReaisMaior implements Iterator<Double> {
    DezReais dezReais;
    int posUltimo = -1;
    boolean podeRemover = false;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Double next() {
        return null;
    }
}
