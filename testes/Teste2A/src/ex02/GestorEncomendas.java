package ex02;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GestorEncomendas {
    private final PriorityQueue<Encomenda> encomendasQueue;

    public GestorEncomendas() {
        encomendasQueue = new PriorityQueue<>(new Comparator<Encomenda>() {
            @Override
            public int compare(Encomenda o1, Encomenda o2) {
                if (o1.urgente && o2.urgente) {
                    return o1.dataDePedido.compareTo(o2.dataDePedido);
                }
                if (o1.urgente) {
                    return -1;
                } else if (o2.urgente) {
                    return 1;
                }
                return 0;
            }
        });
    }

    public void addEncomenda(Encomenda encomenda) {
        encomendasQueue.add(encomenda);
    }

    public void printQueue() {
        System.out.println(encomendasQueue);
    }
}
