import java.util.Scanner;

public class ExMedia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a nota do 1º bimestre: ");
		float n1 = entrada.nextFloat();
		System.out.print("Insira a nota do 2º bimestre: ");
		float n2 = entrada.nextFloat();
		System.out.print("Insira a nota do 3º bimestre: ");
		float n3 = entrada.nextFloat();
		System.out.print("Insira a nota do 4º bimestre: ");
		float n4 = entrada.nextFloat();
		
		System.out.print("Insira a frequência: ");
		float frequencia = entrada.nextFloat();
		
		float media = (n1 + n2 + n3 + n4) / 4;
		
		// Caso um erro esteja dizendo que o float deve ser double, adicionar "= [...]f" ou "= (float) [...]"
		
		System.out.println("\n1ª nota: " + n1 + "\n2ª nota: " + n2 + "\n3º nota: " + n3 + "\n4ª nota: " + n4 + "\n"
							+ "Frequência: " + frequencia + "% \nA média do aluno é " + media + ".");
		
		if(frequencia >= 75) {
			if(media >= 6)
				System.out.print("\nCom isto, o aluno foi aprovado.");
			else
				System.out.print("\nCom isto, o aluno foi reprovado.");
		} else
			System.out.print("\nO aluno foi reprovado por frequência.");
		
		entrada.close();
	}
}