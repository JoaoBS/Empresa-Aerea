package br.com;

import br.com.interfaces.CalculoFactory;

public class Empresa {

    public Passagem gerarPassagem(double valor, CalculoFactory factory) {
        Passagem passagem = new Passagem(valor, factory);
        System.out.println("Valor da Passagem: R$" + valor);
        System.out.println("Taxa Embarque: R$" + passagem.calcularTaxaEmbarque());
        System.out.println("Taxa Bagagem: R$" + passagem.calcularTaxaBagagem());

        return passagem;
    }
}
