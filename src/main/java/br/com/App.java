package br.com;

import br.com.passageminternacional.PassagemInternacionalFactory;
import br.com.passagemnacional.PassagemNacionalFactory;

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        System.out.println("Passagem Nacional:");
        empresa.gerarPassagem(100, new PassagemNacionalFactory());

        System.out.println("\nPassagem Internacional:");
        empresa.gerarPassagem(100, new PassagemInternacionalFactory());
    }
}
