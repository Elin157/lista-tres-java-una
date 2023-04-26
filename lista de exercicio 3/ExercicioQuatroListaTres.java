import java.util.Scanner;
public class ExercicioQuatroListaTres {
    public static void main(String[] args){
        int primeiroNumero, segundoNumero, terceiroNumero, quartoNumero, quintoNumero, soma;
        double mediaAritmetica;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        primeiroNumero = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        segundoNumero = input.nextInt();

        System.out.println("Digite o terceiro numero: ");
        terceiroNumero = input.nextInt();

        System.out.println("Digite o quarto numero: ");
        quartoNumero = input.nextInt();

        System.out.println("Digite o quinto numero: ");
        quintoNumero = input.nextInt();

        soma = primeiroNumero + segundoNumero + terceiroNumero + quartoNumero + quintoNumero;
        System.out.println("A soma dos numeros é: " + soma);

        mediaAritmetica = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero + quintoNumero) / 5;
        System.out.printf("A média aritmetica é: %.2f" , mediaAritmetica);
        input.close();
    }
}