abstract class Animal{//
    public void Comer(){
        System.out.println("Comiendo");
    }
    public void Dormir(){
        System.out.println("Dormiendo");
    }
}

class Tiger extends Animal{
    public void Roar(){
        System.out.println("roar");
    }
}

class Koala extends Animal{
    public void Climb(){
        System.out.println("climb");
    }
}

public abstract class AnimalMain{
    public static void main(String [] args){
        Animal [] animales = {new Tiger(), new Koala()};
        for(Animal animal : animales){
            animal.Comer();
        }

    }
}

