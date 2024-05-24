import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, informe o seu nome:");
        String nome = input.nextLine();
        System.out.println("Por favor, informe o seu número da conta (somente números, por exemplo, 1021): ");
        int numero = input.nextInt();
        System.out.println("Por favor, informe o Por favor, digite o número da Agência !");
        String agencia = input.next();
        System.out.println("Por favor, informe o seu saldo atual:");
        double saldo = input.nextDouble();

        input.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
