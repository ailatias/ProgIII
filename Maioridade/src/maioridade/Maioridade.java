package maioridade;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class Maioridade {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int idade;
        
        System.out.println("Informe sua idade:");
        idade = scan.nextInt();
        
        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        } else{
            System.out.println("Você é menor de idade.");
        }
    }    
}
