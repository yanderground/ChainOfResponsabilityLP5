package org.example;

public class TipoEmprestimoMedio implements TipoEmprestimo {

    private static TipoEmprestimoMedio tipoEmprestimoMedio = new TipoEmprestimoMedio();

    private TipoEmprestimoMedio() {}

    public static TipoEmprestimoMedio getTipoEmprestimoMedio() {
        return tipoEmprestimoMedio;
    }
}

