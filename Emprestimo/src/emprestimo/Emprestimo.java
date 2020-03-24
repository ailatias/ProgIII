package emprestimo;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class Emprestimo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double bruto, desconto, emprestimo, max;
        
        System.out.println("Informe seu salário bruto:");
        bruto = scan.nextDouble();
        System.out.println("Informe os descontos de seu salário:");
        desconto = scan.nextDouble();
        System.out.println("Informe o valor desejado de empréstimo:");
        emprestimo = scan.nextDouble();
        
        max = (bruto-desconto)*0.3;
        
        if (emprestimo <= max){
            System.out.println("Parabéns! Você está poderá fazer o empréstimo desejado.");
        } else{
            System.out.println("Sinto muito, não será possível fazer o empréstimo desejado.");
        }
    }
}
