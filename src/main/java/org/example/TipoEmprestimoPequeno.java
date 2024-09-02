package org.example;

public class TipoEmprestimoPequeno implements TipoEmprestimo {

    private static TipoEmprestimoPequeno tipoEmprestimoPequeno = new TipoEmprestimoPequeno();

    private TipoEmprestimoPequeno() {}

    public static TipoEmprestimoPequeno getTipoEmprestimoPequeno() {
        return tipoEmprestimoPequeno;
    }
}
