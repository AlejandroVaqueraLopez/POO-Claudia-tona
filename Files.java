import java.io.File;
import java.io.IOException;
public class Files {
    public static void main(String[] args){
        try{
            File myObj = new File("C:\\Users\\Vacintosh\\Documents\\projects\\POO-Claudia-tona\\newFile.txt");
            if(myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            }else{
                System.out.println("File already exist");
            }
        }catch(IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }

    
}
