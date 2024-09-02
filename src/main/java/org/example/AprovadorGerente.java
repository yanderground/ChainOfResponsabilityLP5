package org.example;

public class AprovadorGerente extends Aprovador {

    public AprovadorGerente(Aprovador superior) {
        listaEmprestimos.add(TipoEmprestimoMedio.getTipoEmprestimoMedio());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente de Crédito";
    }
}
