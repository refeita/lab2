
import java.util.Scanner;

//questao9
public class Questao9
{
    public static void main(String[] args){
    Scanner digitos = new Scanner(System.in);
      System.out.println("Digite um numero inteiro com 5 dígitos: ");
      int numero = digitos.nextInt();
      System.out.printf("%d %d %d %d %d\n", numero/10000%10, numero/1000%10, numero/100%10, numero/10%10,numero%10); 
      
}}
