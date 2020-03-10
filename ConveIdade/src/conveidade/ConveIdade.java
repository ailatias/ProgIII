
package conveidade;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class ConveIdade {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int ano, mes, dia, resultado;
        
       System.out.println("Insira sua idade (anos, meses e dias), um de cada vez e apertando a tecla Enter:");
       System.out.println("\nAnos: ");
       ano = scan.nextInt();
       System.out.println("\nMeses: ");
       mes = scan.nextInt();
       System.out.println("\nDias: ");
       dia = scan.nextInt();
       
       ano = ano*365;
       mes = mes*30;
       resultado = ano+mes+dia;
       
       System.out.println("\n\nAqui está sua idade em dias: " + resultado);
       
       
    }
    
}
