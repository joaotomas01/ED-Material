package ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estrutura {
    private final Map<String, List<String>> jogos; // Map<casa, lista_visitantes>
    private final Map<String, Integer> assistenciasEmCasa; // Map<casa, assistencias>

    public Estrutura() {
        jogos = new HashMap<>();
        assistenciasEmCasa = new HashMap<>();
    }

    //assistencia = audiencia
    public void defineJogo(String eqCasa, String eqVisitante, int assistencia) {
        if (!jogos.containsKey(eqCasa)) {
            jogos.put(eqCasa, new ArrayList<>());
            assistenciasEmCasa.put(eqCasa, 0);
        }

       jogos.get(eqCasa).add(eqVisitante);
       assistenciasEmCasa.put(eqCasa, assistenciasEmCasa.get(eqCasa) + assistencia);
    }

    public int getAssistenciaTotalEmCasa (String nomeEquipa) {
        if (assistenciasEmCasa.containsKey(nomeEquipa))
            return assistenciasEmCasa.get(nomeEquipa);
        return 0;
    }

    public List<String> getEquipasVisitantes(String nomeEquipa) {
        if (!jogos.containsKey(nomeEquipa))
            return null;

        return jogos.get(nomeEquipa);
    }
}
