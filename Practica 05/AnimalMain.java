class Animal{
    String name;
    int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void eat(){
        System.out.println(name+ " is eating");
    }

    
}

class Aligator extends Animal {
    public Aligator (String name, int age){
        super (name, age);
    }
    
    public void bite(){
        System.out.println(name + "is eating");
    }
}

public class AnimalMain{
    public static void main(String [] args){
        Aligator aligator = new Aligator("pepe", 1);
        aligator.eat();//pepe is eating
    }
}