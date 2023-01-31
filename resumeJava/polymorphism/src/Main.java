class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}


class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats a lot of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens take over planet earth.";
    }
}


class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "The maze runs fast.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star wars");
    }

    @Override
    public String plot() {
        return "The stars win the war.";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
    // no plot override.
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i ++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName()+
                    "\nPlot: " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
            default:
                return null;
        }
    }
}

