package mediaaluno;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class MediaAluno {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double n1, n2, n3, n4, media;
        
        System.out.println("Digite a primeira nota do aluno:");
        n1 = scan.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        n2 = scan.nextDouble();
        System.out.println("Digite a terceira nota do aluno:");
        n3 = scan.nextDouble();
        System.out.println("Digite a quarta nota do aluno:");
        n4 = scan.nextDouble();
        
        media = (n1+n2+n3+n4)/4;
        
        System.out.println("A média do aluno é: "+ media);
    }
    
}
