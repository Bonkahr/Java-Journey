public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs,
               int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
    }

    public void chew(){
        System.out.println(super.getName() + " is Chewing");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating is called.");
        chew();
//        super.eat();
    }

    public void walk(){
        move(5);
    }

    public void run(){
        move(25);
    }
}
