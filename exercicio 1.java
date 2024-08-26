import java.util.Scanner;
 
public class impar_par{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite um número entre -30 e 30: ");
        int numero = scanner.nextInt();
       
        if (numero < -30 || numero > 30) {
            System.out.println("Número inválido!");
        } else {
            if (numero % 2 == 0) {
                System.out.println("O número que você digitou é par");
            } else {
                System.out.println("O número que você digitou é ímpar");
            }
           
            int valorAbsoluto = Math.abs(numero);
            int valorMaximo = Math.max(Math.abs(numero), Math.abs(-4));
           
            System.out.println("Valor Absoluto: " + valorAbsoluto);
            System.out.println("Valor Máximo comparado com -4: " + valorMaximo);
        }
       
        scanner.close();
    }
}