package org.example;

import java.util.ArrayList;

public abstract class Aprovador {

    protected ArrayList<TipoEmprestimo> listaEmprestimos = new ArrayList<>();
    private Aprovador aprovadorSuperior;

    public Aprovador getAprovadorSuperior() {
        return aprovadorSuperior;
    }

    public void setAprovadorSuperior(Aprovador aprovadorSuperior) {
        this.aprovadorSuperior = aprovadorSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarEmprestimo(SolicitacaoEmprestimo solicitacao) {
        if (listaEmprestimos.contains(solicitacao.getTipoEmprestimo())) {
            return getDescricaoCargo();
        } else {
            if (aprovadorSuperior != null) {
                return aprovadorSuperior.aprovarEmprestimo(solicitacao);
            } else {
                return "Sem aprovação";
            }
        }
    }
}
