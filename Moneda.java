public class Moneda {
    int peso = 15;
    String color = "";
    String material = "";
    double valor = 0;
    int annio = 0;
    public static void main(String[] args){
        Moneda primerMoneda = new Moneda();
        primerMoneda.peso = 15;
        primerMoneda.color = "gris";
        primerMoneda.material = "metal";
        primerMoneda.valor= 0.4;
        primerMoneda.annio = 2010;
        System.out.println("----------------------------------------------------");
        System.out.println("Peso: " + primerMoneda.peso + " gr");
        System.out.println("Color: " + primerMoneda.color);
        System.out.println("Material: " + primerMoneda.material);
        System.out.println("Valor: " + primerMoneda.valor + " dlls");
        System.out.println("Annio: " + primerMoneda.annio);


        Moneda segundaMoneda = new Moneda();
        segundaMoneda.peso = 12;
        segundaMoneda.color = "dorado";
        segundaMoneda.material = "oro";
        segundaMoneda.valor= 2;
        segundaMoneda.annio = 2014;
        System.out.println("----------------------------------------------------");
        System.out.println("Peso: " + segundaMoneda.peso + " gr");
        System.out.println("Color: " + segundaMoneda.color);
        System.out.println("Material: " + segundaMoneda.material);
        System.out.println("Valor: " + segundaMoneda.valor + " dlls");
        System.out.println("Annio: " + segundaMoneda.annio);


        Moneda tercerMoneda = new Moneda();
        tercerMoneda.peso = 10;
        tercerMoneda.color = "plata";
        tercerMoneda.material = "plata";
        tercerMoneda.valor= 1;
        tercerMoneda.annio = 1820;
        System.out.println("----------------------------------------------------");
        System.out.println("Peso: " + tercerMoneda.peso + " gr");
        System.out.println("Color: " + tercerMoneda.color);
        System.out.println("Material: " + tercerMoneda.material);
        System.out.println("Valor: " + tercerMoneda.valor + " dlls");
        System.out.println("Annio: " + tercerMoneda.annio);
    }
}
