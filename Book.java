class Book {
    String title;
    int year;
    String author;

    Book(String title, int year, String author) {

        this.title = title;
        this.year = year;
        this.author = author;
        }
        
        void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Year: " + year);
            System.out.println("Author: " + author);
        }
    }
    