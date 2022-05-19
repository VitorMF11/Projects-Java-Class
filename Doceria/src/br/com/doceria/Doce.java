package br.com.doceria;

public class Doce {

    private int quantidadeLeite;
    private int quantidadeAcucar;

    Doce (){
    }

    Doce (int recebeLeite, int recebeAcucar) {
        this.quantidadeLeite = recebeLeite;
        this.quantidadeAcucar = recebeAcucar;
    }

    public int getQuantidadeLeite() {
        return quantidadeLeite;
    }

    public void setQuantidadeLeite(int quantidadeLeite) {
        this.quantidadeLeite = quantidadeLeite;
    }

    public int getQuantidadeAcucar() {
        return quantidadeAcucar;
    }

    public void setQuantidadeAcucar(int quantidadeAcucar) {
        this.quantidadeAcucar = quantidadeAcucar;
    }
}
