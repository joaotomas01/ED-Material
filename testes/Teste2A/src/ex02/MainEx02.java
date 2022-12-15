package ex02;

import java.util.Calendar;
import java.util.Date;

public class MainEx02 {
    public static void main(String[] args) {
        GestorEncomendas gestorEncomendas = new GestorEncomendas();
        Encomenda encomenda1 = new Encomenda(false, new Date(2022, Calendar.JULY, 1));
        Encomenda encomenda2 = new Encomenda(true, new Date(2022, Calendar.JULY, 2));

        gestorEncomendas.addEncomenda(encomenda1);
        gestorEncomendas.addEncomenda(encomenda2);

        gestorEncomendas.printQueue();
    }
}
