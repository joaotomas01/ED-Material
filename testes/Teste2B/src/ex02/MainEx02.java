package ex02;

import java.util.Calendar;
import java.util.Date;

public class MainEx02 {
    public static void main(String[] args) {
        GestorOrganizacao gestorOrganizacao = new GestorOrganizacao();
        gestorOrganizacao.addOrganization(new Organizacao(5, new Date(2022, Calendar.JULY, 1)));
        gestorOrganizacao.addOrganization(new Organizacao(5, new Date(2022, Calendar.JULY, 1)));

        gestorOrganizacao.printQueue();
    }
}
