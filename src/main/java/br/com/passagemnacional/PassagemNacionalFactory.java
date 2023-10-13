package br.com.passagemnacional;

import br.com.interfaces.CalculoFactory;
import br.com.interfaces.TaxaBagagem;
import br.com.interfaces.TaxaEmbarque;

public class PassagemNacionalFactory implements CalculoFactory {

    @Override
    public TaxaEmbarque gerarTaxaEmbarque() {
        return new PassagemNacionalTaxaEmbarque();
    }

    @Override
    public TaxaBagagem gerarTaxaBagagem() {
        return new PassagemNacionalTaxaBagagem();
    }
}
