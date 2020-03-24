package disciplina;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class Disciplina {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double n1, n2, n3, n4, media;
        
        System.out.println("Digite a primeira nota:");
        n1 = scan.nextDouble();
        System.out.println("Digite a segunda nota:");
        n2 = scan.nextDouble();
        System.out.println("Digite a terceira nota:");
        n3 = scan.nextDouble();
        
        media = (n1+n2+n3)/3;
        
        System.out.println("Sua média nesta disciplina é: "+ media);
        
        if (media >= 7){
            System.out.println("Você está aprovado na disciplina!");
        } else if (media >= 5){
            System.out.println("Você está de recuperação na disciplina.");
        } else {
            System.out.println("Você está reprovado na disciplina.");
        }
    }    
}
