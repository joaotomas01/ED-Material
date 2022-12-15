package ex01;

public class Main {
    public static void main(String[] args) {
        Estrutura estrutura = new Estrutura();
        estrutura.defineJogo("A", "B", 10);
        estrutura.defineJogo("A", "C", 15);
        estrutura.defineJogo("B", "D", 20);

        System.out.println("Assistencia total em casa:");
        System.out.println("\tA: " + estrutura.getAssistenciaTotalEmCasa("A"));
        System.out.println("\tB: " + estrutura.getAssistenciaTotalEmCasa("B"));
        System.out.println("\tC: " + estrutura.getAssistenciaTotalEmCasa("C"));

        System.out.println();

        System.out.println("Equipas visitantes:");
        System.out.println("\tA: " + estrutura.getEquipasVisitantes("A"));
        System.out.println("\tB: " + estrutura.getEquipasVisitantes("B"));
        System.out.println("\tC: " + estrutura.getEquipasVisitantes("C"));
    }
}