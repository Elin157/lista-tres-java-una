import java.util.Scanner;

public class ExercicioSeteListaTres {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int par = 0, impar = 0;
        for(int inteiro = 1; inteiro <=10; inteiro++){
            System.out.printf("digite o %d numero: " , inteiro);
            int numero = input.nextInt();
            if (numero % 2 == 0)
                par++;
            else{
                impar++;
            }
        }
        System.out.printf("A quantidade de pares são: %d\n", par);
        System.out.printf("A quantidade de impares são: %d" , impar);
        input.close();
    }
}