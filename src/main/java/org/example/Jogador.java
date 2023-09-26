package org.example;

public class Jogador {

    public boolean jogar() {
        return JogadorFacade.verificarAptidaoParaJogo(this);
    }
}