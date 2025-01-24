import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Lecture7 {
    public static void main(String[] args) throws IOException {
        //Book book = new Book("Moby Dick", 1851, "Herman Melville");
        //book.displayInfo();

            File bookFile = new File("book_data.txt");
            Scanner sc = new Scanner(bookFile);

            while (sc.hasNextLine()) {
                String title = sc.nextLine().replace("title:", "");
                int year = Integer.parseInt(sc.nextLine().replace("year:", ""));
                String author = sc.nextLine().replace("author:", "");

                //Book book = new Book(title, year, author);
                //book.displayInfo();
                //sc.nextLine();
                //Book.displayInfo();
                
            }

            sc.close();

    }
    
}
