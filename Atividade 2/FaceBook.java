/*
O Facebook alcançou um bilhão de usuários em outubro de 2012 (de acordo com
pesquisa do CNNMoney.com). Usando a técnica de crescimento composto semelhante a
que você aprendeu na Atividade Prática 6 (agora com a fórmula abaixo) e supondo que
a base de usuários cresça a uma taxa de 4% ao mês, quantos meses levarão para que o
Facebook aumente sua base de usuários para 1,5 bilhão? Quantos meses serão
necessários para que o Facebook expanda sua base de usuários para dois bilhões? Até
dezembro de 2021, qual será a estimativa da base de usuários?
Fórmula: total = p x (1 + r)n;
package facebook;
p: quantidade de usuários;
r: taxa de juros anual (para 4%, utilize 0,04);
n: número de anos;
total: quantidade no n-enésimo ano.
*/

public class FaceBook {

    public static void main(String[] args) {
        double taxa;
        taxa = 0.04;
        double usuario = 1000000000;
        double usuarios=1000000000;
        int mes1= 0;
        int mes2=0;
        double total = 0;
        int outubroadezembro = 110;
         
        while(usuario <=1500000000){
            usuario+= usuario * taxa;
            mes1++;
        }
        while(usuarios<=2000000000){
            usuarios+= usuarios* 0.04;
            mes2++;
        }
        total = (1000000000 * (Math.pow(1 + taxa,outubroadezembro)));
                
             System.out.printf("Para expadir sua base para 1,5 bilhão de usuários o Facebook vai levar: "+mes1+" meses\n");
             System.out.printf("Para expadir sua base para 2 bilhões de usuários o Facebook vai levar: "+mes2+" meses\n");
             System.out.printf("Até dezembro de 2021, a extimativa de usuário vai ser de: %.0f %n",total,"\n");
    }
}
