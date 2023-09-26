package org.example;

public class DepartamentoFinanceiro extends Departamento {

    private static DepartamentoFinanceiro deptoFinanceiro = new DepartamentoFinanceiro();

    private DepartamentoFinanceiro() {};

    public static DepartamentoFinanceiro getInstancia() {
        return deptoFinanceiro;
    }
}