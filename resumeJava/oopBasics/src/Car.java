import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase(Locale.ROOT);
        if (validModel.equals("axela") || validModel.equals("atenza")) {
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
