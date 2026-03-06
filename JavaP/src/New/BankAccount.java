package New;
class BankAccount {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }



    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.deposit(200000);
        a.withdraw(10000);

        System.out.println("Current Balance: " + a.getBalance());
    }
}
