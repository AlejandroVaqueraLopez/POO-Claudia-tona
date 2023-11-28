public class Carro {
    String _marca = "";
    String _modelo = "";
    int _annio = 0;
    String _color = "";

    public Carro(String marca, String modelo, int annio, String color){
        _marca = marca;
        _modelo = modelo;
        _annio = annio;
        _color = color;
    }

    public String Acelerar(){
        return (_modelo + " Acelera");
    }

    public String Frenar(){
        return (_modelo + " Frena");
    }  

    public String Encender(){
        return (_modelo + " Enciende");
    }

    public String Apagar(){
        return (_modelo + " Se apaga");
    }
    public static void main(String[] args){
        Carro primerInstancia = new Carro("Kya", "Secure", 2015, "Blanco");
        //Atributos
        System.out.println("----------------------------------------------------");
        System.out.println("Marca: " + primerInstancia._marca);
        System.out.println("Modelo: " + primerInstancia._modelo);
        System.out.println("Annio: " + primerInstancia._annio);
        System.out.println("Color: " + primerInstancia._color);
        //Metodos
        System.out.println("Acelerar: " + primerInstancia.Acelerar());
        System.out.println("Frenar: " + primerInstancia.Frenar());
        System.out.println("Encender: " + primerInstancia.Encender());
        System.out.println("Apagar: " + primerInstancia.Apagar());

        Carro segundaInstancia = new Carro("Honda", "Civic", 2005, "Verde");
        //Atributos
        System.out.println("----------------------------------------------------");
        System.out.println("Marca: " + segundaInstancia._marca);
        System.out.println("Modelo: " + segundaInstancia._modelo);
        System.out.println("Annio: " + segundaInstancia._annio);
        System.out.println("Color: " + segundaInstancia._color);
        //Metodos
        System.out.println("Acelerar: " + segundaInstancia.Acelerar());
        System.out.println("Frenar: " + segundaInstancia.Frenar());
        System.out.println("Encender: " + segundaInstancia.Encender());
        System.out.println("Apagar: " + segundaInstancia.Apagar());

        Carro terceraInstancia = new Carro("Chevrolet", "Chevy C2 Hatchback", 2005, "Azul");
        //Atributos
        System.out.println("----------------------------------------------------");
        System.out.println("Marca: " + terceraInstancia._marca);
        System.out.println("Modelo: " + terceraInstancia._modelo);
        System.out.println("Annio: " + terceraInstancia._annio);
        System.out.println("Color: " + terceraInstancia._color);
        //Metodos
        System.out.println("Acelerar: " + terceraInstancia.Acelerar());
        System.out.println("Frenar: " + terceraInstancia.Frenar());
        System.out.println("Encender: " + terceraInstancia.Encender());
        System.out.println("Apagar: " + terceraInstancia.Apagar());

    }
}
