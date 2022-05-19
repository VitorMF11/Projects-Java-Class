package br.com.doceria;

public class Brigadeiro extends Doce {

    private int quantidadeChocolate;

    Brigadeiro () {
    }

    Brigadeiro (int recebeChocolate, int recebeAcucar, int recebeLeite) {
        super(recebeAcucar, recebeLeite);
        this.quantidadeChocolate = recebeChocolate;
    }

    public int getQuantidadeChocolate() {
        return quantidadeChocolate;
    }

    public void setQuantidadeChocolate(int quantidadeChocolate) {
        this.quantidadeChocolate = quantidadeChocolate;
    }

    public int retornoPesoBrigadeiro(int recebeChocalate, int recebeAcucar) {
        int pesoTotal = recebeChocalate + recebeAcucar;
        return pesoTotal;
    }
}
