package org.example;

public class SolicitacaoEmprestimo {

    private TipoEmprestimo tipoEmprestimo;

    public SolicitacaoEmprestimo(TipoEmprestimo tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }

    public TipoEmprestimo getTipoEmprestimo() {
        return tipoEmprestimo;
    }

    public void setTipoEmprestimo(TipoEmprestimo tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }
}

