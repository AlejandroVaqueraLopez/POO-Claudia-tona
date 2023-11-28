public class Computadora {
    String color = "";
    int almacenamiento = 0;
    String procesador = "";
    boolean touchScreen = false;
    int annio = 0;
    int memoria = 0;
    public static void main(String[] args){
        Computadora primerComputadora = new Computadora();
        primerComputadora.color = "Negro";
        primerComputadora.almacenamiento = 512;
        primerComputadora.procesador = "i7 9th";
        primerComputadora.touchScreen = true;
        primerComputadora.annio = 2015;
        primerComputadora.memoria = 16000;
        System.out.println("----------------------------------------------------");
        System.out.println("Color: " + primerComputadora.color);
        System.out.println("Almacenamiento: " + primerComputadora.almacenamiento + " gb");
        System.out.println("Procesador: " + primerComputadora.procesador);
        System.out.println("TouchScreen: " + primerComputadora.touchScreen);
        System.out.println("Annio: " + primerComputadora.annio);
        System.out.println("Memoria RAM: " + primerComputadora.memoria + " mb");


        Computadora segundaComputadora = new Computadora();
        segundaComputadora.color = "Azul";
        segundaComputadora.almacenamiento = 1024;
        segundaComputadora.procesador = "i7 10th";
        segundaComputadora.touchScreen = true;
        segundaComputadora.annio = 2020;
        segundaComputadora.memoria = 32000;
        System.out.println("----------------------------------------------------");
        System.out.println("Color: " + segundaComputadora.color);
        System.out.println("Almacenamiento: " + segundaComputadora.almacenamiento + " gb");
        System.out.println("Procesador: " + segundaComputadora.procesador);
        System.out.println("TouchScreen: " + segundaComputadora.touchScreen);
        System.out.println("Annio: " + segundaComputadora.annio);
        System.out.println("Memoria RAM: " + segundaComputadora.memoria + " mb");

        Computadora tercerComputadora = new Computadora();
        tercerComputadora.color = "Gris";
        tercerComputadora.almacenamiento = 250;
        tercerComputadora.procesador = "i3 3th";
        tercerComputadora.touchScreen = false;
        tercerComputadora.annio = 2011;
        tercerComputadora.memoria = 8000;
        System.out.println("----------------------------------------------------");
        System.out.println("Color: " + tercerComputadora.color);
        System.out.println("Almacenamiento: " + tercerComputadora.almacenamiento + " gb");
        System.out.println("Procesador: " + tercerComputadora.procesador);
        System.out.println("TouchScreen: " + tercerComputadora.touchScreen);
        System.out.println("Annio: " + tercerComputadora.annio);
        System.out.println("Memoria RAM: " + tercerComputadora.memoria + " mb");
    }
}
