package ex01;

public class Main {
    public static void main(String[] args) {
        Estrutura estrutura = new Estrutura();
        estrutura.defineCidade("CidadeA", 20);
        estrutura.defineCidade("CidadeB", 30);
        estrutura.defineCidade("CidadeC", 40);

        System.out.println("Pop. A: " + estrutura.getPopulacao("CidadeA"));
        System.out.println("Pop. B: " + estrutura.getPopulacao("CidadeB"));
        System.out.println("Pop. C: " + estrutura.getPopulacao("CidadeC"));

        estrutura.migracao("CidadeA", "CidadeB", 10);
        estrutura.migracao("CidadeC", "CidadeB", 20);
        System.out.println("Pop. A: " + estrutura.getPopulacao("CidadeA"));
        System.out.println("Pop. B: " + estrutura.getPopulacao("CidadeB"));
        System.out.println("Pop. C: " + estrutura.getPopulacao("CidadeC"));
    }
}