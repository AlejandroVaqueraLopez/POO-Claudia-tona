/**
 * -declarar un arreglo de numeros enteros
 * -Buscar el elemento minimo
 * -Buscar el elemento maximo
 * -Imprimir el tamano del arreglo.
 */
public class unidimentionalArray {
    public static void main(String[] args){
        int unidimentional[];
        unidimentional = new int[5];

        int min = 0;
        int max = 0;

        for(int index = 0; index < unidimentional.length; index++){
            unidimentional[index] = (index + 1); 
        }
        
        for(int counter = 0; counter < unidimentional.length; counter++){
            if(counter == 0){
                min = unidimentional[counter];
            }
            if(unidimentional[counter] < min){
                min = unidimentional[counter];
            }
            if(unidimentional[counter] > max){
                max = unidimentional[counter];
            }
        }


        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        System.out.println("Array size: " + unidimentional.length);
    }
}
