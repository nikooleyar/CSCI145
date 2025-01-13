import java.util.Random;
import java.awt.Rectangle;
import java.lang.module.ResolutionException;

public class Lecture3 {
    public static void main(String[] args){
        byte dayofMonth = 13; //smaller numbers (1 byte)
        short populationOfPoulsbo = 13_000; //big-ish numbers (2 bytes)
        int populationOfBellingham = 97_270; //bigger numbers (4 bytes)
        long globalPopulation = 8_230_000_000L; //biggest numbers (8 bytes)
        double pi = 3.14; // decimal (for unrealistically large decimals) (8 bytes)
        float pi2 = 3.14F; //another way for a decimal (4 bytes)
        char grade = 'A'; //character (you need to use '' for characters and "" for strings) (2 bytes)
        boolean isRaining = false; //boolean (1 bite)
        final float PI = 3.14F; //you can't change this (usaully constants are fully capitalized)

        Random randomGen = new Random();
        int randomInt = randomGen.nextInt();
        System.out.println(randomInt);  //uses random util to generate a random integer

        Rectangle rect1 = new Rectangle(10,20,50,100);
        Rectangle rect2 = rect1;
        rect1.x = 15;
        System.out.println(rect2.x); //since it's a referenced object, chaning one does change the other because they share the same address
                                    //(like lists in python)
        

        String hello = new String("Hello, World!"); //same as below
        String hello2 = "Hello, World!"; //both the same
        System.out.println(hello);
        System.out.println(hello.length()); //prints length
        System.out.println(hello.toUpperCase()); //convert to upper case
        //there are many string methods

        
        String arg1 = args[0]; //grabs first argument from the command line
        System.out.println(arg1);
        String arg2 = args[1];

        System.out.println(Integer.parseInt(arg2) + 1); //converts input to int (and then adds one)
        
        //format for terminal:
        //javac <name>.java (compliles)
        //java <name> <args> (runs file) (args if applicable)
        //
    }
}