import java.util.Scanner;

public class balada {

    public static void main(String[] args) {

        String nome;
        long cpf;
        int rg;
        int idade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Seja bem vindo(a) a balada FunnyDrink");
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite seu CPF: ");
        cpf = teclado.nextLong();
        System.out.print("Digite seu RG: ");
        rg = teclado.nextInt();
        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Entrada para balada liberada");
        } else {
            System.out.println("Entrada para balada negada");
        }

        System.out.println("Nome: " + nome);
        System.out.print("CPF: " + cpf);
        System.out.print("RG: " + rg);
        System.out.print("Idade: " + idade);
    }
}
