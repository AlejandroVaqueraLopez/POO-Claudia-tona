
//Son metodos que se sustituyen en tiempo de ejecucion
//Sobreescritura

class Transporte {
    public void Acelerar(){
        System.out.println("Acelerar");
    }
}

class Camion extends Transporte{
    public void Acelerar(){
        System.out.println("Run Run");
    }
}
class Taxi extends Transporte {
    public void Acelerar(){
        System.out.println("Pii piiii");
    }
}
class Tren extends Transporte {
    public void Acelerar(){
        System.out.println("Chu chuuuu");
    }
}

public class TransporteMain {
    public static void main(String[] args){
        Camion camion = new Camion();
        Taxi taxi = new Taxi();
        Tren tren = new Tren();

        Transporte transporte = new Transporte();

        transporte = camion;
        transporte.Acelerar();//run run

        transporte = taxi;
        transporte.Acelerar();//pi piii

        transporte = tren;
        transporte.Acelerar();//chu chuuu
    }
}
