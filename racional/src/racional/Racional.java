package racional;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class Racional {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double num, den, real;
        
        System.out.println("Digite o numerador:");
        num = scan.nextDouble();
        System.out.println("Digite o denominador:");
        den = scan.nextDouble();
        
        if (den > 0){
            real = num/den;
            System.out.println("O número real é: "+ real);
        } else{
            System.out.println("O denominador não pode ser zero! Insira os valores corretos.");
        }
    }    
}

