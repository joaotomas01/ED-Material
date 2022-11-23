public class Main {
    public static void main(String[] args) {
        GestorImpressoras gestorImpressoras = new GestorImpressoras();
        gestorImpressoras.acrescentaImpressora(new Impressora("I1",123,"ISEC","xpto","geforce","1.0"));
        gestorImpressoras.acrescentaImpressora(new Impressora("I2",124,"UC","xpto","geforce","1.1"));
        gestorImpressoras.acrescentaImpressora(new Impressora("I3",125,"TOSHIBA","xpto","geforce","0.45"));
        gestorImpressoras.getImpressora("I2").show();
        gestorImpressoras.getImpressora("I3").show();
        System.out.println(gestorImpressoras.getNomesImpressoras());
        gestorImpressoras.removeImpressora("I2");
        System.out.println(gestorImpressoras.getNomesImpressoras());
    }
}