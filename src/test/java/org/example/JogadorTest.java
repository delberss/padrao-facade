package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveRetornarPendenciaDepartamentoMedico() {
        Jogador jogador = new Jogador();
        DepartamentoMedico.getInstancia().addJogadorPendente(jogador);

        assertEquals(false, jogador.jogar());
    }

    @Test
    void deveRetornarPendenciaDepartamentoTreinamento() {
        Jogador jogador = new Jogador();
        DepartamentoTreinamento.getInstancia().addJogadorPendente(jogador);

        assertEquals(false, jogador.jogar());
    }

    @Test
    void deveRetornarPendenciaDepartamentoFinanceiro() {
        Jogador jogador = new Jogador();
        DepartamentoFinanceiro.getInstancia().addJogadorPendente(jogador);

        assertEquals(false, jogador.jogar());
    }

    @Test
    void deveRetornarJogadorSemPendencia() {
        Jogador jogador = new Jogador();

        assertEquals(true, jogador.jogar());
    }

}