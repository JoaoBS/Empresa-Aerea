package br.com.passagemnacional;

import br.com.interfaces.TaxaEmbarque;

public class PassagemNacionalTaxaEmbarque implements TaxaEmbarque {

    @Override
    public double getTaxaEmbarque() {
        return 0.05;
    }
}
