package calculodividas;

import java.util.Scanner;
/**
 *
 * @author Aíla Maciel
 */
public class CalculoDividas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double debito, meses, jurosm, juros, divida;
        
        System.out.println("Insira o valor inicial do débito:");
        debito = scan.nextDouble();
        System.out.println("Insira a quantidade de meses:");
        meses = scan.nextDouble();
        System.out.println("Insira os juros mensais:");
        jurosm = scan.nextDouble();
        
        jurosm = jurosm * 0.01;
        
        juros = debito * meses * jurosm;
        divida = debito + juros;
        
        System.out.println("Seus juros são R$"+ juros +". Portanto, sua dívida é de R$"+ divida);
    }
    
}
