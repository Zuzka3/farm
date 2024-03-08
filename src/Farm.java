import java.util.ArrayList;
import java.util.List;

public class Farm {

private List<Flower> flowers;
private List<Animal> animals;
private double land;
private Barn barn;
private double money;
private double landLeft;


    public Farm() {
        this.flowers = new ArrayList<>();
        this.animals = new ArrayList<>();
        land = 100.0;
        this.barn = new Barn();
        this.money = 1000000.0;
        this.landLeft = land;

    }

    public void plant (Flower flower){
        if(landLeft < flower.neededArea) throw new RuntimeException("you cant do it");
        if (flowers.size() < 5){
            flowers.add(flower);
            land -= flower.neededArea;
        }
        throw new RuntimeException("you cant do it");
    }

    public void harvest (Flower flower){
        if(flowers.contains(flower)){
            land += flower.getNeededArea();
            flowers.remove(flower);

        }
        throw new RuntimeException("land is empty");
    }








}
