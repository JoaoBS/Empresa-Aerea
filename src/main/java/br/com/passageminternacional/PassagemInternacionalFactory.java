package br.com.passageminternacional;

import br.com.interfaces.CalculoFactory;
import br.com.interfaces.TaxaBagagem;
import br.com.interfaces.TaxaEmbarque;

public class PassagemInternacionalFactory implements CalculoFactory {

    @Override
    public TaxaEmbarque gerarTaxaEmbarque() {
        return new PassagemInternacionalTaxaEmbarque();
    }

    @Override
    public TaxaBagagem gerarTaxaBagagem() {
        return new PassagemInternacionalTaxaBagagem();
    }
}
