package br.com.passagemnacional;

import br.com.interfaces.TaxaBagagem;

public class PassagemNacionalTaxaBagagem implements TaxaBagagem {

    @Override
    public double getTaxaBgaguem() {
        return 0.03;
    }
}
