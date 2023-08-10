import java.util.Scanner;

public class Balada {

    public static void main(String[] args) {

        String nome, nomeAcompanhante;
        long cpf, cpfAcompanhante;
        int rg, rgAcompanhante;
        int idade = 0, idadeAcompanhante = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Seja bem vindo(a) à balada Balada_dos_Pares");
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite seu CPF: ");
        cpf = teclado.nextLong();
        System.out.print("Digite seu RG: ");
        rg = teclado.nextInt();

        while (true) {
            System.out.print("Digite sua idade: ");
            if (teclado.hasNextInt()) {
                idade = teclado.nextInt();
                if (idade < 18 && idade % 2 != 0 ) {
                    System.out.println("Entrada para balada negada - Menor de 18 anos");
                } else {
                    System.out.println("Entrada para balada liberada");
                }
                break;
            } else {
                System.out.println("Digite apenas a idade em números.");
                teclado.next(); // Limpa a entrada inválida do teclado
            }
        }

        if (idade >= 18 && idade %2 == 0){
            System.out.println("Entrada para balada liberada");
        } else if (idade > 18 && idade % 2 != 0) {
            System.out.println("Seja bem vindo(a) à balada Balada_dos_Pares");
            System.out.print("Digite seu nome (Acompanhante): ");
            nome = teclado.next();
            System.out.print("Digite sua idade (Acompanhante): ");
            idadeAcompanhante = teclado.nextInt();
            System.out.print("Digite seu CPF (Acompanhante): ");
            cpf = teclado.nextLong();
            System.out.print("Digite seu RG (Acompanhante): ");
            rg = teclado.nextInt();
        } else {
            System.out.println("Proibido a entrada de menores");
        }

        if ((idade + idadeAcompanhante)%2==0 && idadeAcompanhante >=18){
            System.out.println("Entrem na Balada");
        } else {
            System.out.println();
        }

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Idade: " + idade);
    }
}

