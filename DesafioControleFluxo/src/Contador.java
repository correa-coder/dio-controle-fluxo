import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
        System.out.println("\nDIO - Controle de Fluxo Challenge\n");

		Scanner terminal = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
    
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();

            System.out.println();

            contar(parametroUm, parametroDois);
        }
        catch (InputMismatchException e) {
            System.err.println("Certifique-se de inserir apenas números inteiros.");
        }
        catch(ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
        finally {
            terminal.close();
        }
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;

		for (int indice = 1; indice <= contagem; indice++) {
            System.out.println("Imprimindo o número " + indice);
        }

        System.out.println();
	}
}