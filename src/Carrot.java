public class Carrot extends Flower {

    public Carrot(String name, double price, double neededArea, double chanceOfGrowth){
         super(name, price, neededArea, chanceOfGrowth);
    }

    public void waterPlant(){
        chanceOfGrowth += 0.1;
    }

}
