import java.util.Scanner;
public class ExercicioDoisListaTres{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String login, senha;

        System.out.println("Digite o login: ");
        login = input.next();
        System.out.println("Digite a senha: ");
        senha = input.next();
        if (! (login.equals(senha)))
        System.out.println("senha e login validos!");
        else{
            while( senha.equals(login) ){
            System.out.println("senha ou login invalida! digite novamente");
            login = input.next();
            senha = input.next();}
        }
        input.close();
    }
    
}