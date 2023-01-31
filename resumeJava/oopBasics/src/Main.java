public class Main {
    public static void main(String[] args) {

        Car mazda = new Car();

        mazda.setModel("Axela");
        mazda.setModel("Atenza");
        System.out.println("Model is " + mazda.getModel());

        Bank equity = new Bank("12345667",0,
                "Daniel", "0713028456" );
        equity.withdraw(100);
        equity.deposit(300);
        System.out.println("Your balance is: " + equity.getBalance());
        equity.withdraw(400);
        equity.withdraw(300);
        System.out.println(equity.getBalance());

        // Testing multiple constructors.
        VipCustomer customer = new VipCustomer();
        VipCustomer bennie = new VipCustomer("Danson",
                "dansion@gmail.com");
        VipCustomer Hendrick = new VipCustomer("Hendrick",
                23.45, "hendrick" +
                "@email.com");
    }
}