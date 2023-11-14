//create a pdf with previews of the program and submit to teams
import java.util.Scanner;

public class grades {
    public static void main(String[] args){
        int gradesArray[];
        gradesArray = new int[4];

        int counter = 0;
        int acum = 0;
        int opc = 0;
        int lowest = 0;
        int highest = 0;

        //menu
        do{
            System.out.println("\n-----------------------------------------------------------------");
            System.out.println("1. Capture name and 4 grades ");
            System.out.println("2. Print grades and a total average ");
            System.out.println("3. Print grades and lowest grade ");
            System.out.println("4. Print grades and highest grade ");
            System.out.println("5. Exit");
            System.out.println("\n-----------------------------------------------------------------");

            Scanner input = new Scanner(System.in);
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    counter = 0;
                    while(counter < 4){
                        System.out.println("Enter the grade [" + counter + "]: ");
                        gradesArray[counter] = input.nextInt(); 

                        if(counter == 0) lowest = gradesArray[counter];

                        if(gradesArray[counter] > highest)
                            highest = gradesArray[counter];
                        
                        if(gradesArray[counter] < lowest)
                            highest = gradesArray[counter];

                        counter++;
                    }
                    break;
                case 2:
                    counter = 0;
                    acum = 0;
                    System.out.println("\n-----------------------------------------------------------------");
                    while(counter < 4){
                        System.out.println("Grade [" + counter + "]: " + gradesArray[counter]);
                        acum += gradesArray[counter];
                        counter++;
                    }
                        System.out.println("\nTotal average: " + (acum /= 4) );
                    break;
                case 3:
                    counter = 0;
                    acum = 0;
                    System.out.println("\n-----------------------------------------------------------------");
                    while(counter < 4){
                        System.out.println("Grade [" + counter + "]: " + gradesArray[counter]);
                        acum += gradesArray[counter];
                        counter++;
                    }
                        System.out.println("\nLowest grade: " + lowest );
                    break;
                case 4:
                    counter = 0;
                    acum = 0;
                    System.out.println("\n-----------------------------------------------------------------");
                    while(counter < 4){
                        System.out.println("Grade [" + counter + "]: " + gradesArray[counter]);
                        acum += gradesArray[counter];
                        counter++;
                    }
                        System.out.println("\nHighest grade: " + highest);
                    break;
                default:
                    break;
            }
        }while(opc != 5);
    }
}
