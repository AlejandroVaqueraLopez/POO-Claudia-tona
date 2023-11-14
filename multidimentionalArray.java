/**
 * -declarar un arreglo de numeros enteros
 * -Buscar el elemento minimo
 * -Buscar el elemento maximo
 * -Imprimir el tamano del arreglo.
 */
public class multidimentionalArray {
    public static void main(String[] args){
        int matrixA[][] = {
            {1,2,2},
            {1,2,3},
            {2,1,2}
        };
        int matrixB[][] = {
            {2,2,2},
            {1,1,1},
            {4,4,3}
        };
        int matrixC[][] = new int[3][3];

        //multiply
        for(int stIndex = 0; stIndex < matrixC.length; stIndex++){
            for(int ndIndex = 0; ndIndex < matrixC.length; ndIndex++){

                matrixC[stIndex][ndIndex] = matrixA[stIndex][ndIndex] + matrixB[stIndex][ndIndex];
                //C
                System.out.print("[");
                System.out.print(matrixC[stIndex][ndIndex]);
                System.out.print("]");
            }
            System.out.println();
        }
    }
}
