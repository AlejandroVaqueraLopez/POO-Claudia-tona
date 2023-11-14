import java.util.Scanner;

public class pairOrInpair {
    public static void main(String[] args){
        System.out.println("Enter a number: ");

        Scanner number = new Scanner(System.in);
        int res = number.nextInt();

        if(( res %= 2) == 0){
            System.out.println("pair");
        }else {
            System.out.println("impair");
        }
    }
}
