public class Bank {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(String number, double balance, String customerName,
                String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount){
            this.balance -= amount;
            System.out.println("Withdrawal of Ksh." + amount + " made.");
        } else {
            System.out.println("Your balance is insufficient to withdraw Ksh." +
                    amount + ". Your balance is Ksh." + this.balance);
        }
    }
}
