import java.util.Scanner;

import javax.swing.plaf.synth.SynthDesktopIconUI;
public class ExercicioTresListaTres {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        System.out.println("Digite seu nome maior que 3 caracteres: ");
        nome = input.next();
        while (nome.length() <= 3) {
            System.out.println("caracteres insuficientes, digite novamente!");
            nome = input.next();
        }

        System.out.println("digite sua idade: ");
        idade = input.nextInt();
        while ((idade < 0) || (idade > 150)) {
            System.out.println("Idade invalida, digite novamente!");
            idade = input.nextInt();
        }

        System.out.println("Digite seu salario: R$");
        salario = input.nextDouble();
        while (salario <= 0) {
            System.out.println("Salario invalido! digite novamente!");
            salario = input.nextDouble();
        }

        System.out.println("Qual o seu sexo f ou m: ");
        sexo = input.next();
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("caracter invalido, digite novamente!");
            sexo = input.next();
        }
        
        System.out.println("Qual seu estado civil: s, c, v, d ");
        estadoCivil = input.next();
        while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
            System.out.println("caracteres insuficientes, digite novamente!");
            estadoCivil = input.next();
        }
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("salario: %.2f\n" , salario);
        System.out.println("Estado Civil: " + estadoCivil);

        input.close();
        

    }
}