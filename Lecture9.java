import java.io.FileWriter;
import java.io.IOException;

public class Lecture9 {
    public static void main(String[] args) throws IOException{
        Book book = new Book("Moby-Dick", 1851, "Herman Melville"); //idk why its like this
        System.out.println("Writing to Files and Exceptions");

        FileWriter writer; // for finally to work with the scope
        try {
            //FileWriter writer = new FileWriter("book_storage.txt") without the thing above
            writer = new FileWriter("book_storage.txt");
            writer.write(book.getBookString());
            writer.close();
            throw new IOException(); //forces exception
        } catch (IOException e) {
            System.out.println("File Writing was not successful");
        } finally {
            writer.close();
            }
        }

        //System.out.println(1/0); //no compile error but DOES have runtime exception

        int[] array = {1,2,3};
        //int i = array[3]; //array outside of bounds exception

        String num = "five"; // number format exception
        //int num1 = Integer.parseInt(num);
        //System.out.println(num1);

        //Fixing exceptions

        //try block:
        try {
            int number = 1/0;
        } catch (Exception e) { //e can be anything, its a variable
            System.out.println("WE GOT AN EXCEPTION");
            System.out.println(e.getMessage());
        }

    
    }
} //?
    