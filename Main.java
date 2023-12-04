class Persona {
    private String _nombre = "";
    private int _edad = 0;
    private String _ciudad = "";

    public Persona(String nombre, int edad, String ciudad){
        this._nombre = nombre;
        this._edad = edad;
        this._ciudad = ciudad;
    }

    public String getNombre(){
        return this._nombre;
    }
    public int getEdad(){
        return this._edad;
    }
    public String getCiudad(){
        return this._ciudad;
    }
}

public class Main{
   public static void main(String[] args) {
        Persona Julio = new Persona("Julio", 45, "Tijuana");
        System.out.println("-----------------------------------");
        System.out.println("Nombre: " + Julio.getNombre());
        System.out.println("Edad: " + Julio.getEdad());
        System.out.println("Ciudad: " + Julio.getCiudad());
   }
    
}
