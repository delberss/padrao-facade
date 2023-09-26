package org.example;

public class DepartamentoMedico extends Departamento {

    private static DepartamentoMedico deptoMedico = new DepartamentoMedico();

    private DepartamentoMedico() {};

    public static DepartamentoMedico getInstancia() {
        return deptoMedico;
    }
}