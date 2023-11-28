import java.util.Scanner;

/**
 * Create a recursive function that makes the acumulation of a limit given by the user, to 1
 */
public class IteratePlus {
    public static int Iteration(int limit, int counter, int res){

        if(counter <= limit){
            res += counter;
            counter++;
            //System.out.println(res + " " + counter);
            return Iteration(limit, counter, res);
        }else{
            return res;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter a limit: ");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();

        int counter = 1;
        int res = 0;
        int plus = 0;

        plus = Iteration(limit,counter,res);

        System.out.println("Result: " + plus);
    }
}