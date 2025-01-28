import java.util.Arrays;

public class Lecture8 {
    public static void main(String[] args) {
        //Arrays in Java

        //BaseType[] arrayName = new BaseType[length];  basic syntax

        int[] myArray = new int[5];

        myArray[0] = 3;
        myArray[1] = 1;
        myArray[2] = 4;
        myArray[3] = 2;
        myArray[4] = 5;

        int[]anotherArray = {3,1,4,2,5}; //same thing as above

        //cannot print array with sysout
        //instead:
        for (int i=0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println();
        System.out.println(myArray[2]);

        System.out.println(Arrays.toString(anotherArray)); //nice formated version of array using java utility

        //copying arrays
        //(wrong way)
        int [] myArray2 = myArray;
        myArray[1] = 10;
        System.out.println(Arrays.toString(myArray2)); //since its reference type, it still changes anyway

        //(right way)
        int[] myArray3 = new int[myArray.length];

        for (int i=0; i < myArray.length; i++) { //doesnt change array 3 if you change array 1 because it's not reference to the same thing anymore
            myArray3[i] = myArray[i];
        }

        System.out.println(Arrays.equals(myArray, myArray3)); //you need to use arrays utility or it compares reference location in memory for boolean

        //another for loop (for each)
        for (int num : myArray) {   //similar to python
            System.out.println(num);
        }

        //two demensional array
        int[][] twoDemArray = new int[4][3];

        int count = 1;

        for (int i=0; i < 4; i++) {
            for (int j=0; j < 3; j++) {
                twoDemArray[i][j] = count;
                count++;
            }
        }

        System.out.println(Arrays.deepToString(twoDemArray)); //uses .deepToString() or it doesn't work and prints memory location
        System.out.println(twoDemArray[2][0]); //getting singular element in array

    }
}

class Patron {
    int maxBooks = 5;
    Book[] inventory = new Book[maxBooks];

    int numOfBooksCheckedOut = 0;

    void checkout(Book book) {
        if (numOfBooksCheckedOut < maxBooks) {
            inventory[numOfBooksCheckedOut] = book;
            numOfBooksCheckedOut++;
        } else {
            System.out.println("no!");
        }
        
    }
}
