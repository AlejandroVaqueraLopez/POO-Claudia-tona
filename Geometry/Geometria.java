class Circulo{
    double radio = 0.00;

    public Circulo(double radio){
        this.radio = radio;
    }
    public double CalcArea(){
        return (3.1416 * (radio * radio));
    }
}
class Rectangulo{
    double base = 0.00;
    double altura = 0.00;
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double CalcArea(){
        return (base * altura);
    }

}

public class Geometria {
    public static void main(String[] args){
        Circulo circulo = new Circulo(3.55);
        System.out.println(circulo.CalcArea());

        Rectangulo rectangulo = new Rectangulo(3.6, 7.3);
        System.out.println(rectangulo.CalcArea());
    }
}