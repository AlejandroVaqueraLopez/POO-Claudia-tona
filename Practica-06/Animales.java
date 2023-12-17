class Animal{
    String name;
    String color;
    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }
    
    public void sleep(){
        System.out.println("dormir");
    }
    public void eat(){
        System.out.println("comiendo");
    }
}

class Cat extends Animal {
    public Cat (String name, String color){
        super (name, color);
    }

    public void getName(){
        System.out.println(this.name);
    }
    
}

class Dog extends Animal {
    public Dog(String name, String color){
        super (name, color);
    }

    public void getName(){
        System.out.println(this.name);
    }
    public void bark(){
        System.out.println("Barking");
    }
}

public class Animales{
    public static void main(String [] args){

        Cat cat = new Cat("Snow", "White");
        Dog dog = new Dog("Popi", "Black");
        cat.sleep();
        cat.eat();
        System.out.println();
        dog.sleep();
        dog.eat();

        //Animal animal = new Animal("leopardo", "gris");
        /*Animal animal = new Dog("salchicha","cafe");
        animal.sleep();
        animal.eat();*/
        //animal.bark();

        Animal [] animalArray = new Animal[3];
        animalArray[0] = new Animal("pepe", "gris");
        animalArray[1] = new Animal("pipo", "cafe");
        animalArray[2] = new Dog("papa", "negro");


        for(Animal a: animalArray){
            a.eat();
            if(a instanceof Dog){
                ((Dog) a).bark();
            }
        }
    }
}
