import java.util.Scanner;

public class ExPratico {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a altura da pir�mide: ");
		double altura = entrada.nextDouble();
		System.out.print("Insira a ap�tema da base da pir�mide: ");
		double ab = entrada.nextDouble();
		
		int tipoTinta = 0;
		while(tipoTinta != 1 && tipoTinta != 2 && tipoTinta != 3) {
			System.out.print("Insira o tipo de tinta a ser utilizado: ");
			tipoTinta = entrada.nextInt();
		}
		
		System.out.println("\nab = " + ab);
		System.out.println("h = " + altura);
		
		double a1 = Math.sqrt(Math.pow(altura, 2) + Math.pow(ab, 2));
		System.out.println("a1 = " + a1);
		
		double ladoBase = ab * 2;
		
		double areaTri = (ladoBase * a1) / 2;
		System.out.println("�rea do Tri�ngulo: " + areaTri);
		
		double areaBase = Math.pow(ladoBase, 2);
		System.out.println("�rea da base: " + areaBase);
		
		double areaTotal = (areaTri * 4) + areaBase;
		System.out.println("�rea total: " + areaTotal);
		
		System.out.println("Tipo de Tinta: " + tipoTinta);
		
		double litros = areaTotal / 4.76;
		System.out.println("Litros: " + litros);
		
		int latas = (int) Math.ceil(litros / 18);
		System.out.println("Latas: " + latas);
		
		double preco;
		if(tipoTinta == 1)
			preco = latas * 127.90;
		else if(tipoTinta == 2)
			preco = latas * 258.98;
		else
			preco = latas * 344.34;
		System.out.println("Pre�o: " + preco);
		
		double volume = (areaBase * altura) / 3;
		System.out.println("Volume: " + volume);
		
		entrada.close();
	}
}