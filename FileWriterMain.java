import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
 
public class FileWriterMain {
    public static void main(String[] args) {
    try {
        FileWriter myWriter = new FileWriter("C:\\Users\\Vacintosh\\Documents\\projects\\POO-Claudia-tona\\newFile.txt");
        myWriter.write("Prueba de escritura de archivos");
        myWriter.close();
        System.out.println("Se escribio el archivo exitosamente.");
    } catch (IOException e) {
        System.out.println("Ocurrio un error.");
        e.printStackTrace();
    }
  }
}
