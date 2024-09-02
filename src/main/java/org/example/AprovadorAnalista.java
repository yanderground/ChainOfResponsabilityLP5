package org.example;

public class AprovadorAnalista extends Aprovador {

    public AprovadorAnalista(Aprovador superior) {
        listaEmprestimos.add(TipoEmprestimoPequeno.getTipoEmprestimoPequeno());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Analista de Crédito";
    }
}

