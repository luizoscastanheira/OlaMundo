package pkgheranca;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    //Atributos
    String escolaridade;
    //Metodos
    public String getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public static void imprimirNomeAluno(){
        System.out.println("Eu sou um método estático. Fui invocado sem criar uma objeto, apenas usei o nome da classe Aluno onde estou.");
    }
}
