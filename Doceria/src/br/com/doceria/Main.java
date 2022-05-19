package br.com.doceria;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String escolha = JOptionPane.showInputDialog("Escolha o doce : \n1-Beijinho \n2-Brigadeiro");

        if (escolha.equals("1")) {
            int recebeLeite = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantidade de leite em ml: "));
            int recebeAcucar = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantidade de acucar em g: "));
            int recebeCoco = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantidade de coco em g: "));
            String recebeApelido = JOptionPane.showInputDialog("Coloque o apelido do beijinho: ");

            Beijinho beijinho = new Beijinho(recebeCoco, recebeLeite, recebeAcucar, recebeApelido);

            System.out.println("Quantidade de açúcar utilzada: " + beijinho.getQuantidadeLeite() +
                    "\nQuantidade de leite utilizada: " + beijinho.getQuantidadeLeite() +
                    "\nQuantidade de coco utilizada: " + beijinho.getQuantidadeCoco() +
                    "\nApelido do beijinho: " + beijinho.retornaApelido(recebeApelido) +
                    "\nPeso do beijinho: " + beijinho.retornaPesoBeijinho(recebeAcucar, recebeCoco) +
                    beijinho.retornaApelido(recebeApelido));

        } else if (escolha.equals("2")) {

            int recebeLeite = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantidade de leite em ml: "));
            int recebeAcucar = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantidade de acucar em g: "));
            int recebeChocolate = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantidade de chocolate em g "));

            Brigadeiro brigadeiro = new Brigadeiro(recebeChocolate, recebeAcucar, recebeLeite);

            System.out.println("Quantidade de açúcar utilzada: " + brigadeiro.getQuantidadeLeite() +
                    "\nQuantidade de leite utilizada: " + brigadeiro.getQuantidadeLeite() +
                    "\nQuantidade de chocolate utilizada: " + brigadeiro.getQuantidadeChocolate() +
                    "\nPeso do brigadeiro: " + brigadeiro.retornoPesoBrigadeiro(recebeChocolate, recebeAcucar));
        }
    }
}
