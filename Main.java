class Persona {
    private String _nombre = "";
    int _edad = 0;
    String _ciudad = "";

    public Persona(String nombre, int edad, String ciudad){
        this._nombre = nombre;
        this._edad = edad;
        this._ciudad = ciudad;
    }

    public String getNombre(){
        return this._nombre;
    }
}

public class Main{
   public static void main(String[] args) {
        Persona Julio = new Persona("Julio", 45, "Tijuana");
        System.out.println("-----------------------------------");
        System.out.println("Nombre: " + Julio.getNombre());
        System.out.println("Edad: " + Julio._edad);
        System.out.println("Ciudad: " + Julio._ciudad);
   }
    
}
