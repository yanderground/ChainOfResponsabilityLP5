package org.example;

public class TipoEmprestimoGrande implements TipoEmprestimo {

    private static TipoEmprestimoGrande tipoEmprestimoGrande = new TipoEmprestimoGrande();

    private TipoEmprestimoGrande() {}

    public static TipoEmprestimoGrande getTipoEmprestimoGrande() {
        return tipoEmprestimoGrande;
    }
}
