package br.com.passageminternacional;

import br.com.interfaces.TaxaBagagem;

public class PassagemInternacionalTaxaBagagem implements TaxaBagagem {

    @Override
    public double getTaxaBgaguem() {
        return 0.05;
    }
}
