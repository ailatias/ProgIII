
package salariomin;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class SalarioMin {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double salario, min;
        
        System.out.println("Insira aqui seu salário em reais:");
        salario = scan.nextDouble();
        
        min = salario/1045;
        
        System.out.println("\nAqui está a quantidade de salários mínimos recebidos: " + min);
    }
    
}
