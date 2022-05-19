package br.com.doceria;

public class Beijinho extends Doce{

    private int quantidadeCoco;
    private String apelidoDoce;

    Beijinho () {
    }

    Beijinho (int recebeCoco, int recebeLeite, int recebeAcucar, String recebeApelido) {
        super(recebeLeite, recebeAcucar);
        this.quantidadeCoco = recebeCoco;
        this.apelidoDoce = recebeApelido;
    }

    public int getQuantidadeCoco() {
        return quantidadeCoco;
    }

    public void setQuantidadeCoco(int quantidadeCoco) {
        this.quantidadeCoco = quantidadeCoco;
    }

    public String getApelidoDoce() {
        return apelidoDoce;
    }

    public void setApelidoDoce(String apelidoDoce) {
        this.apelidoDoce = apelidoDoce;
    }

    public int retornaPesoBeijinho(int recebeAcucar, int recebeCoco) {
        int pesoTotal = recebeAcucar + recebeCoco;
        return pesoTotal;
    }

    public String retornaApelido(String recebeApelido) {
        String apelidoReplace = recebeApelido.replace("a", "@");
        return String.format("O apelido com a letra trocada é: %s", apelidoReplace);
    }
}
