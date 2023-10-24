public class App {
    public static void main(String[] args){
        System.out.println("Código para Teste de Sobrescrita - classe Cacluladora");
    
        Calculadora calc = new Calculadora();

        System.out.println(calc.quadrado(10.45));
        System.out.println(calc.soma(10, 20, 30));
    
        int resultSoma = calc.soma(8, 10);
        System.out.println("A soma de dois numeros é: " + resultSoma);

        // Abaixo teste de herança em classes de animais
        System.out.println("Código para Teste de herança - classe Animal");

    }

}
