package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitacaoEmprestimoTest {

    AprovadorDiretor diretor;
    AprovadorGerente gerente;
    AprovadorAnalista analista;

    @BeforeEach
    void setUp() {
        diretor = new AprovadorDiretor(null);
        gerente = new AprovadorGerente(diretor);
        analista = new AprovadorAnalista(gerente);
    }

    @Test
    void deveRetornarAnalistaParaEmprestimoPequeno() {
        assertEquals("Analista de Crédito", analista.aprovarEmprestimo(new SolicitacaoEmprestimo(TipoEmprestimoPequeno.getTipoEmprestimoPequeno())));
    }

    @Test
    void deveRetornarGerenteParaEmprestimoMedio() {
        assertEquals("Gerente de Crédito", analista.aprovarEmprestimo(new SolicitacaoEmprestimo(TipoEmprestimoMedio.getTipoEmprestimoMedio())));
    }

    @Test
    void deveRetornarDiretorParaEmprestimoGrande() {
        assertEquals("Diretor de Crédito", analista.aprovarEmprestimo(new SolicitacaoEmprestimo(TipoEmprestimoGrande.getTipoEmprestimoGrande())));
    }

    @Test
    void deveRetornarSemAprovacaoParaEmprestimoNaoExistente() {
        assertEquals("Sem aprovação", analista.aprovarEmprestimo(new SolicitacaoEmprestimo(new TipoEmprestimo() {})));
    }
}
