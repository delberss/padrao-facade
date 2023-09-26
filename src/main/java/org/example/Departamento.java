package org.example;
import java.util.ArrayList;
import java.util.List;
public abstract class Departamento {

    private List<Jogador> jogadoresComPendencia = new ArrayList<Jogador>();

    public void addJogadorPendente(Jogador jogador) {
        this.jogadoresComPendencia.add(jogador);
    }

    public boolean verificarJogadorComPendencia(Jogador jogador) {
        return this.jogadoresComPendencia.contains(jogador);
    }
}