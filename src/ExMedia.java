import java.util.Scanner;

public class ExMedia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a nota do 1� bimestre: ");
		float n1 = entrada.nextFloat();
		System.out.print("Insira a nota do 2� bimestre: ");
		float n2 = entrada.nextFloat();
		System.out.print("Insira a nota do 3� bimestre: ");
		float n3 = entrada.nextFloat();
		System.out.print("Insira a nota do 4� bimestre: ");
		float n4 = entrada.nextFloat();
		
		System.out.print("Insira a frequ�ncia: ");
		float frequencia = entrada.nextFloat();
		
		float media = (n1 + n2 + n3 + n4) / 4;
		
		// Caso um erro esteja dizendo que o float deve ser double, adicionar "= [...]f" ou "= (float) [...]"
		
		System.out.println("\n1� nota: " + n1 + "\n2� nota: " + n2 + "\n3� nota: " + n3 + "\n4� nota: " + n4 + "\n"
							+ "Frequ�ncia: " + frequencia + "% \nA m�dia do aluno � " + media + ".");
		
		if(frequencia >= 75) {
			if(media >= 6)
				System.out.print("\nCom isto, o aluno foi aprovado.");
			else
				System.out.print("\nCom isto, o aluno foi reprovado.");
		} else
			System.out.print("\nO aluno foi reprovado por frequ�ncia.");
		
		entrada.close();
	}
}