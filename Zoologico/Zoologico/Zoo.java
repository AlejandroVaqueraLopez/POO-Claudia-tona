import java.util.ArrayList;
import java.util.List;

class Veterinarian {
    String name;
    double salary;

    public Veterinarian (String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void vaccinate(Animal animal){
        animal.setVaccinated(true);
        System.out.println(animal.getName() + " was vaccinated");
    }
}

public class Zoo{
    private List<Animal> animalArray = new ArrayList<>();
    
    public void addAnimal(Animal animal){
        animalArray.add(animal);
    }

    public void readAnimal(){
        Veterinarian veterinarian = new Veterinarian("roberto", 3000);
        for (Animal animal : animalArray){
            System.out.println(animal.getName() + " " + animal.getSize() + " " + animal.getWeight() + " " + animal.getSpeed() + " " + animal.getColor());
            veterinarian.vaccinate(animal);
        }
    }

    public void deleteAnimal(String nombre){
        int index = 0;
        for (int cont = 0; cont < animalArray.size(); cont++){
            if(nombre == animalArray.get(cont).getName()){
                index = cont;
                System.out.println("match");
            }
        }
        animalArray.remove(index);
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Tiger tiger = new Tiger("Vengala", 4 ,155, 45, "White", false);
        zoo.addAnimal(tiger);

        Tiger leopardo = new Tiger("Leopardo", 4 ,155, 45, "White", true);
        System.out.println(leopardo.roar());//metodo propio del animal "Tigre"
        zoo.addAnimal(leopardo);

        zoo.deleteAnimal("Leopardo");

        zoo.readAnimal();
    }
}
