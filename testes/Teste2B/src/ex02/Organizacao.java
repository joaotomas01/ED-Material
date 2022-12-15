package ex02;

import java.util.Date;

public class Organizacao {
    int numeroQueixas;
    Date dataUltimaAuditoria;

    public Organizacao(int numeroQueixas, Date dataUltimaAuditoria) {
        this.numeroQueixas = numeroQueixas;
        this.dataUltimaAuditoria = dataUltimaAuditoria;
    }

    @Override
    public String toString() {
        return "Organizacao{" +
                "numeroQueixas=" + numeroQueixas +
                ", dataUltimaAuditoria=" + dataUltimaAuditoria +
                '}';
    }
}
