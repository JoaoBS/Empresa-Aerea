package br.com;

import br.com.interfaces.CalculoFactory;
import br.com.interfaces.TaxaBagagem;
import br.com.interfaces.TaxaEmbarque;
import lombok.Data;

@Data
public class Passagem {

    private TaxaEmbarque taxaEmbarque;
    private TaxaBagagem taxaBagagem;
    private double valor;

    public Passagem(double valor, CalculoFactory factory) {
        this.valor = valor;
        this.taxaBagagem = factory.gerarTaxaBagagem();
        this.taxaEmbarque = factory.gerarTaxaEmbarque();
    }

    public double calcularTaxaEmbarque() {
        return this.valor * this.taxaEmbarque.getTaxaEmbarque();
    }

    public double calcularTaxaBagagem() {
        return this.valor * this.taxaBagagem.getTaxaBgaguem();
    }
}
