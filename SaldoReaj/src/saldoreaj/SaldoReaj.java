
package saldoreaj;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class SaldoReaj {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double saldo;
        
        System.out.println("Informe seu saldo: ");
        saldo = scan.nextDouble();
        saldo = saldo+(saldo*0.01);
        System.out.println("\nSeu saldo com reajuste é: R$" + saldo);
    }
    
}
