import java.util.Scanner;

public class DiarioDeTeste{
	 public static void main(String[] args)
	    {
	        Scanner entrada;
	        byte nota;

	        System.out.println("Bem-vindos turma de prog. 2!!!");
	        System.out.println("Digite a nota 1: ");
	        entrada = new Scanner(System.in);
	        nota = entrada.nextByte();
	        DiarioDeNotas objeto1 = new DiarioDeNotas();
	        System.out.println(objeto1.getNota());
	        objeto1.setNota(nota);
	        System.out.println(objeto1.getNota());
	        objeto1.exibirMensagem();

	        entrada.close();
	    } // Fim do main


         /*public class DiarioDeTesteMsg
         {*/

    /**
     *
     * @param args
     */

	static {
		DiarioDeNotas d = new DiarioDeNotas("Programacao", "Professor");
		d.exibirMensagem();
	}

}


