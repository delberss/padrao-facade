package org.example;

public class JogadorFacade {

    public static boolean verificarAptidaoParaJogo(Jogador jogador) {
        if (DepartamentoMedico.getInstancia().verificarJogadorComPendencia(jogador)) {
            return false;
        }
        if (DepartamentoTreinamento.getInstancia().verificarJogadorComPendencia(jogador)) {
            return false;
        }
        if (DepartamentoFinanceiro.getInstancia().verificarJogadorComPendencia(jogador)) {
            return false;
        }
        return true;
    }
}
