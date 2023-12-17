class Bird{
    String name;
    String color;
    public Bird(String name, String color){
        this.name = name;
        this.color = color;
    }
    
    public void attack(){
        System.out.println("attack");
    }
}

class Little extends Bird {
    public Little (String name, String color){
        super (name, color);
    }

    public void getName(){
        System.out.println(this.name);
    }
    
    public void explote(){
        System.out.println("exploted");
    }
}

class Big extends Bird {
    public Big (String name, String color){
        super (name, color);
    }

    public void getName(){
        System.out.println(this.name);
    }
    
    public void dissapear(){
        System.out.println("is not visible now");
    }
}

public class BirdMain{
    public static void main(String [] args){

        Big big = new Big("PrimerPajaro", "azul");
        Little little = new Little("SegundoPajaro", "rojo");

        big.attack();
        big.getName();
        big.dissapear();

        System.out.println();

        little.attack();
        little.getName();
        little.explote();

    }
}
