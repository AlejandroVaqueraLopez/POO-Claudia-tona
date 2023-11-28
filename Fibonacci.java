import java.util.Scanner;

/**
 * Create a recursive function that makes bifonacci series
 */
public class Fibonacci {
    public static int Iteration(int limit, int prev, int current, int counter){

        int aux = prev + current;

        if(counter < limit - 1){//0,1,2
            prev = current;//1
            current = aux;//2
            counter++;
            return Iteration(limit, prev, current, counter);

        }else{
            return aux;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter a limit: ");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();

        int prev = 1;
        int current = 0;
        //System.out.println(fibonacciArray[0] + fibonacciArray[1] + fibonacciArray[2]);
        int counter = 0;

        int plus = 0;

        plus = Iteration(limit,prev, current, counter);

        System.out.println("Result: " + plus);
    }
}
