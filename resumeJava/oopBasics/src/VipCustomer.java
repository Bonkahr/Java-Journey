public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        System.out.println("Main constructor called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 0.0, emailAddress);
        System.out.println("Two parameter const called.");
    }

    public VipCustomer() {
        this("someone", 0.00, "someone@email.com");
        System.out.println("No parameter const called.");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
