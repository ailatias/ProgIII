
package antsuc;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class AntSuc {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num, ant, suc;
        
        System.out.println("Insira um número inteiro:");
        num = scan.nextInt();
        
        ant = num-1;
        suc = num+1;
        
        System.out.println("\nNúmero inserido: " + num);
        System.out.println("\nAntecessor: " + ant);
        System.out.println("\nSucessor: " + suc);
    }
    
}
