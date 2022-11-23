import java.util.Iterator;
import java.util.NoSuchElementException;

public class DezReaisMutavel implements Iterable<Double>{
    private int modificacoes;
    protected final int CAPACITY = 10;
    Double [] nums;
    int last;
    public DezReaisMutavel() {
        this.nums = new Double[CAPACITY];
        last = 0;
        modificacoes = 0;
    }

    public void remove(int pos) {
        if (pos<0 || pos >= last) {
            throw new NoSuchElementException();
        }

        for (int i = pos; i < last-1; i++) {
            nums[i] = nums[i+1];
        }
        last--;
        modificacoes++;
    }

    public void add(Double d) {
        try {
            nums[last] = d;
            last++;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void acrescenta(Double d) {
        add(d);
        modificacoes++;
    }

    public int getModificacoes() {
        return modificacoes;
    }

    @Override
    public Iterator<Double> iterator() {
        return new ItDezReaisPositivos(this);
    }

    public Double get(int pos) {
        return nums[pos];
    }

    public int size(){
        return last;
    }
}
