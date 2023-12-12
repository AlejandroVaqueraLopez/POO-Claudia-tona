import java.util.ArrayList;
import java.util.List;

public class Zoo{
    private List<Animal> animalArray;

    public Zoo(){
        animalArray =  new ArrayList<>();
    }
    
    public void addAnimal(Animal animal){
        animalArray.add(animal);
    }

    public void readAnimales(){
        for (Animal animal : animalArray){
            System.out.println(animal.getName() + " " + animal.getSize() + " " + animal.getWeight() + " " + animal.getSpeed() + " " + animal.getColor());
        }
    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Tiger tiger = new Tiger("Vengala", 4 ,155, 45, "White");
        zoo.addAnimal(tiger);

        zoo.readAnimales();
    }
}
