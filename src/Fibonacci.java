import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		double limite = 0, maior;
		Scanner input = new Scanner(System.in);
		
		System.out.println("A Sequencia Fibonacci.\n"
				+ "Esse programa exibe a sequência fibonacci de acordo com o limite númerico que o usuário inserir.\n"
				+ "Insira o limite até onde deseja exibir a sequencia fibonacci: ");
		limite = input.nextDouble();
		maior = fibonacci(limite);
		
	}
	
	public static final double fibonacci(double n){
		double[] doisUltimos = {0, 1};
		double temp;
		do{
			System.out.printf("%.0f ", doisUltimos[0]);
			temp = doisUltimos[1];
			doisUltimos[1] += doisUltimos[0];
			doisUltimos[0] = temp;
		}while(doisUltimos[0] <= n && doisUltimos[0] > 0);
		System.out.println();
		return doisUltimos[0];
	}
	

}
