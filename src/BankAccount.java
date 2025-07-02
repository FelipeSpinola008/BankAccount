public class BankAccount {
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Você depositou o valor de: " + String.format("R$%.2f", amount));
            System.out.printf("Seu saldo atual é de: R$%.2f%n", getBalance());
        } else {
            System.out.println("Você depositou um valor inválido, deposite pelo menos R$1.00 para que dê certo.");
        }
    }
    public void withdrawAmount(double withdraw) {
        if (withdraw > 0) {
            this.balance -= withdraw;
            System.out.println("Você sacou o valor de: " + String.format("R$%.2f", withdraw));
            System.out.printf("Seu saldo atual é de: R$%.2f%n%n", getBalance());
        }
    }
    public void balanceConsult() {
        System.out.println(String.format("O seu saldo atual é de: R$%.2f", getBalance()));
    }
    public void displayPersonData() {
        System.out.println(String.format("""
            Dados do titular da conta:
               \s
               Nome :   %s
               Saldo:   R$ %.2f
            """, accountHolder, getBalance()));
    }

}
