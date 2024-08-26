import java.util.Scanner;
 
public class ativ2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite um número de 1 a 10: ");
        int numeroDigitado = scanner.nextInt();
 
        switch (numeroDigitado) {
            case 1:
                double resultado1 = Math.sqrt(numeroDigitado + 3);
                System.out.println("Resultado: " + resultado1);
                break;
 
            case 2:
                int resultado2 = Math.abs(numeroDigitado - 3);
                System.out.println("Resultado: " + resultado2);
                break;
 
            case 3:
                int resultado3 = (numeroDigitado * 5) % 6;
                System.out.println("Resultado: " + resultado3);
                break;
 
            case 4:
                double resultado4 = Math.pow(numeroDigitado, 3);
                System.out.println("Resultado: " + resultado4);
                break;
 
            case 5:
                int resultado5 = numeroDigitado % 3;
                System.out.println("Resultado: " + resultado5);
                break;
 
            case 6:
                double resultado6 = Math.pow((numeroDigitado / 2.0), 2);
                System.out.println("Resultado: " + resultado6);
                break;
 
            case 7:
                System.out.println("O número digitado foi sete");
                break;
 
            case 8:
                double resultado8 = (numeroDigitado * 5.0) / 20;
                System.out.println("Resultado: " + resultado8);
                break;
 
            case 9:
                double resultado9 = (Math.pow(numeroDigitado, 3)) / 243.0;
                System.out.println("Resultado: " + resultado9);
                break;
 
            case 10:
                double resultado10 = Math.sqrt(numeroDigitado + 15);
                System.out.println("Resultado: " + resultado10);
                break;
 
            default:
                System.out.println("Número inválido");
                break;
        }
 
        scanner.close();
    }
}
 
 