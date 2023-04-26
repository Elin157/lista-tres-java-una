import java.util.Scanner;
public class ExercicioCincoListaTres {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        for (int numero = 1; numero <= 50; numero ++){
            if (numero % 2 !=0)
            System.out.println("os numeros impares são:\n" + numero);
        }
    }
}