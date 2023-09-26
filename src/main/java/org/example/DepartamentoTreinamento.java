package org.example;

public class DepartamentoTreinamento extends Departamento {

    private static DepartamentoTreinamento deptoTreinamento = new DepartamentoTreinamento();

    private DepartamentoTreinamento() {};

    public static DepartamentoTreinamento getInstancia() {
        return deptoTreinamento;
    }
}