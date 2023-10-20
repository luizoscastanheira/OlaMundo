public class Conta {
    // Atributos
    // Usando o private com modificador de acesso a algus atributos
    private int numero;
    private double saldo;
    private double juros;
    private int codCli;
    String nome;
    
    // Metodos de acesso get para "ler o conteudo dos atributos"
    public double getJuros(){
        return juros;
    }
    public double getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    
    // Metodos de acesso set para "escrever o conteudo dos atributos"
    public void setJuros (double juros){
        this.juros = juros;
    }
    public void setNumero (int numero){
        this.numero = numero;
    }
    
    // Metodos
    public void debito(double valor){
        this.saldo -= valor;
        System.out.println("Cuidado com os gastos");
    }
    public void credito(double valor){
        this.saldo += valor;
    }
}