import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro:");
        int parametro1 = scan.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
        int parametro2 = scan.nextInt();
        
        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        
        scan.close();
    }
    
    // Método para contar e imprimir os números
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        // Verifica se parametroUm é maior ou igual a parametroDois
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        
        // Calcula a quantidade de iterações
        int contagem = parametro2 - parametro1;
        
        // Loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + (parametro1 + i));
        }
    }
}
