package votar;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class Votar {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Informe sua idade:");
        idade = scan.nextInt();
        
        if (idade < 16){
            System.out.println("Você ainda não pode votar.");
        } else if (idade >= 18 && idade <= 70){
            System.out.println("Você é obrigado a votar.");
        } else if (idade < 18 || idade > 70){
            System.out.println("Você pode, mas não é obrigado a votar.");
        }
    }
    
}
