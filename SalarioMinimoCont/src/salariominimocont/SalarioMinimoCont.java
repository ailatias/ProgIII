package salariominimocont;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class SalarioMinimoCont {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double minimo, salario, cont;
        
        System.out.println("Informe o salário mínimo atual:");
        minimo = scan.nextDouble();
        System.out.println("Informe seu salário:");
        salario = scan.nextDouble();
        
        cont = salario/minimo;
        System.out.println("Você recebe o equivalente a "+ cont +" salários mínimos.");
    }
    
}
