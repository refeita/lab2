import java.util.Scanner;

public class FrequenciaCardiacaApp 
{
	
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = teclado.next();
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = teclado.next();
		System.out.println("Digite o dia do seu nascimento: ");
		int dia = teclado.nextInt();
		System.out.println("Digite o mes do seu nascimento: ");
		int mes = teclado.nextInt();
		System.out.println("Digite o ano do seu nascimento: ");
		int ano = teclado.nextInt();
		FrequenciaCardiaca p = new FrequenciaCardiaca(nome, sobrenome, dia, mes, ano);
		p.info();
		teclado.close();;
	}

}
