package org.example;

public class AprovadorDiretor extends Aprovador {

    public AprovadorDiretor(Aprovador superior) {
        listaEmprestimos.add(TipoEmprestimoGrande.getTipoEmprestimoGrande());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor de Crédito";
    }
}

