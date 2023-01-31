public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 2,
                5, 5);
        Dog dog = new Dog("Tommy", 23,34,2,4,
                14,"brown");
        dog.eat();
        dog.walk();
        dog.run();
    }
}