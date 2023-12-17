import java.util.Scanner;

abstract class Robot{
    int id;
    String name;
    int battery;

    public Robot(int id, String name, int battery){
        this.id = id;
        this.name = name;
        this.battery = battery;
    };

    public void Greetings(){
        System.out.println("Hi, am " + this.name);
    }

    public void TellBattery(){
        System.out.println(" My Battery is " + this.battery);
    }

    public void GetId(){
        System.out.println(" My ID is " + this.id);
    }
}

class MiniRobotA extends Robot implements CutIngredients{
    public MiniRobotA (int id, String name, int battery){
        super(id, name, battery);
    }

    @Override
    public void CutIngredients(){
        System.out.println("1 - Ingredients are being prepared");
    }
}

class MiniRobotB extends Robot implements Cook{
    public MiniRobotB (int id, String name, int battery){
        super(id, name, battery);
    }

    @Override
    public void Cook(){
        System.out.println("2 - Cooking ingredients ");
    }
}

class MiniRobotC extends Robot implements Deliver{
    public MiniRobotC (int id, String name, int battery){
        super(id, name, battery);
    }

    @Override
    public void Deliver(){
        System.out.println("3 - Food is being delivered");
    }
}

class MagnusOpus extends Robot implements FullSteps{
    public MagnusOpus (int id, String name, int battery){
        super(id, name, battery);
    }

    @Override
    public void CutIngredients(){
        System.out.println("1 - Ingredients are being prepared");
    }

    @Override
    public void Cook(){
        System.out.println("2 - Food is cooking");
    }

    @Override
    public void Deliver(){
        System.out.println("3 - Food is being delivered");
    }
}

public abstract class MagnusOpusMain {
    public static void main(String [] args){
        int opc = 0;
        do{
            System.out.println("--------------Menu de opcion-------------");
            System.out.println("1. Desayuno");
            System.out.println("2. Comida");
            System.out.println("3. Cena");
            System.out.println("4. Salir");
            System.out.println("-----------------------------------------");

            System.out.println("Ingrese la opcion: ");
            Scanner input = new Scanner(System.in);
            opc = input.nextInt();

            MiniRobotA A = new MiniRobotA(1,"robot A", 30);
            MiniRobotB B = new MiniRobotB(2,"robot B", 20);
            MiniRobotC C = new MiniRobotC(3,"robot C", 80);
            MagnusOpus magnusOpus = new MagnusOpus(5,"robot A", 30);

            switch (opc) {
                case 1:
                    A.Greetings();
                    A.CutIngredients();

                    B.Greetings();
                    B.Cook();

                    C.Greetings();
                    C.Deliver();

                    System.out.println("Desayuno preparado");
                    break;
                case 2: 
                    A.Greetings();
                    A.CutIngredients();

                    B.Greetings();
                    B.Cook();

                    C.Greetings();
                    C.Deliver();

                    System.out.println("Comida lista");
                    break;

                case 3: 
                    A.Greetings();
                    A.CutIngredients();

                    B.Greetings();
                    B.Cook();

                    C.Greetings();
                    C.Deliver();

                    System.out.println("Cena servida");
                    break;
            }
        }while(opc != 4);
    }
}
