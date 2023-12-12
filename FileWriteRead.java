import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException; // Import the IOException class to handle errors
 
public class FileWriteRead {
  public static void main(String[] args) {
    try{
        //create file
        FileWriter myWriter = new FileWriter("C:\\Users\\Vacintosh\\Documents\\projects\\POO-Claudia-tona\\nothing.txt");
        myWriter.write("hola mundoo\njajajaj\npuedo escribir\ntantas lineas\nquiera yo");
        myWriter.close();
    } catch (IOException e) {
        System.out.println("Ocurrio un error.");
        e.printStackTrace();
    }

    try {
        //read file
        File myObj = new File("C:\\Users\\Vacintosh\\Documents\\projects\\POO-Claudia-tona\\nothing.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("Ocurrio un error.");
        e.printStackTrace();
    }
  }
}

