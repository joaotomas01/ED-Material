package ex01;

import java.util.HashMap;
import java.util.Map;

public class Estrutura {
    Map<String, Integer> cidades;

    public Estrutura() {
        this.cidades = new HashMap<>();
    }

    public void defineCidade(String nome1, int populacao) {
        if (!cidades.containsKey(nome1))
            cidades.put(nome1, populacao);
    }

    public void migracao(String origem, String destino, int quantos) {
        if (!cidades.containsKey(origem) || !cidades.containsKey(destino))
            return;

        if (cidades.get(origem) < quantos)
            return;

        cidades.put(destino, cidades.get(destino) + quantos);
        cidades.put(origem, cidades.get(origem) - quantos);
    }

    public int getPopulacao(String cidade) {
        if (!cidades.containsKey(cidade))
            return 0;

        return cidades.get(cidade);
    }
}
