public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Conta conta1 = new Conta();
        conta1.nome = "Rosicléia";
        
        String userName;
        userName = conta1.nome;
        System.out.println(conta1.nome);
        System.out.println(userName);

        

        conta1.credito(100);
        conta1.getSaldo();
        System.out.println("Seu Saldo é: " + conta1.getSaldo());
        conta1.debito(25);
        conta1.getSaldo();
        System.out.println("Seu Saldo é: " + conta1.getSaldo());

        // Instanciando a classe animal

        Animal cachorro = new Animal();
        
        cachorro.nome = "Tico";
        cachorro.idade = 10;

        System.out.println("O chachorro chama-se " + cachorro.nome + " e tem a idade de " + cachorro.idade + " anos.");

    }
}
