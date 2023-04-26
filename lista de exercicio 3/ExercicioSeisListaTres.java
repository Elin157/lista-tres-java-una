import java.util.Scanner;
public class ExercicioSeisListaTres {
    public static void main (String[] args){
        int numero, numeroUm, numeroDois;
        Scanner input = new Scanner(System.in);
        System.out.println("digite o primeiro numero: ");
        numeroUm = input.nextInt();
        System.out.println("digite o segundo numero: ");
        numeroDois = input.nextInt();
        while (numeroUm > numeroDois) {
            System.out.println("primeiro numero menor que o segundo, digite-os novamente");
            numeroUm = input.nextInt();
            numeroDois = input.nextInt();
        }
            for(numero = numeroUm; numero <= numeroDois; numero++){
            System.out.println(numero);
        }
        input.close();
    }
}
