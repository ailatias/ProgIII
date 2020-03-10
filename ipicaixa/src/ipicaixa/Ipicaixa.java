
package ipicaixa;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class Ipicaixa {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int cod1, cod2, quant1, quant2;
        double ipi, valor1, valor2, total;
        
        System.out.println("Insira a porcentagem do IPI: ");
        ipi = scan.nextDouble();
        
        System.out.println("\nInsira o código do produto 1: ");
        cod1 = scan.nextInt();
        
        System.out.println("\nInsira o valor do produto 1:");
        valor1 = scan.nextDouble();
        
        System.out.println("\nInsira a quantidade do produto 1:");
        quant1 = scan.nextInt();
        
        System.out.println("\nInsira o código do produto 2: ");
        cod2 = scan.nextInt();
        
        System.out.println("\nInsira o valor do produto 2:");
        valor2 = scan.nextDouble();
        
        System.out.println("\nInsira a quantidade do produto 2:");
        quant2 = scan.nextInt();
        
        total =  (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
        
        System.out.println("\nValor total a ser pago: R$" + total);
    }
    
}
