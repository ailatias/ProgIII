package porcentagemturma;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class PorcentagemTurma {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int turma, homem, mulher;
        double porcent1, porcent2;
        
        System.out.println("Informe a quantidade de alunos na turma:");
        turma = scan.nextInt();
        System.out.println("Informe quantos alunos na turma são homens:");
        homem = scan.nextInt();
        System.out.println("Informe quantos alunos na turma são mulheres:");
        mulher = scan.nextInt();
        
        
        porcent1 = (homem*100)/turma;
        porcent2 = (mulher*100)/turma;
        
        System.out.println("Na turma informada "+ porcent1 +"% são homens e "+ porcent2 +"% são mulheres.");
    }
    
}
