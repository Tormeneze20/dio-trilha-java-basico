import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       var scanner = new Scanner (System.in);
       System.out.println("Informe o seu nome completo sem acentos ");
       var name = scanner.nextLine();
       System.out.println("Informe o número da sua agência");
       var bankAgency = scanner.nextLine();
       System.out.println("Informe o número da sua conta bancária");
       var bankAccount = scanner.nextInt();
       scanner.nextLine();
       System.out.println("Informe o seu saldo da conta");
       var bankBalance = scanner.nextFloat();
       scanner.nextLine();
       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", name, bankAgency, bankAccount, bankBalance);
       scanner.close();
    }
}
