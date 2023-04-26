import java.util.Scanner;
public class ExercicioUmListaTres {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o primeiro numero: ");
        int nota = input.nextInt();
        if ((nota >=0) && (nota <=10))
            System.out.println("numero valido!");
        else{
            while ((nota < 0) || (nota > 10)){
            System.out.println("numero invalido\nDigite novamente");
            nota = input.nextInt();}
        }
        input.close();
    }
}