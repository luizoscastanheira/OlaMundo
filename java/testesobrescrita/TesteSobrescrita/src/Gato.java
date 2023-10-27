public class Gato extends Animal {
    String pelagem;
    // definindo o construtor da classe
    /* O método construtor é invocado ao se crair um novo objeto da classe
     * é composto de um modificado de acesso (geralmente public) e o nome 
     * da própria classe tendo como parâmetros os atributos da superclasse 
     * e os atributos próprios
     * o metodo super() é usado para determinar o uso dos atributos da superclasse
    */
    public Gato(String nome, int idade, String pelagem){
        super(nome, idade);
        this.pelagem = pelagem;
    }
}
