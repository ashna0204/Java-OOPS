
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("amith", 100);

        account.deposit(1000);
        System.out.println(account.getBalance());

    }
}
