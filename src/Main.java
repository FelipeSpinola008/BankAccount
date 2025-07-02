import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;
        int option;
        do {
            System.out.println("""
                    
                    Operadores
                    
                    1- Criar nova conta
                    2- depositar
                    3- sacar
                    4- saldo
                    5- Conlsultar dados
                    0- Sair
                    
                    Digite a opção Desejada:""");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    if (account == null) {
                        System.out.println("Digite o nome do titular:");
                        scanner.nextLine();
                        String holder = scanner.nextLine();
                        System.out.println("Digite o saldo inicial: R$ ");
                        double newBalance = scanner.nextDouble();
                        account = new BankAccount(holder, newBalance);
                    } else {
                        System.out.println("Uma conta já foi criada. para criar uma nova, reinicie o programa");
                    }
                    break;
                case 2:
                    if (account != null){
                        System.out.println("Digite o valor para depósito: R$ ");
                        double depositValue = scanner.nextDouble();
                        account.deposit(depositValue);
                    } else {
                        System.out.println("Nenhuma conta foi criada. Crie uma primeiro (opção 1)");
                    }
                    break;
                case 3:
                    if (account != null){
                        System.out.println("Digite o valor para saque: R$ ");
                        double withdrawValue = scanner.nextDouble();
                        account.withdrawAmount(withdrawValue);
                    } else {
                        System.out.println("Nenhuma conta foi criada. Crie uma primeiro (opção 1)");
                    }
                    break;
                case 4:
                    if (account != null) {
                        account.balanceConsult();
                    } else {
                        System.out.println("Nenhuma conta criada ainda. Crie uma primeiro (Opção 1).");
                    }
                    break;
                case 5:
                    if (account != null) {
                        account.displayPersonData();
                    } else {
                        System.out.println("Nenhuma conta criada ainda. Crie uma primeiro (Opção 1).");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa, muito obrigado por utilizar!");
                    break;
                default:
                    System.out.println("Opção invalida. por favor escolha uma opção valida no menu.");
            }
        } while (option != 0);
        scanner.close();
    }
}
