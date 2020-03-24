package garcom;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class Garcom {

    public static void main(String[] args) {
        
        double total, comissao;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor total do pedido: ");
        
        total = scan.nextDouble();
        
        comissao = total*0.10;
        
        System.out.println("A comissão do garçom é: R$"+comissao);
    }
    
}
