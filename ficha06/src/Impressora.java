public class Impressora {
    private String nome;
    private int porto;
    private String marca;
    private String modelo;
    private String driver;
    private String versao;

    public Impressora(String nome, int porto, String marca, String modelo, String driver, String versao) {
        this.nome = nome;
        this.porto = porto;
        this.marca = marca;
        this.modelo = modelo;
        this.driver = driver;
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Impressora{" +
                "nome='" + nome + '\'' +
                ", porto=" + porto +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", driver='" + driver + '\'' +
                ", versao='" + versao + '\'' +
                '}';
    }

    public void show() {
        System.out.println("IMPRESSORA:");
        System.out.println("-nome: " + nome);
        System.out.println("-porto: " + porto);
        System.out.println("-marca: " + marca);
        System.out.println("-modelo: " + modelo);
        System.out.println("-driver: " + driver);
        System.out.println("-versao: " + versao);
        System.out.println();
    }
}
