public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fin;

    public Fish(String name, int size, int weight, int gills, int eyes,
                int fin) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fin = fin;
    }

    private void rest(){}
    private void moveBackFin(){}
    private void moveMuscles(){}
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        move(34);
    }

}
