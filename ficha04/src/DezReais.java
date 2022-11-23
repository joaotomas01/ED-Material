import java.util.Arrays;
import java.util.Iterator;

public class DezReais implements Iterable<Double>{
    protected final int CAPACITY = 10;
    Double [] nums;
    int last;

    public DezReais() {
        this.nums = new Double[CAPACITY];
        last = 0;
    }

    public void add(Double d) {
        try {
            nums[last] = d;
            last++;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(nums);
    }

    @Override
    public Iterator<Double> iterator() {
        return new ItDezReais(this);
    }

    public Double get(int pos) {
        return nums[pos];
    }

    public int size(){
        return last;
    }
}
