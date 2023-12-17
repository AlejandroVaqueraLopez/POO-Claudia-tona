import java.util.Random;

class MyClass{
    public String test = "hi there";
}

public class Array {
    public static void main(String [] args){
        //ejercicio 1
        int[] integerArray = {1,20,3,44,5,60,7,88,9,100};
        System.out.println(integerArray[5]);

        //ejercicio 2
        int[] ceroArray = {0,0,0,0,0};
        int[] randomArray = new int[5];
        for(int cont = 0; cont < 5; cont++){
            Random rand = new Random(); 
            randomArray[cont] = rand.nextInt();
        }

        //Int[] myClassArray = new int[]{new MyClass(), new MyClass()}
        MyClass[] container = new MyClass[3];
        MyClass firstInstance = new MyClass();
        MyClass secondInstance = new MyClass();
        MyClass thirdInstance = new MyClass();
        container[0] = firstInstance; 
        container[1] = secondInstance; 
        container[2] = thirdInstance; 

        MyClass[] myClassArray = new MyClass[]{new MyClass(), new MyClass()};
    }
}
