package ex02;

import java.util.Date;

public class Encomenda {
    boolean urgente;
    Date dataDePedido;

    public Encomenda(boolean urgente, Date dataDePedido) {
        this.urgente = urgente;
        this.dataDePedido = dataDePedido;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public Date getDataDePedido() {
        return dataDePedido;
    }

    @Override
    public String toString() {
        return "[urgente: " + urgente + " | data: " + dataDePedido + "]";
    }
}
