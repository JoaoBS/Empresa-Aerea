package br.com.passageminternacional;

import br.com.interfaces.TaxaEmbarque;

public class PassagemInternacionalTaxaEmbarque implements TaxaEmbarque {

    @Override
    public double getTaxaEmbarque() {
        return 0.1;
    }
}
