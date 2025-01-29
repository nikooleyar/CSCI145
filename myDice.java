import java.util.Scanner;
import java.util.Random;

public class myDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Dice roll simulator!\n");
        System.out.print("Enter in the number of dice: \n");
        
        String dice = input.nextLine();

        System.out.println("Do you want a graph? (y/n): \n");

        String graph = input.nextLine();

        input.close();

        Random rand = new Random();

        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;

        for (int num = Integer.parseInt(dice); num > 0; num--) {
            int roll = rand.nextInt(1,7);
            
            switch(roll) {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
            }
            
        }

        if (graph.equalsIgnoreCase("y")) {
            System.out.println("insert graph here");
        } else if (graph.equalsIgnoreCase("n")) {
            System.out.println("no graph");
        } else {
            System.out.println("Graph failed: please enter 'y' for yes and 'n' for no.");
        }

        System.out.println("1: " + one);
        System.out.println("2: " + two);
        System.out.println("3: " + three);
        System.out.println("4: " + four);
        System.out.println("5: " + five);
        System.out.println("6: " + six);


    }
}
