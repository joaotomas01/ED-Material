import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GestorImpressoras {
    private Map<String, Impressora> map = new HashMap<>();

    public Impressora getImpressora(String nome) {
        return map.get(nome);
    }

    public Set<String> getNomesImpressoras() {
        return map.keySet();
    }

    public void acrescentaImpressora(Impressora newImpressora) {
        if (!existeImpressora(newImpressora.getNome()))
            map.put(newImpressora.getNome(), newImpressora);
    }

    public void removeImpressora(String nome) {
        map.remove(nome);
    }

    public boolean existeImpressora(String nome) {
        return map.containsKey(nome);
    }

    public void enviaTrabalho() {

    }
}
