package desafiocontroledefluxo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class contador {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int primeiroNumero = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    int segundoNumero = scanner.nextInt();

    try {
        contar( primeiroNumero,segundoNumero);
    } catch (ParametrosInvalidosException e) {
        System.out.println("O segundo numero deve ser maior que o primeiro:");
    }
}

 static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
    if (primeiroNumero > segundoNumero) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }

    for (int i = primeiroNumero + 1; i <= segundoNumero; i++) {
        System.out.println("Imprimindo o número: " + i);
    }
}
}
	
	
			
