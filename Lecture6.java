public class Lecture6 {
    public static void main(String args[]) {
        //Classes

        //Class is a template that describes the behavior and state of its objects
        //Object is an instance of a class, and it has states and behaviors 

        Book mobyDick = new Book("Moby Dick", 1851); //this is making the Book object
        //mobyDick.setTitle("Moby Dick");     //after setting up a return method (parameters above dont need this)
        System.out.println(mobyDick.title);
        System.out.println(mobyDick.year);


        Book walden = new Book("Walden", 1854);
        //walden.setTitle("Walden"); (parameters above dont need this)
        System.out.println(walden.title);
        System.out.println(Book.numOfBooks);

        System.out.println(Book.compareTitle(walden, mobyDick));

    }
}

// new class (usually in a new file)
class Book {
    String title;   //defualt value of reference types is null
    int year;       //default value for int is 0
                    //default value of boolean is false
    
    static int numOfBooks = 0;
    //Static attribute belongs to class and not the object
    

    
    //returnType methodName(ParameterType parameterName) {}

    Book(String bookTitle, int bookYear) { //Constructor
        title = bookTitle;
        year = bookYear;
        numOfBooks++;
    }

    void setTitle(String bookTitle) { //Return method (?)
        title = bookTitle;
    }

    static boolean compareTitle(Book book1, Book book2) {
        return book1.title.equals(book2.title);
    }
}
