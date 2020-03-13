package idadeatual;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class IdadeAtual {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int atual, nasc, idade;
        
        System.out.println("Informe o ano atual:");
        atual = scan.nextInt();
        System.out.println("Informe o ano de seu nascimento:");
        nasc = scan.nextInt();
        
        idade = atual-nasc;
        System.out.println("No ano de "+ atual +" você completa "+ idade + " anos.");
    }
    
}
