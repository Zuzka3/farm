import java.util.List;

public class Barn {
    private List<Animal> animals;


    public Barn() {
        this.animals = animals;

    }

    public boolean canAddAnimal(Animal animal) {
        return animals.size() < 20;
    }
}
