public class Main {
    public static void main(String[] args) {
        Dimension dimensions = new Dimension(20, 30, 40);
        Case theCase = new Case("133s", "Lenovo",
                "110/220V", dimensions);
        Monitor theMonitor = new Monitor("32inch Samsung", "Samsung", 27,
                new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ45", "Lenovo", 3,
                "v3.45");
        Computer pc = new Computer(theCase, theMonitor, theMotherboard);

        pc.powerUp();

    }
}
