package ex02;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GestorOrganizacao {
    private PriorityQueue<Organizacao> queue;

    public GestorOrganizacao() {
        queue = new PriorityQueue<>(new Comparator<Organizacao>() {
            @Override
            public int compare(Organizacao o1, Organizacao o2) {
                if (o1.numeroQueixas == o2.numeroQueixas) {
                    return o1.dataUltimaAuditoria.compareTo(o2.dataUltimaAuditoria);
                }
                if (o1.numeroQueixas > o2.numeroQueixas) {
                    return -1;
                }
                return 1;
            }
        });
    }

    public void addOrganization(Organizacao organizacao) {
        queue.add(organizacao);
    }

    public void printQueue() {
        System.out.println(queue);
    }
}
